<link rel="stylesheet" href="assets/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/css/fontawesome.min.css">
<link rel="stylesheet" href="assets/css/style.css">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

<%
String loggedInUsername = (String) session.getAttribute("LOGGED_IN_USER");
String role = (String) session.getAttribute("ROLE");
%>


<header>
	<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
		<a class="navbar-brand" href="#">Rental Booking Application</a>
		<button class="navbar-toggler d-lg-none" type="button"
			data-toggle="collapse" data-target="#collapsibleNavId"
			aria-controls="collapsibleNavId" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavId">
			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
				<li class="nav-item active"><a class="nav-link"
					href="displayVehicle.jsp">Display vehicles <span
						class="sr-only">(current)</span>
				</a></li>


			</ul>
			<%
			if (role != null) {
			%>

			<ul class="navbar-nav ml-auto mt-2 mt-lg-0">
				<%
				if (role.equalsIgnoreCase("USER")) {
				%>
				<li class="dropdown show"><a
					class="btn btn-secondary dropdown-toggle" href="" role="button"
					id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Dropdown link </a>

					<div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
						<a class="dropdown-item" href="#">Action</a> <a
							class="dropdown-item" href="#">Another action</a> <a
							class="dropdown-item" href="#">Something else here</a>
					</div></li>
				<%
				} else if (role.equalsIgnoreCase("ADMIN")) {
				%>
				<li class="nav-item"><a class="nav-link" href="adminLogin.jsp">add</a>
				</li>

				<%
				}
				%>


			</ul>
			<%
			}
			%>
			<ul class="navbar-nav ml-auto mt-2 mt-lg-0">
				<%
				if (loggedInUsername == null) {
				%>
				<li class="nav-item active"><a class="nav-link"
					href="adminLogin.jsp">ADMIN Login</a></li>
				<li class="nav-item"><a class="nav-link"
					href="userLoginView.jsp">Rent Vehicle</a></li>
				<%
				} else {
				%>
				<li class="nav-item active"><a class="nav-link" href="#">Welcome
						<%=loggedInUsername%>!
				</a></li>
				<li class="nav-item"><a class="nav-link" href="LogoutServlet">Logout</a></li>

				<%
				}
				%>
			</ul>
		</div>
	</nav>
</header>