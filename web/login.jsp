<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/18
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>


    <meta charset="UTF-8">
    <title>登录界面</title>
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
            margin-top: 100px;

        }
    </style>




</head>
<body>
<div class="outer-wrap">
    <div class="login-panel" align="center">
        用户登录注册界面
        <div class="aaa" >

            <form action="LoginServlet" method="post">
                <input type="text" name="name"><br>
                <input type="password" name="pass"><br>

                <input type="submit" value="登录">

                <input type="reset" value="重置">
            </form>
        </div>


    </div>
</div>

</body>
</html>
