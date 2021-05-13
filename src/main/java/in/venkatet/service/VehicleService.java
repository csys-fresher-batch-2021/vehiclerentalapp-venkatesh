package in.venkatet.service;

import java.util.Map;
import java.util.TreeMap;

public class VehicleService {
	private VehicleService () {
		/**
		 * constructor
		 */
	}
	private static final Map<String, Integer> vehicles = new TreeMap<>();
	/**
	 * method to display the products available
	 * 
	 * @return
	 * 
	 */
	public static Map<String, Integer> getProducts() {
		return vehicles;
	}

	public static boolean addProduct(String vehicleName, int cost) {
		vehicles.put(vehicleName, cost);
		return true;
	}

	public static boolean isValidNumber(int number) {
		boolean valid = false;
		if (number > 0) {
			valid = true;
		} else {
			valid = false;
		}
		return valid;
	}

}
