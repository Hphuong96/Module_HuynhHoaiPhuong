<%--
  Created by IntelliJ IDEA.
  User: BLUE
  Date: 12/3/2019
  Time: 10:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        /*fieldset{*/
        /*    border: 1px solid rgb(255,232,57);*/
        /*    width: 400px;*/
        /*    margin:0 auto;*/
        /*    text-align: left;*/
        /*    padding-right: 5em;*/
        /*}*/
        fieldset.scheduler-border {
            width: 500px;
            border: 5px solid rgb(255,65,98);
            padding: 0 1.4em 1.4em 1.4em !important;
            margin: 0 auto;
            -webkit-box-shadow:  0 0 0 0 #000;
            box-shadow:  0 0 0 0 #000;
            text-align: center;
        }

        legend.scheduler-border {
            font-size: 1.2em ;
            font-weight: bold ;
            text-align: left ;
            width:auto;
            padding:0 10px;
            border-bottom:none;
        }
    </style>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.devbridge-autocomplete/1.2.27/jquery.autocomplete.min.js"></script></head>
<body>

<fieldset class="scheduler-border">
    <legend class="scheduler-border">USD To VND Exchange</legend>
    <form method="post" action="/index">
        <div class="form-group">
            <label >Exchange Rate </label>
            <input type="text" class="form-control" name="rate" id="rate" placeholder="Input Exchange Rate" value="${rate}">
        </div>
        <div class="form-group">
            <label >USD</label>
            <input type="text" class="form-control" name="usd" id="usd" placeholder="Input Usd" value="${usd}">
        </div>
        <div class="form-group">
            <label >VND</label>
            <p>${vnd}</p>
        </div>
        <div class="form-group row">
            <div class="offset-sm-2 col-sm-7 pull-right">
                <button type="submit" class="btn btn-primary">Converter!!!</button>
            </div>
        </div>
    </form>
</fieldset>
<%--<fieldset style="width: 500px" class="scheduler-border">--%>
<%--    <legend class="scheduler-border">Money Exchange</legend>--%>
<%--    <form>--%>
<%--        <div class="form-group">--%>
<%--            <label for="formGroupExampleInput">RATE</label>--%>
<%--            <input type="text" class="form-control" id="formGroupExampleInput" placeholder="Exchange Rate">--%>
<%--        </div>--%>
<%--&lt;%&ndash;        <div class="form-group">&ndash;%&gt;--%>
<%--&lt;%&ndash;            <table >&ndash;%&gt;--%>
<%--&lt;%&ndash;                RATE : <input type="text" name="usd" placeholder="Exchange Rate"><br>&ndash;%&gt;--%>
<%--&lt;%&ndash;                VND : ${money} <br>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <input type = "submit" id = "submit" value = "Converter"/>&ndash;%&gt;--%>
<%--&lt;%&ndash;            </table>&ndash;%&gt;--%>
<%--&lt;%&ndash;        </div>&ndash;%&gt;--%>
<%--    </form>--%>
<%--</fieldset>--%>
</body>
</html>
