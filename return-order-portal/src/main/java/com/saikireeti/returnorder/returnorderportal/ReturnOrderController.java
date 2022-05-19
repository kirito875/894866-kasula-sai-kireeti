package com.saikireeti.returnorder.returnorderportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ReturnOrderController {

	@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	@Autowired
	private AuthorizationProxy proxy;
	
	@PostMapping("/login")
	public LoginResponse loginUserCredentials(@RequestBody UserDetails userDetails) {
		
		String givenname=userDetails.getUsername();
		
		try {
		UserDetails userfound=userDetailsRepository.getById(givenname);
		String token=proxy.getTokenForUser(userfound.getUsername());
			if(userfound.getPassword().equals(userDetails.getPassword())) {
				
				return new LoginResponse("success",token);
			}
			else {
				return new LoginResponse("wrong password",null);
			}
		
		}
		catch(Exception e) {
			return new LoginResponse("no user found",null);
		}
		
	}
	
	
}
