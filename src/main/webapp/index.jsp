<%@ page import="java.util.Date" %>
  Created by IntelliJ IDEA.
  User: user
  Date: 10/31/2020
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Web App</title>
</head>
<body>
<h1>Hello World</h1>
<%
    Date date = new Date();
    out.println(date);
%>

</body>
</html>
