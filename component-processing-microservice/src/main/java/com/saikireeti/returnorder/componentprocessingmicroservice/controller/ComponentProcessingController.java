package com.saikireeti.returnorder.componentprocessingmicroservice.controller;


import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ComponentProcessingController {
	
	@Autowired
	private PackagingAndDeliveryProxy proxy;
	
	@Autowired
	private AuthorizationProxy authProxy;
	
	@Autowired
	private PaymentDetailsRepository paymentDetailsRepository;

	@PostMapping("/ProcessDetail")
	@CrossOrigin(origins = "${CROSSORIGIN_URI:http://localhost:4200}")
	public ProcessResponse getProcessDetail(@RequestHeader("Authorization") String token,@RequestBody ProcessRequest processRequest) {
		try {
		    Boolean valid=authProxy.getValidationForToken(token);
		    if(valid==false) {
		    	return null;
		    }
		}
		catch(Exception e) {
			throw e;
		}
		int packagedeliverycost=proxy.getPackageDeliveryCharge(processRequest.getComponenttype(),String.valueOf(processRequest.getCount()));
		String accessory="accessory";
		String integral="integraltype";
		String protectivesheath="protectivesheath";
		Date date=new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date); 
		int processCharge=0;
		if(processRequest.getComponenttype().equals(accessory)) {
			calendar.add(Calendar.DATE, 2);
			date=calendar.getTime();
			processCharge=300;
		}
		else if(processRequest.getComponenttype().equals(integral)) {
			calendar.add(Calendar.DATE, 5);
			date=calendar.getTime();
			processCharge=500;
		}
		return new ProcessResponse(1001L,processCharge,packagedeliverycost,date);
		
	}
	
	@PostMapping("/CompleteProcessing")
	@CrossOrigin(origins = "${CROSSORIGIN_URI:http://localhost:4200}")
	public String completeProcessing(@RequestHeader("Authorization") String token,@RequestBody PaymentDetails paymentDetails) {
		try {
		    Boolean valid=authProxy.getValidationForToken(token);
		    if(valid==false) {
		    	return null;
		    }
		}
		catch(Exception e) {
			throw e;
		}
		PaymentDetails saveddetails=paymentDetailsRepository.save(paymentDetails);
		return new String("sucessfully saved");
	}
	
	
}
