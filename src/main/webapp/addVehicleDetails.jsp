<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>Add vehicle</h3>

		<form action="AddVehicleServlet" method="post">
			<label for="vehicleName">Vehicle Name</label> <input type="text"
				name="vehicleName" placeholder="Enter  vehicle  Name" required
				autofocus /> <br /> <label for="cost">cost</label> <input
				type="number" name="cost" placeholder="Enter Cost" required /> <br />
			<button type="submit">SUBMIT</button>
			<a href="display.jsp">view</a> <a href="">delete</a>
		</form>
	</main>
</body>
</html>