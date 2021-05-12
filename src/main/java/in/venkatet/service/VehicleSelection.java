/**
 * 
 */
package in.venkatet.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author venk2622
 *
 */
public class VehicleSelection {

	private VehicleSelection() {

	}

	private static Map<String, Integer> cyclePriceMap = new HashMap<>();
	static {
		cyclePriceMap.put("cycle", 50);
		cyclePriceMap.put("gear cycle", 100);
		cyclePriceMap.put("electric cycle", 150);
	}

	public static Map<String, Integer> getVehicle() {
		return cyclePriceMap;
	}

	public static void displayCycleTypes() {

		
		Set<String> keySet = cyclePriceMap.keySet();
		for (String cycleType : keySet) {
			Integer value = cyclePriceMap.get(cycleType);

		}
	}

	private static Map<String, Integer> bikePriceMap = new HashMap<>();
	static {
		bikePriceMap.put("scooter", 50);
		bikePriceMap.put("gear bike", 100);
		bikePriceMap.put("sport bike", 150);
	}

	public static Map<String, Integer> getVehicle1() {
		return bikePriceMap;
	}

	public static void displayBikeType() {

		
		Set<String> keySet1 = bikePriceMap.keySet();
		for (String bikeType : keySet1) {
			Integer value1 = bikePriceMap.get(bikeType);

		}
	}

	static Map<String, Integer> carPriceMap = new HashMap<>();
	static {
		carPriceMap.put("without A/C", 500);
		carPriceMap.put("with A/c", 1000);
		carPriceMap.put("suv", 1000);

	}

	public static Map<String, Integer> getVehicle2() {
		return carPriceMap;
	}

	public static void displayCarTypes() {

	
		Set<String> keySet2 = carPriceMap.keySet();
		for (String carType : keySet2) {
			Integer value2 = carPriceMap.get(carType);

		}
	}
}
