<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Register</title>
        <link href="../../../resources/static/stylesheets/register.css" rel="stylesheet">
    </head>

    <body>
        <div id="container">
            <form action='' method="post">
                <h1>Account Registration</h1>
                <input type="text" name="username" id="username" placeholder="Enter a username...">
                <br/>
                <input type="password" name="password" id="password" placeholder="Enter a password...">
                <br/>
                <input type="submit" value="Sign Up!" id="register-submit">
            </form>

            <p>Already registered?<a href="/login">Login!</a></p>
        </div>
    </body>
</html>