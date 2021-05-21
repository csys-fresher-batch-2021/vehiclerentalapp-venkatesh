package in.venkatet.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.venkatet.service.VehicleService;

/**
 * Servlet implementation class DeleteVehicleDetailServlet
 */
@WebServlet("/DeleteVehicleDetailServlet")
public class DeleteVehicleDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String vehicleName = request.getParameter("vehicleName");
		boolean isDeleted = VehicleService.deleteVehicle(vehicleName);
		if (isDeleted) {
			response.sendRedirect("display.jsp");
		} else {
			String errorMessage = "Unable to delete vehicle";
			response.sendRedirect("addVehicleDetails.jsp?errorMessage=" + errorMessage);
		}
	}

}
