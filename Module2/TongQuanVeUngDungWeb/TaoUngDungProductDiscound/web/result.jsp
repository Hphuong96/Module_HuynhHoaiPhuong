<%--
  Created by IntelliJ IDEA.
  User: BLUE
  Date: 11/23/2019
  Time: 4:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<%
    String description = request.getParameter("description");
    Double price = Double.parseDouble(request.getParameter("price"));
    Double discountPercent = Double.parseDouble(request.getParameter("discount"));
    double discount = (price * discountPercent)/100;
    double total = price - discount;
%>
<h1>Product Description:<%=description%></h1>
<h1>Product Price:<%=price%></h1>
<h1>Product Discount Percent:<%=discountPercent%></h1>
<h1>Product Total Pay:<%=total%></h1>
</body>
</html>
