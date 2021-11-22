package com.micros.dto;

import com.micros.entities.Order;
import com.paypal.core.rest.APIContext;

public class PaymentDto {

	private String host ="http://local:host";
	public double total;
	public String currency;
	public String method;
	public String intent;
	public String description;
	public String cancelUrl;
	public String successUrl;

	public PaymentDto(Order order) {
		super();
		this.total = order.getCost();
		this.currency = "INR";
		this.method = method;
		this.intent = intent;
		this.description = "Pencil Craft miniature art";
		this.cancelUrl = this.host + "/cancel";
		this.successUrl = this.host + "/success";
	}

}
