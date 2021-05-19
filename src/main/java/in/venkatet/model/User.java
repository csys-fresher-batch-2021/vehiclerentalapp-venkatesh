package in.venkatet.model;

/**
 * @author venk2622
 *
 */
public class User {
	private String userName;
	private String userEmailAddress;
	private Long userMobileNumber;
	private String userAddress;
	private int userAge;
	private String password;
	private String reEnteredPassword;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReEnteredPassword() {
		return reEnteredPassword;
	}

	public void setReEnteredPassword(String reEnteredPassword) {
		this.reEnteredPassword = reEnteredPassword;
	}

	public String getUserName() {
		return userName;
	}

	public User(String userName, Long userMobileNumber, String userEmailAddress, String userAddress, int userAge,
			String password, String reEnteredPassword) {
		super();
		this.userName = userName;
		this.userMobileNumber = userMobileNumber;
		this.userEmailAddress = userEmailAddress;
		this.userAddress = userAddress;
		this.userAge = userAge;
		this.password = password;
		this.reEnteredPassword = reEnteredPassword;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userMobileNumber=" + userMobileNumber + ", userEmailAddress="
				+ userEmailAddress + ", userAddress=" + userAddress + ", userAge=" + userAge + ", password=" + password
				+ ", reEnteredPassword=" + reEnteredPassword + "]";
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getUserMobileNumber() {
		return userMobileNumber;
	}

	public void setUserMobileNumber(Long userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}

	public String getUserEmailAddress() {
		return userEmailAddress;
	}

	public void setUserEmailAddress(String userEmailAddress) {
		this.userEmailAddress = userEmailAddress;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

}
