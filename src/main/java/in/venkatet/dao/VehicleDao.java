/**
 * 
 */
package in.venkatet.dao;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author venk2622
 *
 */
public class VehicleDao {

	private static final Map<String, Double> vehicles = new TreeMap<>();
	

	public static void addVehicle(String name, double amount) {
		vehicles.put(name,amount);

	}

	public static Map<String, Double> getVehicles() {
		return vehicles;
	}

}
