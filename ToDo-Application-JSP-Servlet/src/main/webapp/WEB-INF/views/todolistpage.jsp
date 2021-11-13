<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ToDo List of User</title>
</head>
<body>
Welcome ${username}
<h3>Users ToDo List</h3><br>
<ol>

<c:forEach items="${todos}" var="todo">
	<li>${todo.name} ${todo.status}</li>
</c:forEach>

</ol>

</body>
</html>	