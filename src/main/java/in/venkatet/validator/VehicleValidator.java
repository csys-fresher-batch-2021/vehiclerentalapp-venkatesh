package in.venkatet.validator;

/**
 * @author venk2622
 *
 */
public class VehicleValidator {
	private VehicleValidator() {
		/*
		 * adding a private contructor
		 */
	}

	public static boolean isValidNumber(double number) {
		boolean valid = false;
		if (number > 0) {
			valid = true;
		} else {
			valid = false;
		}
		return valid;
	}

	public static boolean isVehicleNameValid(String vehicleName) {
		boolean valid = false;
		String regex = "[a-zA-Z0-9 ]+\\.?";
		if (vehicleName.matches(regex)) {

			valid = true;
		} else {
			valid = false;
		}
		return valid;
	}

}
