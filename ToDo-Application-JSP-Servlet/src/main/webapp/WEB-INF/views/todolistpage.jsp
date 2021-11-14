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
<div style="overflow: scroll; height : 90%; max-height:500px">
	<nav class="navbar navbar-default">

		<a href="/" class="navbar-brand">Brand</a>

		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="/todo.do">Todos</a></li>
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="/logout.do">Logout</a></li>
		</ul>

	</nav>
	<div class="container">
		Welcome ${username}
		<h3>Users ToDo List</h3>
		<br>
		<table class="table table-striped">
			<thead>
				<th>Description</th>
				<th>Status</th>
				<th>Actions</th>
			</thead>
			<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.name}</td>
					<td>${todo.status}</td>
					<td><a class="btn btn-danger"
					href="delete-toto.do?todo=${todo.name}&status=${todo.status}">Delete</a></td>
				</tr>
				</c:forEach>
				
			</tbody>
		</table>
		<form action="/add-todo.do" method="post">
			New Todo &nbsp; &nbsp;<input type="text" name="todo" /> &nbsp; Status &nbsp;<input type="text" name="status" />
			<input type="submit" value="Add Todo" class="btn btn-success"/>

		</form>
	</div>
	
	<footer class="footer">
		<p>footer content</p>
	</footer>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</div>
</body>
</html>
