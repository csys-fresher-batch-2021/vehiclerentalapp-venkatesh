package in.venkatet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.venkatet.service.VehicleService;

/**
 * Servlet implementation class AddVehicleServlet
 */
@WebServlet("/AddVehicleServlet")
public class AddVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String vehicleName = request.getParameter("vehicleName");
		int cost = Integer.parseInt(request.getParameter("cost"));
		boolean validCost = VehicleService.isValidNumber(cost);

		boolean isAdded = false;
		if (validCost) {
			try {
				isAdded = VehicleService.addProduct(vehicleName, cost);
			} catch (Exception e) {
				String errorMessage = "Invalid data ";
				response.sendRedirect("addproduct.jsp?errorMessage=" + errorMessage);
			}

		}
		if (isAdded) {
			try {
				response.sendRedirect("Display.jsp");
			} catch (Exception e) {
				String errorMessage = "Unable to add Books ";

				response.sendRedirect("addproduct.jsp?errorMessage=" + errorMessage);
			}

		}

	}
}
