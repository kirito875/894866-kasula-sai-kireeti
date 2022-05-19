package com.saikireeti.returnorder.returnorderportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ReturnOrderPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReturnOrderPortalApplication.class, args);
	}

}
