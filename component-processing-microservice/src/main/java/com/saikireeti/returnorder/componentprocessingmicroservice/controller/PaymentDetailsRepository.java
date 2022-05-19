package com.saikireeti.returnorder.componentprocessingmicroservice.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails,Long> {

}
