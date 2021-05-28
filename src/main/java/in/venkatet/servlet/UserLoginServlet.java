package in.venkatet.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.venkatet.service.UserService;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserService user = new UserService();
		String userName = request.getParameter("userName");
		String userPasscode = request.getParameter("password");
		boolean isValid = user.checkUser(userName, userPasscode);
		if (isValid) {
			HttpSession session = request.getSession();
			session.setAttribute("LOGGED_IN_USER", userName);
			session.setAttribute("ROLE", "USER");
			response.sendRedirect("bookingDetails.jsp");
		} else {
			response.sendRedirect("userLogin.jsp?errorMessage=Invalid Login Credentials");
		}
	}

}
