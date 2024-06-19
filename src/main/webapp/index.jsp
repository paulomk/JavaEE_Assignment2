<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

	<div class=container>
	
		<h1 class="display-1 mb-5" style="font-weight: bold;">Enter your credentials</h1>
		<% 
		if(request.getAttribute("error")!= null){
			out.print("<p class='alert alert-danger'>" + request.getAttribute("error") + "</p>");
		} 
		%>
		<form action="validate">
			<div class="form-floating mb-3">
				<input type="text" name="user" id="user" placeholder="username" class="form-control">	
				<label for="user">User</label>
			</div>
			
			<div class="form-floating mb-3">
				<input type="password" name="password" id="password" placeholder="Password" class="form-control">
				<label for="password">Password</label>
			</div>
		
			<input type="submit" value="Log in" class="btn btn-primary mb-3">
		</form>
		
		<a href="register.jsp" class="btn btn-primary">Register</a>
	</div>
</body>
</html>