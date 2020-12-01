<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/9/22
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/ZhangWuServlet" method="post">
    <input value="find" name="type_value" hidden>
    <table align="center">
        <tr>
            <td>账单id</td>
            <td><input type="text" name="zwid"></td>
        </tr>
        <tr>
            <td><input value="查找" type="submit"></td>
            <td><input value="重置" type="reset"></td>
        </tr>
    </table>
</form>
</body>
</html>
