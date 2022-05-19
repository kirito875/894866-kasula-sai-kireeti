package com.saikireeti.returnorder.returnorderportal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="Authorization", url="${AUTHORIZATION_URI:localhost:8200}")
public interface AuthorizationProxy {

	@GetMapping("/GenerateToken/{username}")
    public String getTokenForUser(@PathVariable String username);
	
}
