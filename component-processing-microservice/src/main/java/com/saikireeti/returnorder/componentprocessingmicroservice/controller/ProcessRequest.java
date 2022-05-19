package com.saikireeti.returnorder.componentprocessingmicroservice.controller;

public class ProcessRequest {

	private String username;
	private long contactnumber;
	private String componenttype;
	private String componentname;
	private int count;
	
	public ProcessRequest() {
		
	}
	public ProcessRequest(String username, long contactnumber, String componenttype, String componentname, int count) {
		super();
		this.username = username;
		this.contactnumber = contactnumber;
		this.componenttype = componenttype;
		this.componentname = componentname;
		this.count = count;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getComponenttype() {
		return componenttype;
	}
	public void setComponenttype(String componenttype) {
		this.componenttype = componenttype;
	}
	public String getComponentname() {
		return componentname;
	}
	public void setComponentname(String componentname) {
		this.componentname = componentname;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
