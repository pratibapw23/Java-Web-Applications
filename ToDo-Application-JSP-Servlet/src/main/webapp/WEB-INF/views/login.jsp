<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Page</title>
</head>
<body>
<form action="/todo.list" method="post">
Enter Username<input type="text" name="username"/><br>
Enter Password<input type="password" name="password"/><br>
<input type="submit"/>
</form>
<p>${ErrorMessage}</p>
</body>
</html>