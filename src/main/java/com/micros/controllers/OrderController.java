package com.micros.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.micros.entities.Customer;
import com.micros.services.OrderService;
import com.micros.utils.BillingUtils;

@Controller
public class OrderController {

	@Autowired
	private OrderService service;

	@PostMapping("/new")
	public String newOrderForm(@RequestParam String characters, Model model) {
		
		Customer customer = new Customer();
		if(!characters.isEmpty())
			model.addAttribute("characters", characters);
		model.addAttribute("customer",customer);
		model.addAttribute("states", BillingUtils.getStates());
		return "main/billing";
	}

}
