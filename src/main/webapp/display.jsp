<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Map"%>
<%@ page import="in.venkatet.service.VehicleService"%>
<%@ page import="in.venkatet.model.*"%>
<%@ page import="in.venkatet.DAO.VehicleDao"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<form action="userLogin.jsp" method="post">
			<h3>vehicle</h3>

			<table class="table table-bordered">
				<caption>display</caption>
				<thead>
					<tr>
						<th scope="col">sl.No</th>
						<th scope="col">vehicle type</th>
						<th scope="col">price</th>
						<th scope="col">update</th>

						<%
						Map<String, Double> vehicles = VehicleDao.getVehicles();
						int j = 0;
						for (String vehicle : vehicles.keySet()) {
							double price = vehicles.get(vehicle);
							j++;
						%>
					
					<tr>
						<td><%=j%></td>
						<td><%=vehicle%></td>
						<td><%=price%></td>
						<td><a href="DeleteVehicleServlet?vehicleName=<%=vehicle%>"
							class="btn btn-danger">Delete</a> <%
 }
 %>
				</thead>
			</table>

			<button type="submit">BOOK</button>
		</form>
	</main>
</body>
</html>