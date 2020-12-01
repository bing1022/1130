<%@ page import="gjp.domain.zhangwu" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/9/22
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    zhangwu zw=(zhangwu)request.getAttribute("zw");
%>
<table border="1px" align="center">
    <tr>

        <td>账单名称</td>
        <td>账单金额</td>
        <td>支付方式</td>
        <td>账单时间</td>
        <td>账单描述</td>
    </tr>
    <tr>
        <td><%=zw.getFlname()%></td>
        <td><%=zw.getMoney() %></td>
        <td><%=zw.getZhangHu() %></td>
        <td><%=zw.getCreatetime() %></td>
        <td><%=zw.getDescription() %></td>
    </tr>
</table>
</body>
</html>
