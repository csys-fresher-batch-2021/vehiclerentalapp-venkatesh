package in.venkatet.service;

import in.venkatet.DAO.UserDao;
import in.venkatet.model.User;
import in.venkatet.validator.UserValidator;

public class UserService {

	private UserDao userObject = new UserDao();

	private UserValidator userValidator = new UserValidator();

	public boolean addDetails(String name, Long mobile,String email, String address, int age, String password,
			String confrimPassword) {
		boolean registered = false;
		User userObj = new User(name, mobile, email, address, age, password, confrimPassword);
		boolean nameValid = userValidator.isNameValid(name);
		boolean mobileValid = userValidator.isMobileNumberValid(mobile);
		boolean emailValid = userValidator.isEmailValid(email);
		boolean addressValid = userValidator.isAddressValid(address);
		boolean ageValid = userValidator.isAgeValid(age);
		boolean passwordValid = userValidator.isPasswordValid(password);
		if (nameValid && mobileValid && emailValid && addressValid && ageValid && passwordValid) {
			if (password.equals(confrimPassword)) {
				userObject.addUser(userObj);
				registered = true;
			} 

		} 
		return registered;

	}

}
