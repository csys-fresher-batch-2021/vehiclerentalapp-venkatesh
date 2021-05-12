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
			System.out.println("AddVehicleServlet");
			// Step 1: Get Form Values
			String vehicleName = request.getParameter("vehicleName");
			out.println(vehicleName);
			int cost   = Integer.parseInt(request.getParameter("cost"));
			out.println(cost);
			boolean validCost = VehicleService.isValidNumber(cost);
			// Step 2: Call Service => add Product
			boolean isAdded = false;
			if( validCost) {
				isAdded = VehicleService.addProduct( vehicleName,cost);
			}
			
			// Step 3: Decide to which page we should redirect ?
			if (isAdded) {
				response.sendRedirect("Display.jsp");
			} else {
				String errorMessage = "Unable to add vehicle ";
				response.sendRedirect("addproduct.jsp?errorMessage=" + errorMessage);
			}
		}
	}

	


