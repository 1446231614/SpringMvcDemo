<%--
  Created by IntelliJ IDEA.
  User: 14462
  Date: 2019/1/18
  Time: 5:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$a</title>
  </head>
  <body>
  <form action="/test/requestGet.do" method="get">
    <input type="text" name="username">
    <input type="submit" value="get请求">
  </form>
  <br>
  <form action="/test/requestPost.do" method="post">
    <input type="submit" value="post请求">1
  </form>
  </body>
</html>
