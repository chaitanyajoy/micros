package com.micros.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.micros.entities.Order;

@Controller
public class HomeController {
	
	
	
	@GetMapping("/")
	public String displayHomePage(Model model) {
		Order anOrder = new Order();
		model.addAttribute("order", anOrder);
		return "main/home";
	}

}
