package in.venkatet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.venkatet.service.UserService;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {

			String username = request.getParameter("name");
			String email = request.getParameter("email");
			String mobile = request.getParameter("number");
			long mobileNum =Long.parseLong(mobile);
			String address = request.getParameter("address");
			String userAge = request.getParameter("age");
			int age = Integer.parseInt(userAge);
			String password = request.getParameter("registeredPassword");
			String ConfrimPassword = request.getParameter("reEnteredPassword");

			UserService service = new UserService();

			boolean isAdded = service.addDetails(username, mobileNum, email, address, age, password, ConfrimPassword);
			if (isAdded) {
				response.sendRedirect("display.jsp");
		
			}
		} catch (Exception e) {
			String errorMessage = "Invalid user details ";
			response.sendRedirect("userRegistration.jsp?errorMessage=" + errorMessage);
		}

	}

}
