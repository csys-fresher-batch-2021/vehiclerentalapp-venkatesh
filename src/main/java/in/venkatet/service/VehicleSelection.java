/**
 * 
 */
package in.venkatet.service;

import java.util.HashMap;
import java.util.Set;

/**
 * @author venk2622
 *
 */
public class VehicleSelection {

	static HashMap<String, Integer> cyclePriceMap = new HashMap<String, Integer>();

	public static void displayCycleTypes() {
		cyclePriceMap.put("cycle", 50);
		cyclePriceMap.put("gear cycle", 100);
		cyclePriceMap.put("electric cycle", 150);
		System.out.println("--------------cycle types------------");
		Set<String> keySet = cyclePriceMap.keySet();
		for (String cycleType : keySet) {
			Integer value = cyclePriceMap.get(cycleType);
			System.out.println("The price for " + cycleType + " is " + value);

			
		}
	}
		static HashMap<String, Integer> bikePriceMap = new HashMap<String, Integer>();

		public static void displayBikeType() {
			bikePriceMap.put("scooter", 50);
			bikePriceMap.put("gear bike", 100);
			bikePriceMap.put("sport bike", 150);
			System.out.println("----------bike types-----------");
			Set<String> keySet1 = bikePriceMap.keySet();
			for (String bikeType : keySet1) {
				Integer value1 = bikePriceMap.get(bikeType);
				System.out.println("The price for " + bikeType + " is " + value1);
			}
		}
			static HashMap<String, Integer> carPriceMap = new HashMap<String, Integer>();

			public static void displayCarTypes() {
				carPriceMap.put("without A/C", 500);
				carPriceMap.put("with A/c", 1000);
				System.out.println("----------CAR DETAILS---------");
				Set<String> keySet2 = carPriceMap.keySet();
				for (String carType : keySet2) {
					Integer value2 = carPriceMap.get(carType);
					System.out.println("The price for " + carType + " is " + value2);
				}
		}
	}
