package in.venkatet.service;

import java.util.Map;
import java.util.TreeMap;


public class VehicleService {
	
	private static final Map<String, Integer> vehicles = new TreeMap<>();
	static {
		// List of products in the map
//		products.put("cycle",50);
//		products.put("gear cycle",100);
//		products.put("electic cycle",150);
//		products.put("scooter",150);
//		products.put("gear bike",200);
//		products.put("sport bike",300);
//		products.put("with A/C",500);
//		products.put("without A/C",700);
//		products.put("SUV",1000);
	
	}
	/**
	 * method to display the products available
	 * 
	 * @return
	 * 
	 */
	public static Map<String,Integer> getProducts() {
		return vehicles;
	}
	public static boolean addProduct(String vehicleName,int cost) {
		//TODO: call validation and check productName
		System.out.println("Successfully added ");
		vehicles.put(vehicleName, cost);
		return true;
	}
	public static boolean isValidNumber(int number) {
		boolean valid = false;
		if(number>0) {
			valid = true;
		}
		else {
			valid = false;
		}
		return valid;
	}
//	public static boolean deleteProduct(String productName) {
//		//TODO: Implement the logic
//		boolean isDeleted = false;
//		String id = null;
//		for(String key: products.keySet()) {
//			Integer value = products.get(key);
//			if(key.equalsIgnoreCase(productName)) {
//				id = key;
//				break;
//			}
//		}
//		if(id != null) {
//			products.remove(id);
//			isDeleted = true;
//		}
//		return isDeleted;
//	}

}
