package in.venkatet.service;

import java.util.Map;
import java.util.TreeMap;

public class BookVehicleService {
	private BookVehicleService() {
		/*
		 * adding a private constructor
		 */
	}

	private static final Map<String, Double> bookVehicles = new TreeMap<>();

	/**
	 * method to display the products available
	 * 
	 * @return
	 * 
	 */
	public static Map<String, Double> getVehicles() {
		return bookVehicles;
	}

	public static boolean addVehicle(String vehicleName, Double cost) {
		bookVehicles.put(vehicleName, cost);
		return true;
	}

	public static boolean deleteVehicle(String vehicleName) {
		boolean isDeleted = false;
		if (bookVehicles.containsKey(vehicleName)) {
			bookVehicles.remove(vehicleName);
			isDeleted = true;
		} else {
			isDeleted = false;
		}

		return isDeleted;
	}

	public static boolean isPresent(String vehicleName) {

		boolean present = false;
		if (bookVehicles.containsKey(vehicleName)) {
			present = true;
		}
		return present;

	}

	public static double cost(String vehicleName) {
		double cost = 0;

		for (String vehicle : bookVehicles.keySet()) {
			if (vehicleName.equalsIgnoreCase(vehicle)) {
				cost = bookVehicles.get(vehicleName);

			}
		}
	
		return cost;

	}

}
