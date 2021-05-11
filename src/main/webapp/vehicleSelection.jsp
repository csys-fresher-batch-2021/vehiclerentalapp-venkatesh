<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.Set"%>
<%@ page import="in.venkatet.service.VehicleSelection"%>
<html>
<head>
<title>MyApp</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h3>Vehicle Selection</h3>
		<h2>cycle types</h2>
		<table class="table table bordered">
			<thead>
				<tr>
					<th>Sl.No</th>
					<th>Cycle Type</th>
					<th>Price Per Hour</th>
				</tr>
			</thead>
			<tbody>
				<%
				HashMap<String, Integer> cycles = VehicleSelection.getVehicle();
				int i = 0;
				for (String cycle : cycles.keySet()) {
					int price = cycles.get(cycle);
					i++;
				%>
				<tr>
					<td><%=i%></td>
					<td><%=cycle%></td>
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





















