<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome from JSP</title>
</head>
<body>
<p><font color="red">${ErrorMessage}</font></p>
<form action="/login.do" method="post">
Enter Your Name <input type="text" name="name"/> 
Enter password <input type="password" name="password"/><input type="submit"/>
</form>
</body>
</html>