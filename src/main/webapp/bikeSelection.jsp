<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.Set"%>
<%@ page import="in.venkatet.service.VehicleSelection"%>
<!DocType html>
<html lang="en">
<head>
<title>MyApp</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>Vehicle Selection</h3>
		<h2>bike types</h2>
		<table class="table table bordered">
			<thead>
				<tr>
					<th scope="col">Sl.No</th>
					<th scope="col">bike Type</th>
					<th scope="col">Price Per Hour</th>

				</tr>
			</thead>
			<tbody>
				<%
				HashMap<String, Integer> bikes = VehicleSelection.getVehicle1();
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
				</tr>
			</tbody>
		</table>
	</main>
</body>
</html>















