package com.micros.services;

import org.springframework.stereotype.Service;

import com.micros.dto.PaymentDto;
import com.micros.services.impl.PaymentContext;
import com.paypal.core.rest.PayPalRESTException;

@Service
public interface PaymentService {
	public PaymentContext createPayment(PaymentDto paymentDto) throws PayPalRESTException;
}
