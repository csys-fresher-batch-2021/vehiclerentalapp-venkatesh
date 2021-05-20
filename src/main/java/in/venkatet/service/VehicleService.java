package in.venkatet.service;

import in.venkatet.DAO.VehicleDao;
import in.venkatet.validator.VehicleValidator;

public class VehicleService {
	private static VehicleValidator validator = new VehicleValidator();

	public VehicleService() {
		/**
		 * constructor
		 */
	}

	public static boolean addVehicle(String vehicleName, double cost) {
		boolean added = false;
		boolean isVehicleNameValid = validator.isVehicleNameValid(vehicleName);
		boolean isCostValid = validator.isValidNumber(cost);
		if (isVehicleNameValid && isCostValid) {
			VehicleDao.addVehicle(vehicleName, cost);
			added = true;
		}
		return added;
	}

	public static boolean deleteVehicle(String vehicleName) {

		boolean isDeleted = false;
		if (VehicleDao.getVehicles().containsKey(vehicleName)) {
			VehicleDao.getVehicles().remove(vehicleName);
			isDeleted = true;
		}
		return isDeleted;
	}
}
