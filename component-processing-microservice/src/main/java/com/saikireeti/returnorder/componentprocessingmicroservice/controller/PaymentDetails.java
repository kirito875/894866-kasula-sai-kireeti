package com.saikireeti.returnorder.componentprocessingmicroservice.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PaymentDetails {

	@Id
	private long requestid;
	private long creditcardnumber;
	private int creditlimit;
	private int processingcharge;
	
	public PaymentDetails() {
	
	}
	public PaymentDetails(long requestid, long creditcardnumber, int creditlimit, int processingcharge) {
		super();
		this.requestid = requestid;
		this.creditcardnumber = creditcardnumber;
		this.creditlimit = creditlimit;
		this.processingcharge = processingcharge;
	}
	public long getRequestid() {
		return requestid;
	}
	public void setRequestid(long requestid) {
		this.requestid = requestid;
	}
	public long getCreditcardnumber() {
		return creditcardnumber;
	}
	public void setCreditcardnumber(long creditcardnumber) {
		this.creditcardnumber = creditcardnumber;
	}
	public int getCreditlimit() {
		return creditlimit;
	}
	public void setCreditlimit(int creditlimit) {
		this.creditlimit = creditlimit;
	}
	public int getProcessingcharge() {
		return processingcharge;
	}
	public void setProcessingcharge(int processingcharge) {
		this.processingcharge = processingcharge;
	}
	
}
