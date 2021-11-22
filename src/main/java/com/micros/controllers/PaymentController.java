package com.micros.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.micros.dto.PaymentDto;
import com.micros.entities.Order;
import com.micros.services.PaymentService;
import com.micros.services.impl.PaymentContext;
import com.paypal.core.rest.PayPalRESTException;

@Controller
public class PaymentController {

	@Autowired
	private PaymentService service;
	
	@PostMapping("/pay")
	public String receivePayment(@ModelAttribute("orders") Order order) throws PayPalRESTException {
		PaymentContext paymentContext = service.createPayment(new PaymentDto(order));	
		return "redirect:" + (String) paymentContext.paymentConfigMap.get("urlAfterPayment");
	}
}
