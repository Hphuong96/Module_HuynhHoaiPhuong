let tempereture = function () {
    this.settempC = function (tempC) {
        this.tempC = tempC
    };
    this.gettempC = function () {
        return this.tempC
    };
    this.settempF = function (tempF) {
        this.tempF = tempF
    };
    this.gettempF = function () {
        return this.tempF
    };
    this.settempK = function (tempK) {
        this.tempK = tempK
    };
    this.gettempK = function () {
        return this.tempK
    };
    this.cToF = function () {
        return 1.8 * this.tempC + 32
    };
    this.cToK = function () {
        return this.tempC + 273.15
    };
    this.fToK = function () {
        return (this.tempF -32)*5/9 + 273.15
    };
    this.fToC = function () {
        return (this.tempF -32)*5/9
    };
    this.kToC = function () {
        return this.tempK - 273.15
    };
    this.kToF = function () {
        return (this.tempK -273.15)*9/5 + 32
    };
};