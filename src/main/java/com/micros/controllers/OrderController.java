package com.micros.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/orders")
public class OrderController {

	@GetMapping("/new")
	public String displayOrderForm(){
		return "new-order";
	}
	
//	@PostMapping("/save")
//	public void saveOrder() {
//		
//		return "redirect::/new";
//	}
}
