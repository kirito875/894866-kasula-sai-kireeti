package com.saikireeti.returnorder.returnorderportal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {
	
	@Id
	private  String username;
	private  String password;
	
	public UserDetails() {
		
	}
	public UserDetails(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
