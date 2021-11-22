package com.micros.services.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class PaymentContext {

	public static Map<String, Object> paymentConfigMap = new HashMap<>();
}
