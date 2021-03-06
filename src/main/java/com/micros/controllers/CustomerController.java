package com.micros.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.micros.entities.Customer;
import com.micros.services.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService service;

	@GetMapping("/customers")
	public String listCustomers(Model model) {
		model.addAttribute("customers",service.getAllCustomers());
		return "customers";
	}
	
}
