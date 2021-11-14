<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}
</style>
<title>ToDo List of User</title>
</head>
<body>
	<nav class="navbar navbar-default">

		<a href="/" class="navbar-brand">Brand</a>

		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="/todo.do">Todos</a></li>
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="/login.do">Login</a></li>
		</ul>

	</nav>
	<div class="container">
		Welcome ${username}
		<h3>Users ToDo List</h3>
		<br>
		<ol>

			<c:forEach items="${todos}" var="todo">
				<li>${todo.name}&nbsp; ${todo.status} &nbsp; &nbsp; <a
					href="delete-toto.do?todo=${todo.name}&status=${todo.status}">Delete</a></li>
			</c:forEach>

		</ol>
		<form action="/add-todo.do" method="post">
			<input type="text" name="todo" /> <input type="text" name="status" />
			<input type="submit" value="Add Todo" />

		</form>
	</div>
	<footer class="footer">
		<p>footer content</p>
	</footer>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
