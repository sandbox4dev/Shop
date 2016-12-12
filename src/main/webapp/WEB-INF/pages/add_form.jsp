<%--
  Created by IntelliJ IDEA.
  User: Администратор
  Date: 12.12.2016
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Добавить пользователя</title>
</head>
<body>
<form:form method="POST" action="/add" modelAttribute="user">
    <form:hidden path="id"/>
    <table>
        <tr>
        <td>Login:</td>
        <td><form:input path="login" /></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><form:input path="password" /></td>
        </tr>
        <tr>
            <td>E-mail</td>
            <td><form:input path="email" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit">
            </td>
        </tr>

    </table>
</form:form>

</body>
</html>
