<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Cheshir
  Date: 22.12.2018
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer form</title>
    <style>
        .error {
            color: red
        }
    </style>
</head>
<body>
<form:form action="/processForm" modelAttribute="customer">
    <table>
        <tr>
            <td>First name:</td>
            <td><form:input path="firstName"/>
                <form:errors path="firstName" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Last name:</td>
            <td><form:input path="lastName"/></td>
        </tr>
        <tr>
            <td>Cost:</td>
            <td><form:input path="cost"/>
                <form:errors path="cost" cssClass="error"/></td>
        </tr>
        <tr>
            <td>Email code:</td>
            <td><form:input path="email"/>
                <form:errors path="email" cssClass="error"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>

</body>
</html>
