<%--
  Created by IntelliJ IDEA.
  User: kongz
  Date: 2018/12/22
  Time: 1:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <script>
        function checkValues() {
            if (document.getElementById('username').value == ''){
                alert('username can not be null');
                return false;
            } else if (document.getElementById('password').value == '') {
                alert('password can not be null');
                return false;
            } else {
                return true;
            }
        }
    </script>
</head>

<body>
    <h1>Login</h1>
    <form action="login" method="post" onsubmit="return checkValues()">
        <table>
            username: <input id="username" name="username"><br>
            password: <input id="password" name="password"><br>
            <input type="submit" value="login">
            <input type="reset" value="reset">
        </table>
    </form>



</body>
</html>
