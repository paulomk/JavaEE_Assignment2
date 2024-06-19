<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container">

	<h1 class="display-1" style="font-weight: bold;">Sign up</h1>

	<form action="register">
	
		<!-- Personal Information Section -->
		<p class="display-4 mt-5">Enter information</p>
		<hr>
		<div class="mt-3 form-floating">
			<input name="user-name" id="user-name" type="text" class="form-control" required="true">
			<label for="user-name" class="form-label">Username</label>
		</div>
		<div class="mt-3 form-floating">
			<input name="password" id="password" type="text" class="form-control" required="true">
			<label for="password" class="form-label">Password</label>
		</div>
		<div class="mt-3 form-floating">
			<input name="email" id="email" type="email" class="form-control" required="true">
			<label for="email" class="form-label">Email</label>
		</div>
		<div class="mt-3 form-floating">
			<input name="contact" id="contact" type="text" class="form-control" required="true">
			<label for="contact" class="form-label">Contact</label>
		</div>
		<div class="mt-3 form-floating">
			<input name="city" id="city" type="text" class="form-control" required="true">
			<label for="city" class="form-label">City</label>
		</div>
	
		<input type="submit" value="submit" class="btn btn-primary mt-3">
	</form>

</div>
			
</body>
</html>