<%--
  Created by IntelliJ IDEA.
  User: Surface Pro 4
  Date: 2018/10/24
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Validate</title>
</head>
<h1 align="center" style="padding-top: 30px">Validater</h1>
<br>
<% String color = "red";
if (request.getAttribute("color")!=null){
    color ="green";
}%>
<h2 align="center" style="color:<%=color%> ">${log}</h2>
<body>
<div style="width: 30%;text-align: center; margin: auto;">
    <form method="post">
        <input type="text" name="email" placeholder="example@email.com">
        <input type="submit" value="Check">
    </form>
</div>
</body>
</html>
