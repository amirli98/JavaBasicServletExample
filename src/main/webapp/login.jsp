<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 10/31/2020
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
<h1>
    Welcome,please login..
</h1>
<form action="login" method="post">
    login-name: <input type="text" name="login-name" width="30"/>
    password: <input type="password" name="password" placeholder="enter your password here" width="30" required>
    <input type="submit" value="Login">
</form>
</body>
</html>
