/**
 * 
 */
package in.venkatet.DAO;

import java.util.ArrayList;
import java.util.List;

import in.venkatet.model.User;

/**
 * @author venk2622
 *
 */
public class UserDao {

	private final List<User> userRegistration = new ArrayList<User>();

	public void addUser(User users) {
		userRegistration.add(users);
		
	}
}
