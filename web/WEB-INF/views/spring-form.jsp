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
        .form {margin-left : 100px}
    </style>
</head>
<body>
<form:form action="/processForm" modelAttribute="customer">
    <div> First name:
        <form:input path="firstName" cssClass="form"/>
        <form:errors path="firstName" cssClass="error"/>
    </div>
    <div> Last name:
        <form:input path="lastName" cssClass="form"/>
    </div>
    <div> Cost:
        <form:input path="cost" cssClass="form"/>
        <form:errors path="cost" cssClass="error"/>
    </div>
    <div> Email code:
        <form:input path="email" cssClass="form"/>
        <form:errors path="email" cssClass="error"/>
    </div>
    <input type="submit" value="Submit"/>

</form:form>

</body>
</html>
