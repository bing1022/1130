<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/9/22
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="ZhangWuServlet" method="post">
    <input type="hidden" value="update" name="type_value">
    <table align="center" border="0">

        
        <tr><td>账单号</td><td><input type="text" name="zwid"></td></tr>
        <tr><td>账单名称</td><td><input type="text" name="flname"></td></tr>
        <tr><td>账单金额</td><td><input type="text" name="money"></td></tr>
        <tr><td>支付方式</td><td><input type="text" name="zhangHu"></td></tr>
        <tr><td>账单时间</td><td><input type="text" name="createtime"></td></tr>
        <tr><td>账单描述</td><td><input type="text" name="description"></td></tr>
        <tr><td></td><td><input type="submit" value="修改账单信息">&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"></td></tr>



    </table>

</form>
</body>
</html>
