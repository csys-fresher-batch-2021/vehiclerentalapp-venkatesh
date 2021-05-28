package in.venkatet.service;

import java.util.Map;
import java.util.TreeMap;

import in.venkatet.dao.BookVehicleDao;

public class VehicleService {
	private VehicleService() {
		/**
		 * constructor
		 */
	}

	private static final Map<String, Double> vehicles = new TreeMap<>();

	/**
	 * method to display the products available
	 * 
	 * @return
	 * 
	 */
	public static Map<String, Double> getVehicles() {
		return vehicles;
	}

	public static boolean addVehicle(String vehicleName, double cost) {
		vehicles.put(vehicleName, cost);
		return true;

	}

	public static boolean isPresent(String vehicleName) {
		boolean present = false;
		if (vehicles.containsKey(vehicleName)) {
			present = true;
		}
		return present;

	}

	public static boolean deleteVehicle(String vehicleName) {
		boolean isDeleted = false;
		if (vehicles.containsKey(vehicleName)) {
			vehicles.remove(vehicleName);
			isDeleted = true;
		} else {
			isDeleted = false;
		}

		return isDeleted;
	}

	public static boolean vehicleReserved(String vehicleName, String hour, String bookingDate, String bookingTime) {
		boolean isPresent = BookVehicleService.isPresent(vehicleName);
		boolean isAdd = false;
		if (isPresent) {
			int rentalHour = Integer.parseInt(hour);
			double cost = BookVehicleService.cost(vehicleName);
			BookVehicleDao.addBookVehicle(vehicleName, cost, rentalHour, bookingDate, bookingTime);
		}

		return isAdd;
	}

}
