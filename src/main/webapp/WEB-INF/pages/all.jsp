<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 12.12.2016
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Все пользователи</title>
</head>
<body>
<table width="600px">
    <tr>
        <td>ID</td>
        <td>Login</td>
        <td>Email</td>
        <td>Action</td>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td>${user.login}</td>
            <td>${user.email}</td>
            <td><a href="/edit?id=${user.id}">Edit</a> | <a href="/delete?id=${user.id}">Delete</a> </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="5">
            <a href="/add">Add row</a>
        </td>
    </tr>
</table>

</body>
</html>
