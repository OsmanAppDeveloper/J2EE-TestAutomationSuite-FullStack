package org.amazon.testautomationsuite.web.testobjects;

public class CustomerTestObject extends PersonTestObject {
	String yourName;
	String email;
	String password;
	String reEnterPassword;

	public CustomerTestObject(String yourName, String email, String password, String reEnterPassword) {
		super();
		this.yourName = yourName;
		this.email = email;
		this.password = password;
		this.reEnterPassword = reEnterPassword;
	}

	public String getYourName() {
		return yourName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getReEnterPassword() {
		return reEnterPassword;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setReEnterPassword(String reEnterPassword) {
		this.reEnterPassword = reEnterPassword;
	}

}
