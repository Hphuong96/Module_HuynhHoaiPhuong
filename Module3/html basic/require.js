/** vim: et:ts=4:sw=4:sts=4
 * @license RequireJS 2.1.0 Copyright (c) 2010-2012, The Dojo Foundation All Rights Reserved.
 * Available via the MIT or new BSD license.
 * see: http://github.com/jrburke/requirejs for details
 */

var requirejs,require,define;!function(global){function isFunction(e){return"[object Function]"===ostring.call(e)}function isArray(e){return"[object Array]"===ostring.call(e)}function each(e,t){if(e){var i;for(i=0;i<e.length&&(!e[i]||!t(e[i],i,e));i+=1);}}function eachReverse(e,t){if(e){var i;for(i=e.length-1;i>-1&&(!e[i]||!t(e[i],i,e));i-=1);}}function hasProp(e,t){return hasOwn.call(e,t)}function eachProp(e,t){var i;for(i in e)if(e.hasOwnProperty(i)&&t(e[i],i))break}function mixin(e,t,i,r){return t&&eachProp(t,function(t,n){(i||!hasProp(e,n))&&(r&&"string"!=typeof t?(e[n]||(e[n]={}),mixin(e[n],t,i,r)):e[n]=t)}),e}function bind(e,t){return function(){return t.apply(e,arguments)}}function scripts(){return document.getElementsByTagName("script")}function getGlobal(e){if(!e)return e;var t=global;return each(e.split("."),function(e){t=t[e]}),t}function makeError(e,t,i,r){var n=new Error(t+"\nhttp://requirejs.org/docs/errors.html#"+e);return n.requireType=e,n.requireModules=r,i&&(n.originalError=i),n}function newContext(e){function t(e){var t,i;for(t=0;e[t];t+=1)if(i=e[t],"."===i)e.splice(t,1),t-=1;else if(".."===i){if(1===t&&(".."===e[2]||".."===e[0]))break;t>0&&(e.splice(t-1,2),t-=2)}}function i(e,i,r){var n,a,o,s,u,c,d,p,f,l,h,m=i&&i.split("/"),g=m,v=y.map,x=v&&v["*"];if(e&&"."===e.charAt(0)&&(i?(g=y.pkgs[i]?m=[i]:m.slice(0,m.length-1),e=g.concat(e.split("/")),t(e),a=y.pkgs[n=e[0]],e=e.join("/"),a&&e===n+"/"+a.main&&(e=n)):0===e.indexOf("./")&&(e=e.substring(2))),r&&(m||x)&&v){for(s=e.split("/"),u=s.length;u>0;u-=1){if(d=s.slice(0,u).join("/"),m)for(c=m.length;c>0;c-=1)if(o=v[m.slice(0,c).join("/")],o&&(o=o[d])){p=o,f=u;break}if(p)break;!l&&x&&x[d]&&(l=x[d],h=u)}!p&&l&&(p=l,f=h),p&&(s.splice(0,f,p),e=s.join("/"))}return e}function r(e){isBrowser&&each(scripts(),function(t){return t.getAttribute("data-requiremodule")===e&&t.getAttribute("data-requirecontext")===b.contextName?(t.parentNode.removeChild(t),!0):void 0})}function n(e){var t=y.paths[e];return t&&isArray(t)&&t.length>1?(r(e),t.shift(),b.require.undef(e),b.require([e]),!0):void 0}function a(e){var t,i=e?e.indexOf("!"):-1;return i>-1&&(t=e.substring(0,i),e=e.substring(i+1,e.length)),[t,e]}function o(e,t,r,n){var o,s,u,c,d=null,p=t?t.name:null,f=e,l=!0,h="";return e||(l=!1,e="_@r"+(A+=1)),c=a(e),d=c[0],e=c[1],d&&(d=i(d,p,n),s=w[d]),e&&(d?h=s&&s.normalize?s.normalize(e,function(e){return i(e,p,n)}):i(e,p,n):(h=i(e,p,n),c=a(h),d=c[0],h=c[1],r=!0,o=b.nameToUrl(h))),u=!d||s||r?"":"_unnormalized"+(T+=1),{prefix:d,name:h,parentMap:t,unnormalized:!!u,url:o,originalName:f,isDefine:l,id:(d?d+"!"+h:h)+u}}function s(e){var t=e.id,i=k[t];return i||(i=k[t]=new b.Module(e)),i}function u(e,t,i){var r=e.id,n=k[r];!hasProp(w,r)||n&&!n.defineEmitComplete?s(e).on(t,i):"defined"===t&&i(w[r])}function c(e,t){var i=e.requireModules,r=!1;t?t(e):(each(i,function(t){var i=k[t];i&&(i.error=e,i.events.error&&(r=!0,i.emit("error",e)))}),r||req.onError(e))}function d(){globalDefQueue.length&&(apsp.apply(S,[S.length-1,0].concat(globalDefQueue)),globalDefQueue=[])}function p(e){delete k[e]}function f(e,t,i){var r=e.map.id;e.error?e.emit("error",e.error):(t[r]=!0,each(e.depMaps,function(r,n){var a=r.id,o=k[a];!o||e.depMatched[n]||i[a]||(t[a]?(e.defineDep(n,w[a]),e.check()):f(o,t,i))}),i[r]=!0)}function l(){var e,t,i,a,o=1e3*y.waitSeconds,s=o&&b.startTime+o<(new Date).getTime(),u=[],d=[],p=!1,h=!0;if(!v){if(v=!0,eachProp(k,function(i){if(e=i.map,t=e.id,i.enabled&&(e.isDefine||d.push(i),!i.error))if(!i.inited&&s)n(t)?(a=!0,p=!0):(u.push(t),r(t));else if(!i.inited&&i.fetched&&e.isDefine&&(p=!0,!e.prefix))return h=!1}),s&&u.length)return i=makeError("timeout","Load timeout for modules: "+u,null,u),i.contextName=b.contextName,c(i);h&&each(d,function(e){f(e,{},{})}),s&&!a||!p||!isBrowser&&!isWebWorker||E||(E=setTimeout(function(){E=0,l()},50)),v=!1}}function h(e){s(o(e[0],null,!0)).init(e[1],e[2])}function m(e,t,i,r){e.detachEvent&&!isOpera?r&&e.detachEvent(r,t):e.removeEventListener(i,t,!1)}function g(e){var t=e.currentTarget||e.srcElement;return m(t,b.onScriptLoad,"load","onreadystatechange"),m(t,b.onScriptError,"error"),{node:t,id:t&&t.getAttribute("data-requiremodule")}}var v,x,b,q,E,y={waitSeconds:7,baseUrl:"./",paths:{},pkgs:{},shim:{}},k={},M={},S=[],w={},j={},A=1,T=1;return q={require:function(e){return e.require?e.require:e.require=b.makeRequire(e.map)},exports:function(e){return e.usingExports=!0,e.map.isDefine?e.exports?e.exports:e.exports=w[e.map.id]={}:void 0},module:function(e){return e.module?e.module:e.module={id:e.map.id,uri:e.map.url,config:function(){return y.config&&y.config[e.map.id]||{}},exports:w[e.map.id]}}},x=function(e){this.events=M[e.id]||{},this.map=e,this.shim=y.shim[e.id],this.depExports=[],this.depMaps=[],this.depMatched=[],this.pluginMaps={},this.depCount=0},x.prototype={init:function(e,t,i,r){r=r||{},this.inited||(this.factory=t,i?this.on("error",i):this.events.error&&(i=bind(this,function(e){this.emit("error",e)})),this.depMaps=e&&e.slice(0),this.errback=i,this.inited=!0,this.ignore=r.ignore,r.enabled||this.enabled?this.enable():this.check())},defineDep:function(e,t){this.depMatched[e]||(this.depMatched[e]=!0,this.depCount-=1,this.depExports[e]=t)},fetch:function(){if(!this.fetched){this.fetched=!0,b.startTime=(new Date).getTime();var e=this.map;return this.shim?(b.makeRequire(this.map,{enableBuildCallback:!0})(this.shim.deps||[],bind(this,function(){return e.prefix?this.callPlugin():this.load()})),void 0):e.prefix?this.callPlugin():this.load()}},load:function(){var e=this.map.url;j[e]||(j[e]=!0,b.load(this.map.id,e))},check:function(){if(this.enabled&&!this.enabling){var e,t,i=this.map.id,r=this.depExports,n=this.exports,a=this.factory;if(this.inited){if(this.error)this.emit("error",this.error);else if(!this.defining){if(this.defining=!0,this.depCount<1&&!this.defined){if(isFunction(a)){if(this.events.error)try{n=b.execCb(i,a,r,n)}catch(o){e=o}else n=b.execCb(i,a,r,n);if(this.map.isDefine&&(t=this.module,t&&void 0!==t.exports&&t.exports!==this.exports?n=t.exports:void 0===n&&this.usingExports&&(n=this.exports)),e)return e.requireMap=this.map,e.requireModules=[this.map.id],e.requireType="define",c(this.error=e)}else n=a;this.exports=n,this.map.isDefine&&!this.ignore&&(w[i]=n,req.onResourceLoad&&req.onResourceLoad(b,this.map,this.depMaps)),delete k[i],this.defined=!0}this.defining=!1,this.defined&&!this.defineEmitted&&(this.defineEmitted=!0,this.emit("defined",this.exports),this.defineEmitComplete=!0)}}else this.fetch()}},callPlugin:function(){var e=this.map,t=e.id,r=o(e.prefix);this.depMaps.push(r),u(r,"defined",bind(this,function(r){var n,a,d,f=this.map.name,l=this.map.parentMap?this.map.parentMap.name:null,h=b.makeRequire(e.parentMap,{enableBuildCallback:!0,skipMap:!0});return this.map.unnormalized?(r.normalize&&(f=r.normalize(f,function(e){return i(e,l,!0)})||""),a=o(e.prefix+"!"+f,this.map.parentMap),u(a,"defined",bind(this,function(e){this.init([],function(){return e},null,{enabled:!0,ignore:!0})})),d=k[a.id],d&&(this.depMaps.push(a),this.events.error&&d.on("error",bind(this,function(e){this.emit("error",e)})),d.enable()),void 0):(n=bind(this,function(e){this.init([],function(){return e},null,{enabled:!0})}),n.error=bind(this,function(e){this.inited=!0,this.error=e,e.requireModules=[t],eachProp(k,function(e){0===e.map.id.indexOf(t+"_unnormalized")&&p(e.map.id)}),c(e)}),n.fromText=bind(this,function(t,i){var r=e.name,a=o(r),u=useInteractive;i&&(t=i),u&&(useInteractive=!1),s(a);try{req.exec(t)}catch(c){throw new Error("fromText eval for "+r+" failed: "+c)}u&&(useInteractive=!0),this.depMaps.push(a),b.completeLoad(r),h([r],n)}),r.load(e.name,h,n,y),void 0)})),b.enable(r,this),this.pluginMaps[r.id]=r},enable:function(){this.enabled=!0,this.enabling=!0,each(this.depMaps,bind(this,function(e,t){var i,r,n;if("string"==typeof e){if(e=o(e,this.map.isDefine?this.map:this.map.parentMap,!1,!this.skipMap),this.depMaps[t]=e,n=q[e.id])return this.depExports[t]=n(this),void 0;this.depCount+=1,u(e,"defined",bind(this,function(e){this.defineDep(t,e),this.check()})),this.errback&&u(e,"error",this.errback)}i=e.id,r=k[i],q[i]||!r||r.enabled||b.enable(e,this)})),eachProp(this.pluginMaps,bind(this,function(e){var t=k[e.id];t&&!t.enabled&&b.enable(e,this)})),this.enabling=!1,this.check()},on:function(e,t){var i=this.events[e];i||(i=this.events[e]=[]),i.push(t)},emit:function(e,t){each(this.events[e],function(e){e(t)}),"error"===e&&delete this.events[e]}},b={config:y,contextName:e,registry:k,defined:w,urlFetched:j,defQueue:S,Module:x,makeModuleMap:o,nextTick:req.nextTick,configure:function(e){e.baseUrl&&"/"!==e.baseUrl.charAt(e.baseUrl.length-1)&&(e.baseUrl+="/");var t=y.pkgs,i=y.shim,r=y.paths,n=y.map;mixin(y,e,!0),y.paths=mixin(r,e.paths,!0),e.map&&(y.map=mixin(n||{},e.map,!0,!0)),e.shim&&(eachProp(e.shim,function(e,t){isArray(e)&&(e={deps:e}),e.exports&&!e.exportsFn&&(e.exportsFn=b.makeShimExports(e)),i[t]=e}),y.shim=i),e.packages&&(each(e.packages,function(e){var i;e="string"==typeof e?{name:e}:e,i=e.location,t[e.name]={name:e.name,location:i||e.name,main:(e.main||"main").replace(currDirRegExp,"").replace(jsSuffixRegExp,"")}}),y.pkgs=t),eachProp(k,function(e,t){e.inited||e.map.unnormalized||(e.map=o(t))}),(e.deps||e.callback)&&b.require(e.deps||[],e.callback)},makeShimExports:function(e){function t(){var t;return e.init&&(t=e.init.apply(global,arguments)),t||getGlobal(e.exports)}return t},makeRequire:function(t,r){function n(i,a,u){var p,f,m,g;if(r.enableBuildCallback&&a&&isFunction(a)&&(a.__requireJsBuild=!0),"string"==typeof i)return isFunction(a)?c(makeError("requireargs","Invalid require call"),u):t&&q[i]?q[i](k[t.id]):req.get?req.get(b,i,t):(f=o(i,t,!1,!0),p=f.id,hasProp(w,p)?w[p]:c(makeError("notloaded",'Module name "'+p+'" has not been loaded yet for context: '+e+(t?"":". Use require([])"))));for(d();S.length;){if(g=S.shift(),null===g[0])return c(makeError("mismatch","Mismatched anonymous define() module: "+g[g.length-1]));h(g)}return b.nextTick(function(){m=s(o(null,t)),m.skipMap=r.skipMap,m.init(i,a,u,{enabled:!0}),l()}),n}return r=r||{},mixin(n,{isBrowser:isBrowser,toUrl:function(e){var r=e.lastIndexOf("."),n=null;return-1!==r&&(n=e.substring(r,e.length),e=e.substring(0,r)),b.nameToUrl(i(e,t&&t.id,!0),n)},defined:function(e){return hasProp(w,o(e,t,!1,!0).id)},specified:function(e){return e=o(e,t,!1,!0).id,hasProp(w,e)||hasProp(k,e)}}),t||(n.undef=function(e){d();var i=o(e,t,!0),r=k[e];delete w[e],delete j[i.url],delete M[e],r&&(r.events.defined&&(M[e]=r.events),p(e))}),n},enable:function(e){var t=k[e.id];t&&s(e).enable()},completeLoad:function(e){var t,i,r,a=y.shim[e]||{},o=a.exports;for(d();S.length;){if(i=S.shift(),null===i[0]){if(i[0]=e,t)break;t=!0}else i[0]===e&&(t=!0);h(i)}if(r=k[e],!t&&!w[e]&&r&&!r.inited){if(!(!y.enforceDefine||o&&getGlobal(o)))return n(e)?void 0:c(makeError("nodefine","No define call for "+e,null,[e]));h([e,a.deps||[],a.exportsFn])}l()},nameToUrl:function(e,t){var i,r,n,a,o,s,u,c,d;if(req.jsExtRegExp.test(e))c=e+(t||"");else{for(i=y.paths,r=y.pkgs,o=e.split("/"),s=o.length;s>0;s-=1){if(u=o.slice(0,s).join("/"),n=r[u],d=i[u]){isArray(d)&&(d=d[0]),o.splice(0,s,d);break}if(n){a=e===n.name?n.location+"/"+n.main:n.location,o.splice(0,s,a);break}}c=o.join("/"),c+=t||(/\?/.test(c)?"":".js"),c=("/"===c.charAt(0)||c.match(/^[\w\+\.\-]+:/)?"":y.baseUrl)+c}return y.urlArgs?c+((-1===c.indexOf("?")?"?":"&")+y.urlArgs):c},load:function(e,t){req.load(b,e,t)},execCb:function(e,t,i,r){return t.apply(r,i)},onScriptLoad:function(e){if("load"===e.type||readyRegExp.test((e.currentTarget||e.srcElement).readyState)){interactiveScript=null;var t=g(e);b.completeLoad(t.id)}},onScriptError:function(e){var t=g(e);return n(t.id)?void 0:c(makeError("scripterror","Script error",e,[t.id]))}},b.require=b.makeRequire(),b}function getInteractiveScript(){return interactiveScript&&"interactive"===interactiveScript.readyState?interactiveScript:(eachReverse(scripts(),function(e){return"interactive"===e.readyState?interactiveScript=e:void 0}),interactiveScript)}var req,s,head,baseElement,dataMain,src,interactiveScript,currentlyAddingScript,mainScript,subPath,version="2.1.0",commentRegExp=/(\/\*([\s\S]*?)\*\/|([^:]|^)\/\/(.*)$)/gm,cjsRequireRegExp=/[^.]\s*require\s*\(\s*["']([^'"\s]+)["']\s*\)/g,jsSuffixRegExp=/\.js$/,currDirRegExp=/^\.\//,op=Object.prototype,ostring=op.toString,hasOwn=op.hasOwnProperty,ap=Array.prototype,aps=ap.slice,apsp=ap.splice,isBrowser=!("undefined"==typeof window||!navigator||!document),isWebWorker=!isBrowser&&"undefined"!=typeof importScripts,readyRegExp=isBrowser&&"PLAYSTATION 3"===navigator.platform?/^complete$/:/^(complete|loaded)$/,defContextName="_",isOpera="undefined"!=typeof opera&&"[object Opera]"===opera.toString(),contexts={},cfg={},globalDefQueue=[],useInteractive=!1;if("undefined"==typeof define){if("undefined"!=typeof requirejs){if(isFunction(requirejs))return;cfg=requirejs,requirejs=void 0}"undefined"==typeof require||isFunction(require)||(cfg=require,require=void 0),req=requirejs=function(e,t,i,r){var n,a,o=defContextName;return isArray(e)||"string"==typeof e||(a=e,isArray(t)?(e=t,t=i,i=r):e=[]),a&&a.context&&(o=a.context),n=contexts[o],n||(n=contexts[o]=req.s.newContext(o)),a&&n.configure(a),n.require(e,t,i)},req.config=function(e){return req(e)},req.nextTick="undefined"!=typeof setTimeout?function(e){setTimeout(e,4)}:function(e){e()},require||(require=req),req.version=version,req.jsExtRegExp=/^\/|:|\?|\.js$/,req.isBrowser=isBrowser,s=req.s={contexts:contexts,newContext:newContext},req({}),each(["toUrl","undef","defined","specified"],function(e){req[e]=function(){var t=contexts[defContextName];return t.require[e].apply(t,arguments)}}),isBrowser&&(head=s.head=document.getElementsByTagName("head")[0],baseElement=document.getElementsByTagName("base")[0],baseElement&&(head=s.head=baseElement.parentNode)),req.onError=function(e){throw e},req.load=function(e,t,i){var r,n=e&&e.config||{};return isBrowser?(r=n.xhtml?document.createElementNS("http://www.w3.org/1999/xhtml","html:script"):document.createElement("script"),r.type=n.scriptType||"text/javascript",r.charset="utf-8",r.async=!0,r.setAttribute("data-requirecontext",e.contextName),r.setAttribute("data-requiremodule",t),!r.attachEvent||r.attachEvent.toString&&r.attachEvent.toString().indexOf("[native code")<0||isOpera?(r.addEventListener("load",e.onScriptLoad,!1),r.addEventListener("error",e.onScriptError,!1)):(useInteractive=!0,r.attachEvent("onreadystatechange",e.onScriptLoad)),r.src=i,currentlyAddingScript=r,baseElement?head.insertBefore(r,baseElement):head.appendChild(r),currentlyAddingScript=null,r):(isWebWorker&&(importScripts(i),e.completeLoad(t)),void 0)},isBrowser&&eachReverse(scripts(),function(e){return head||(head=e.parentNode),dataMain=e.getAttribute("data-main"),dataMain?(cfg.baseUrl||(src=dataMain.split("/"),mainScript=src.pop(),subPath=src.length?src.join("/")+"/":"./",cfg.baseUrl=subPath,dataMain=mainScript),dataMain=dataMain.replace(jsSuffixRegExp,""),cfg.deps=cfg.deps?cfg.deps.concat(dataMain):[dataMain],!0):void 0}),define=function(e,t,i){var r,n;"string"!=typeof e&&(i=t,t=e,e=null),isArray(t)||(i=t,t=[]),!t.length&&isFunction(i)&&i.length&&(i.toString().replace(commentRegExp,"").replace(cjsRequireRegExp,function(e,i){t.push(i)}),t=(1===i.length?["require"]:["require","exports","module"]).concat(t)),useInteractive&&(r=currentlyAddingScript||getInteractiveScript(),r&&(e||(e=r.getAttribute("data-requiremodule")),n=contexts[r.getAttribute("data-requirecontext")])),(n?n.defQueue:globalDefQueue).push([e,t,i])},define.amd={jQuery:!0},req.exec=function(text){return eval(text)},req(cfg)}}(this);