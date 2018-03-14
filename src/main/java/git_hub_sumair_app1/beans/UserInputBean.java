package git_hub_sumair_app1.beans;

import java.io.Serializable;

public class UserInputBean implements Serializable {

	private static final long serialVersionUID = 19908259546000002L;
	
	private final String id;
    private final String name;
    private final String email;
    private final String countryCode;
    private final String phoneNumber;
    
	public UserInputBean(String id, String name, String email, String countryCode, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.countryCode = countryCode;
		this.phoneNumber = phoneNumber;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
    
}
