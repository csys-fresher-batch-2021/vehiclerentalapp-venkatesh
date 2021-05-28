<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<form action="RegistrationServlet" method="post">
			<table>
				<caption>USER REGISTRATION</caption>
				<tr>
					<th scope="col">NAME</th>
					<td><input type="text" name="name"
						placeholder="Enter your name" id="name" required autofocus></td>
				</tr>
				<tr>
					<th scope="col">E-MAIL</th>
					<td><input type="email" name="email"
						placeholder="Enter your email" id="email" required></td>
				</tr>
				<tr>
					<th scope="col">MOBILE NUMBER</th>
					<td><input type="number" name="number"
						placeholder="Enter your number" id="number" required></td>
				</tr>
				<tr>
					<th scope="col">ADDRESS</th>
					<td><input type="text" name="address"
						placeholder="Enter your address" id="address" required></td>
				</tr>
				<tr>
					<th scope="col">AGE</th>
					<td><input type="number" name="age"
						placeholder="Enter your age" id="age" required></td>
				</tr>
				<tr>
					<th scope="col">PASSWORD</th>
					<td><input type="password" name="registeredPassword"
						placeholder="Enter your pasword" id="registrationPassword"
						required></td>
				</tr>
				<tr>
					<th scope="col">RE ENTER PASSWORD</th>
					<td><input type="password" name="reEnteredPassword"
						placeholder="Re enter your password " id="reRegistrationPassword"
						required></td>
				</tr>

			</table>
			<button type=submit class="btn btn-primary">SUBMIT</button>
		</form>
	</main>

</body>
</html>