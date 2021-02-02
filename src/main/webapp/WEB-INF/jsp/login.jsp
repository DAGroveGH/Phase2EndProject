<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login</title>
        <link href="../css/login.css" rel="stylesheet" type="text/css">
    </head>

    <body>
        <div id="container">
            <h1>Login</h1>
            <form action='' method="post">
                <input type="text" name="username" id="username" placeholder="Username">
                <br/>
                <input type="password" name="password" id="password" >
                <br/>
                <input type="submit" id="submit" value="Login">
            </form>

            <p>No account yet? <a href="/register" id="register-link">Register!</a></p>
        </div>
    </body>
</html>