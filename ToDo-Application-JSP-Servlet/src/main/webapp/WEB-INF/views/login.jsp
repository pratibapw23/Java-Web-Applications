<%@ include file="../common/header.jspf" %>
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


		<form action="/login.do" method="post">
			Enter Username &nbsp;<input type="text" name="username" /><br> <br>Enter
			Password &nbsp;<input type="password" name="password" /><br><br> &nbsp;&nbsp;<input
				type="submit" />
		</form>
		<p>${ErrorMessage}</p>
	</div>
	<%@ include file="../common/footer.jspf" %>
