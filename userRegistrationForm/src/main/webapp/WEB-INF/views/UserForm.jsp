<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Here!!</title>
</head>
<body>
<form action="/register.in" method="post">  
<input type="text" name="firstname" onclick="this.value=''"/><br/>  
<input type="text" name="lastname" onclick="this.value=''"/><br/> 
<input type="text" name="email" onclick="this.value=''"/><br/> 
<input type="password" name="upass" onclick="this.value=''"/><br/>  
<input type="text" name="id" onclick="this.value=''"/><br/> 
<input type="submit" value="register"/> 

<p>${message}</p>
 
</form>   
</body>
</html>