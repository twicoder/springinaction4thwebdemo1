<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: renqingwei
  Date: 2018/5/10
  Time: 下午5:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page session="false" %>
<html>
    <head>
        <title>Spittr</title>
        <link rel="stylesheet" type="text/css"
              href="<c:url value="/resources/style.css" />" >
    </head>
    <body>
        <h1>Welcome to Spittr</h1>

        <a href="<c:url value="/spittles" />">Spittles</a> |
        <a href="<c:url value="/spitter/register" />">Register</a>
    </body>
</html>