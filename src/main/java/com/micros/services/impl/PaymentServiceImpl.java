package com.micros.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micros.dto.PaymentDto;
import com.micros.services.PaymentService;
import com.paypal.api.payments.Link;
import com.paypal.api.payments.Payment;
import com.paypal.core.rest.PayPalRESTException;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaypalService service;
	@Autowired
	PaymentContext paymentContext;

	public PaymentContext createPayment(PaymentDto paymentDto) throws PayPalRESTException {
		String postPaymentUrl="";
		Payment payment = service.createPaypalPayment(paymentDto.total,
				paymentDto.currency,
				paymentDto.method, 
				paymentDto.intent,
				paymentDto.description,
				paymentDto.cancelUrl, 
				paymentDto.successUrl);
		
		
//		 payment.getLinks().stream()
//		.filter(link -> link.getHref().contains("approval_url"))
//		.forEach(paymentContext.paymentConfigMap.put("urlAfterPayment", postPaymentUrl));
		
		for(Link link: payment.getLinks()) {
			if(link.getRel().contains("approval_url")) {
				postPaymentUrl= link.getHref();
			}else {
				postPaymentUrl=	"/success";
			}
		}
		paymentContext.paymentConfigMap.put("urlAfterPayment", postPaymentUrl);
		return paymentContext;
	}

}
