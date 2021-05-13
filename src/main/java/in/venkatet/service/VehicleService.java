package in.venkatet.service;

import java.util.Map;
import java.util.TreeMap;

public class VehicleService {
	private VehicleService() {
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
	public static Map<String, Integer> getVehicles() {
		return vehicles;
	}

	public static boolean addVehicle(String vehicleName, int cost) {
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

	public static int isParsable(String price) {
		int res = 0;
		try {
			res = Integer.parseInt(price);
		} catch (final NumberFormatException e) {
			res = 0;
		}
		return res;
	}

	public static boolean isVehicleNameValid(String vehicleName) {
		boolean valid = false;
		String regex = "[a-zA-Z]+\\.?";
		if (vehicleName.matches(regex)) {

			valid = true;
		} else {
			valid = false;
		}
		return valid;
	}
}
