package com.saikireeti.returnorder.packagingdeliverymicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PackagingDeliveryController {

	
	@GetMapping("/GetPackagingDeliveryCharge/{componenttype}/{count}")
	public int getPackageDeliveryCharge(@PathVariable String componenttype,@PathVariable String count) {
		
		int totalcost=0;
		String accessory="accessory";
		String integral="integraltype";
		String protectivesheath="protectivesheath";
		if(componenttype.equals(accessory)) {
			totalcost=150*Integer.parseInt(count);
		}
		if(componenttype.equals(integral)) {
			totalcost=300*Integer.parseInt(count);
		}
		if(componenttype.equals(protectivesheath)) {
			totalcost=50*Integer.parseInt(count);
		}
		return totalcost;
	}

}
