<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Map"%>
<%@ page import="in.venkatet.service.VehicleService"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>vehicle</h3>

		<table class="table table-bordered">
			<caption>display</caption>
			<thead>
				<tr>
					<th scope="col">sl.No</th>

					<th scope="col">bike type</th>
					<th scope="col">price</th>

					<%
					Map<String, Integer> bikes = VehicleService.getProducts();
					int j = 0;
					for (String bike : bikes.keySet()) {
						int price = bikes.get(bike);
						j++;
					%>
				
				<tr>
					<td><%=j%></td>
					<td><%=bike%></td>
					<td><%=price%></td>
					<td></td>
					<%
					}
					%>
				
			</thead>
		</table>


		<a href="AddBikeDetails.jsp">Add bike type</a>
	</main>
</body>
</html>