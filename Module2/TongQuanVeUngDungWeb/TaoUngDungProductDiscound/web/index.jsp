<%--
  Created by IntelliJ IDEA.
  User: BLUE
  Date: 11/21/2019
  Time: 8:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      #content{
        width: 450px;
        margin: 0 auto;
        padding: 0px 20px 20px;
        background: white;
        border: solid navy 5px;
      }
      label{
        width: 10em;
        padding-right: 5em;
        float: left;
      }
      #data input{
        float: left;
        width: 12em;
        margin-bottom: .5em;
      }
    </style>
  </head>
  <body>
  <div id="content">
    <h1>Product discount calculator</h1>
    <form action="/result" method="post">
      <div id="data">
        <label>Product Description</label>
        <input type="text" name="description">
        <br>
        <label>Price</label>
        <input type="text" name="price">
        <br>
        <label>Discount Percent</label>
        <input type="text" name="discount">
      </div>
      <div>
        <br>
        <input type="submit" value="Discount">
      </div>
    </form>
  </div>
  </body>
</html>
