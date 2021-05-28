<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container fluid">
		<form action="UserLoginServlet" method="post">
			<table>
				<caption>USER LOGIN</caption>
				<tr>
					<th scope="col">USER NAME</th>
					<td><input type="text" name="userName"
						placeholder="Enter your name" id="userName" require autofocus></td>
				</tr>
				<tr>
					<th scope="col">PASSWORD</th>
					<td><input type="password" name="password"
						placeholder="Enter password" id="passId" required></td>
				</tr>
			</table>
			<button type="submit">SUBMIT</button>
			<a href="userRegistration.jsp">New User</a> <a
				href="displayVehicle.jsp">VIEW</a>
		</form>
	</main>

</body>
</html>