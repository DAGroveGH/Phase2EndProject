<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Welcome</title>
        <link href="../css/welcome.css" rel="stylesheet">
    </head>
    <body>
        <div>
            <h1>Welcome</h1>
            <h3>Username: ${user.username}</h3>
            <h3>Password: ${user.password}</h3>
        </div>
    </body>
</html>