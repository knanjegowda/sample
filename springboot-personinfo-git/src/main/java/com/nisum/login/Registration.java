package com.nisum.login;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Registration {
	@Id
	public String userName;

	public String password;
	public String confirmPassword;
	
	public String company;
	public String designation;	
	
	
	/*public Registration() {
		
	}
	public Registration(String userName, String password, String confirmPassword, String company, String designation) {
		super();
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.company = company;
		this.designation = designation;
	}*/
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
