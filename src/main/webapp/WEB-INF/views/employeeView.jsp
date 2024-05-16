<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Submitted Employee Information</h2>
<h3>${msg}</h3>
<table>
    <tr>
        <td>ID :</td>
        <td>${id}</td>
    </tr>
    <tr>
        <td>Name :</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>Contact Number :</td>
        <td>${contactNumber}</td>
    </tr>
    <tr>
        <td>Office :</td>
        <td>${office}</td>
    </tr>
</table>
</body>
</html>