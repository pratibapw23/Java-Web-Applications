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
	<li>${todo.name} &nbsp; ${todo.status} &nbsp; &nbsp; <a href="delete-toto.do?todo=${todo.name}&status=${todo.status}">Delete</a></li>
</c:forEach>

</ol>
<form action="/todo.do" method="post">
<input type="text" name="todo"/> <input type="text" name="status"/> <input type="submit" value="Add Todo"/>

</form>

</body>
</html>	