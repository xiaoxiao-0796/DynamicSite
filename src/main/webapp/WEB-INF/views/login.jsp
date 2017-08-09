<%--
  Created by IntelliJ IDEA.
  User: luowq
  Date: 2017/8/7
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/login" method="post">
        账号：<input type="text" name="username"/><br>
        密码：<input type="password" name="password"/><br>
        <input type="submit" value="登录"/>
    </form>
</body>
</html>
