package git_hub_sumair_app1.controller.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {

	@Id
	@Column(name="id")
	 private int id;
	@Column(name="name")
	 private String name;
	@Column(name="email")
	 private String email;
	@Column(name="countrycode")
	 private String countrycode;
	@Column(name="phonenumber")
	 private String phonenumber;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountryCode() {
		return countrycode;
	}
	public void setCountryCode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getPhoneNumber() {
		return phonenumber;
	}
	public void setPhoneNumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	 
	 
}
