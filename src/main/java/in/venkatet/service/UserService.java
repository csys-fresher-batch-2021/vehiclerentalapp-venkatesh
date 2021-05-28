package in.venkatet.service;

import java.util.List;

import in.venkatet.dao.UserDao;
import in.venkatet.model.UserDetails;
import in.venkatet.validator.UserValidator;

public class UserService {
	private UserDao userObject = new UserDao();

	private UserValidator userValidator = new UserValidator();

	public boolean addDetails(String name, Long mobile, String email, String address, int age, String password,
			String confrimPassword) {
		boolean registered = false;
		UserDetails userObj = new UserDetails(name, email, mobile, address, age, password, confrimPassword);
		boolean nameValid = userValidator.isNameValid(name);
		boolean mobileValid = userValidator.isMobileNumberValid(mobile);
		boolean emailValid = userValidator.isEmailValid(email);
		boolean addressValid = userValidator.isAddressValid(address);
		boolean ageValid = userValidator.isAgeValid(age);
		boolean passwordValid = userValidator.isPasswordValid(password);
		if (nameValid && mobileValid && emailValid && addressValid && ageValid && passwordValid
				&& password.equals(confrimPassword)) {

			userObject.addUser(userObj);
			registered = true;
		}

		return registered;

	}

	public boolean checkUser(String userName, String userPasscode) {
		boolean isValidUser = false;
		List<UserDetails> users = UserDao.getUser();
		for (UserDetails userDetails : users) {
			if (userDetails.getUserName().equals(userName) && userDetails.getPassword().equals(userPasscode)) {
				isValidUser = true;
			}

		}
		return isValidUser;
	}

}
