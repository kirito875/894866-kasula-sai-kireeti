package com.saikireeti.returnorder.componentprocessingmicroservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="packaging-delivery", url="${PACKANDDEL_URI:localhost:8100}")
public interface PackagingAndDeliveryProxy {

	@GetMapping("/GetPackagingDeliveryCharge/{componenttype}/{count}")
	public int getPackageDeliveryCharge(@PathVariable String componenttype,@PathVariable String count);
}
