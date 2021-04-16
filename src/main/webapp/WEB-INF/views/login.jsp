<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <form action="/login-process" method="post">
        <input type="text" name="username">
        <input type="text" name="password">
        <button type="submit" >로그인</button>
    </form>

<form action="/logout" method="post">
    <button type="submit" >로그아웃</button>
</form>
</body>
</html>