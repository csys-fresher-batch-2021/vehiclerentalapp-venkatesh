package in.venkatet.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import in.venkatet.service.VehicleService;
/**
 * servlet implementation class AddVehicleServlet
 */
@WebServlet("/AddVehicleServlet")
public class AddVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	try {
	   String vehicleName = request.getParameter("vehicleName");
	   boolean isValid= VehicleService.isVehicleNameValid( vehicleName);
        String price = request.getParameter("cost");
	    int cost = VehicleService.isParsable(price);
		boolean validCost = VehicleService.isValidNumber(cost);
		boolean isAdded = false;
		if (isValid && validCost) {
		   	isAdded = VehicleService.addVehicle(vehicleName, cost);
			if (isAdded){
			   response.sendRedirect("display.jsp");
			}
			else{
			 	String errorMessage = "Unable to add vehicle ";
				response.sendRedirect("addVehicleDetails.jsp?errorMessage=" + errorMessage);
			}
			
		}
		}catch (Exception e) {
             String errorMessage = e.getMessage();
			response.sendRedirect("addVehicleDetails.jsp?errorMessage=" + errorMessage);
		}
	}
		
}