<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login</title>
        <link href="../../../resources/static/stylesheets/login.css" rel="stylesheet">
    </head>

    <body>
        <div id="container">
            <form action='' method="post">
                <h1>Login</h1>
                <input type="text" name="username" id="username" placeholder="Username">
                <br/>
                <input type="password" name="password" id="password" placehholder="password">
                <br/>
                <input type="submit" id="submit" value="Login">
            </form>

            <p>No account yet? <a href="/register" id="register-link">Register!</a></p>
        </div>
    </body>
</html>