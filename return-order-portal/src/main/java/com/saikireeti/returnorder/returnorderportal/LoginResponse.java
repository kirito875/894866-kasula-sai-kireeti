package com.saikireeti.returnorder.returnorderportal;

public class LoginResponse {
	
	private String loginStatus;
	private String jwtToken;
	
	
	public LoginResponse() {
		
	}
	public LoginResponse(String loginStatus, String jwtToken) {
		super();
		this.loginStatus = loginStatus;
		this.jwtToken = jwtToken;
	}
	public String getLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
	public String getJwtToken() {
		return jwtToken;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}

}
