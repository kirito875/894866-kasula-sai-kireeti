package com.saikireeti.returnorder.componentprocessingmicroservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name="Authorization", url="${AUTHORIZATION_URI:localhost:8200}")
public interface AuthorizationProxy {

	@GetMapping("/ValidateToken")
	public Boolean getValidationForToken(@RequestHeader("Authorization") String token);
	
}
