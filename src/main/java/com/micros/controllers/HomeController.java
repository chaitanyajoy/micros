package com.micros.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.micros.entities.Customer;
import com.micros.entities.Order;
import com.micros.services.OrderService;

@Controller
public class HomeController {
	
	private OrderService service;
	@GetMapping("/")
	public String displayHomeForm(Model model) {
		Order anOrder = new Order();
		model.addAttribute("order", anOrder);
		return "main/home";
	}


}
