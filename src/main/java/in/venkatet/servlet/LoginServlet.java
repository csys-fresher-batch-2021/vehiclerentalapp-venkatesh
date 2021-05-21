package in.venkatet.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("userName");
		String password = request.getParameter("password");

		boolean isValid = "admin".equals(username) && "admin".equals(password);

		if (isValid) {
			HttpSession session = request.getSession();
			session.setAttribute("LOGGED_IN_USER", username);
			session.setAttribute("ROLE", "ADMIN");
			response.sendRedirect("addVehicleDetails.jsp");
		} else {
			response.sendRedirect("adminLogin.jsp?errorMessage=Invalid Login Credentials");
		}

	}

}
