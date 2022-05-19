package com.saikireeti.returnorder.componentprocessingmicroservice.controller;

import java.util.Date;

public class ProcessResponse {

	private Long requestid;
	private int processingcharge;
	private int packaginganddeliverycharge;
	private Date dateofdelivery;
	
	public ProcessResponse() {

	}
	public ProcessResponse(Long requestid, int processingcharge, int packaginganddeliverycharge, Date dateofdelivery) {
		super();
		this.requestid = requestid;
		this.processingcharge = processingcharge;
		this.packaginganddeliverycharge = packaginganddeliverycharge;
		this.dateofdelivery = dateofdelivery;
	}
	public Long getRequestid() {
		return requestid;
	}
	public void setRequestid(Long requestid) {
		this.requestid = requestid;
	}
	public int getProcessingcharge() {
		return processingcharge;
	}
	public void setProcessingcharge(int processingcharge) {
		this.processingcharge = processingcharge;
	}
	public int getPackaginganddeliverycharge() {
		return packaginganddeliverycharge;
	}
	public void setPackaginganddeliverycharge(int packaginganddeliverycharge) {
		this.packaginganddeliverycharge = packaginganddeliverycharge;
	}
	public Date getDateofdelivery() {
		return dateofdelivery;
	}
	public void setDateofdelivery(Date dateofdelivery) {
		this.dateofdelivery = dateofdelivery;
	}
}
