<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2020/9/21
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/ZhangWuServlet" method="post">
    <input type="hidden" value="delete" name="type_value">
    <table>
        <tr><td>要删除的账单id:</td><td><input type="text" name="zwid"></td></tr>
        <tr><td></td><td><input type="submit" value="删除"><input type="button" value="重置"></td></tr>

    </table>

</form>
</body>
</html>
