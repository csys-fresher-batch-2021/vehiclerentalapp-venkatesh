<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="LoginServlet" method="post">
	<table>
		<caption>ADMIN LOGIN</caption>
		<tr>
			<th scope="col">ADMIN NAME</th>
			<td><input type="text" name="userName"
				placeholder="Enter user name" id="userId" required autofocus></td>
		</tr>
		<tr>
			<th scope="col">PASSWORD</th>
			<td><input type="password" name="password"
				placeholder="Enter your password" id="passwordId" required></td>
		</tr>

	</table>
	<button type=submit class="btn btn-primary">SUBMIT</button>
</form>
</body>
</html>