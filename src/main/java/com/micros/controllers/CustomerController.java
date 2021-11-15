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

//	public CustomerController(CustomerService service) {
//		super();
//		this.service = service;
//	}
	
	@GetMapping("/customers")
	public String listCustomers(Model model) {
//		Customer customer1 = new Customer();
//		Customer customer2 = new Customer();
//		Customer customer3 = new Customer();
//		Customer customer4 = new Customer();
//		customer1.setName("Samuel");
//		customer2.setName("kiran");
//		customer3.setName("herod");
//		service.saveCustomer(customer1);
//		service.saveCustomer(customer2);
//		service.saveCustomer(customer3);
//		service.saveCustomer(customer4);
		
		model.addAttribute("customers",service.getAllCustomers());
		return "customers";
	}
	
}
