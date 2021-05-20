package in.venkatet.validator;

/**
 * @author venk2622
 *
 */
public class UserValidator {
	public boolean isNameValid(String vehicleName) {
		boolean valid = false;
		String regex = "[a-zA-Z]+\\.?";
		if (vehicleName.matches(regex)) {

			valid = true;
		} else {
			valid = false;
			System.out.println("inalid");
		}
		return valid;
	}

	/**
	 * 
	 * @param email
	 * @return
	 */

	public boolean isEmailValid(String email) {
		boolean valid = false;
		String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.+[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		if (email.matches(regex)) {
			valid = true;

		}

		return valid;
	}

	/**
	 * 
	 * @param mobileNumber
	 * @return
	 */

	public boolean isMobileNumberValid(long mobileNumber) {
		boolean valid = false;
		String number = String.valueOf(mobileNumber);
		if (number.length() == 10) {
			valid = true;

		}

		return valid;
	}

	/**
	 * 
	 * @param address
	 * @return
	 */

	public boolean isAddressValid(String address) {
		boolean valid = false;
		String regex = "[a-zA-Z0-9]+\\.?";
		if (address.matches(regex)) {
			valid = true;
		}

		return valid;
	}

	/**
	 * 
	 * @param age
	 * @return
	 */

	public boolean isAgeValid(int age) {
		boolean valid = false;
		if (age > 18) {
			valid = true;
		}
		return valid;
	}

	/**
	 * 
	 * @param password
	 * @return
	 */

	public boolean isPasswordValid(String password) {
		boolean valid = false;
		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
		if (password != null && password.matches(regex)) {
			valid = true;
		}

		return valid;
	}
}
