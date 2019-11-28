<%--
  Created by IntelliJ IDEA.
  User: BLUE
  Date: 11/22/2019
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<style>
    fieldset {
    }
</style>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<fieldset style="width:70% " >
    <legend>Danh sach khach hang</legend>
    <table class="table" >
        <thead>
        <tr>
            <th scope="col">ID CARD</th>
            <th scope="col">NAME</th>
            <th scope="col">ADDRESS</th>
        </tr>
        </thead>
<%--        <tr >--%>
<%--            <td width="150">ID Card </td>--%>
<%--            <td width="150">Name </td>--%>
<%--            <td width="150">Address </td>--%>
<%--        </tr>--%>
<%--        <hr>--%>

    <c:forEach var="customer" items="${customers}">
        <tr>
        <td>${customer.id}</td>
        <td>${customer.name}</td>
        <td>${customer.address}</td>
        <td><a href="${pageContext.request.contextPath}/customer?action=edit&id=${customer.id}">Edit</a> </td>
        </tr>
    </c:forEach>
    </table>
</fieldset>
</body>
</html>


<%--<c:forEach var="customer" items="${customers}">--%>
<%--    <tr>--%>
<%--        <td>${customer.id}</td>--%>
<%--        <td>${customer.nameCustomer}</td>--%>
<%--        <td>${customer.address}</td>--%>
<%--        <td><a href="/customer?action=edit&id=${customer.id}">Edit</a> </td>--%>
<%--    </tr>--%>
<%--</c:forEach>--%>