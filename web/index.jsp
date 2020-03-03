<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/2
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<%--<script src="js/jquery-3.4.1.min.js"></script>--%>
<body>
<script>
    function tijiao() {
        $.ajax({
          url:'/a/b',
          data:{id:$("#id").val(),username:$("#username").val(),password:$("#password").val()},
          type:'get',
          dataType:'json',
          success:function (data) {
            console.log(data);
          }
        })

    }
</script>
<form action="a/b">
    <input type="submit" value="ceshi">
</form>
<div>
    ID：<input type="text" id="id">
</div>
<div>
    用户名：<input type="text" id="username">
</div>
<div>
    密码：<input type="password" id="password">
</div>
<div>
    <input type="button" value="提交" onclick="tijiao()">
</div>
</body>
</html>
