<%@ include file="../common/header.jspf" %>
<div style="overflow: scroll; height : 90%; max-height:500px">
<%@ include file="../common/navigation.jspf" %>

	
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
	</div>
	<%@ include file="../common/footer.jspf" %>
	
	
