package in.venkatet.dao;

import java.util.ArrayList;
import java.util.List;

import in.venkatet.model.UserDetails;

public class UserDao {
	private final static List<UserDetails> userRegistration = new ArrayList<>();

	public void addUser(UserDetails users) {
		userRegistration.add(users);
		
		
		}
	public static List<UserDetails> getUser() {
		return userRegistration;
	}

}


