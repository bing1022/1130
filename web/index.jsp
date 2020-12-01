<%@ page import="org.springframework.context.ApplicationContext" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/9/22
  Time: 0:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>









<html lang="en">
<head>
  <meta charset="UTF-8">
  <title></title>
  <style type="text/css">
    *{margin: 0;padding: 0}
    html,body{height: 100%}     /*这里很关键*/

    .outer-wrap{
      /*只有同时为html和body设置height: 100%时，这里的height才生效，
      并且随浏览器窗口变化始终保持和浏览器视窗等高*/
      height: 100%;
      position: relative;
      background-color: rgba(0, 0, 0, .5);
    }
    .login-panel{
      width: 400px;
      height: 300px;
      background-color: red;
      position: absolute;
      top: 50%;
      left: 50%;
      margin-top: -150px;
      margin-left: -200px;
    }


    .aaa{
      margin-top: 60px;

    }
  </style>
</head>
<body>
<div class="outer-wrap">
  <div class="login-panel">

    <div class="aaa" align="center">
      <table border="0" align="center" >

        <tr><td><h2><a href="addzhangwu.jsp">新增账单</a></h2></td></tr>
        <tr><td><h2><a href="deletezhangwu.jsp">删除账单</a></h2></td></tr>
        <tr><td><h2><a href="update.jsp">修改账单信息</a></h2></td></tr>
        <tr><td><h2><a href="findzhuangwu.jsp">查找账单</a></h2></td></tr>
        <tr><td><h2><a href="ZhangWuServlet?type_value=showall">显示全部账单</a></h2></td></tr>
      </table>
    </div>

  </div>



</div>
</body>
</html>
