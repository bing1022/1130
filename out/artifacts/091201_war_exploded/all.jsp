<%@ page import="gjp.domain.zhangwu" %>
<%@ page import="java.util.List" %>

<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/9/22
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<zhangwu> list=(List<zhangwu>) request.getAttribute("list");
%>


<table border="1" align="center">
    <tr><td>账单号</td><td>账单名称</td><td>账单金额</td><td>支付方式</td><td>账单时间</td><td>账单描述</td></tr>
    <%
        for (int i=0;i<list.size();i++)
        {
            zhangwu zw=list.get(i);

    %>
    <tr><td><%=zw.getZwid()%></td><td><%=zw.getFlname()%></td><td><%=zw.getMoney()%></td><td><%=zw.getZhangHu()%></td><td><%=zw.getCreatetime()%></td><td><%=zw.getDescription()%></td></tr>
    <%
        }
    %>

</table>
</body>
</html>
