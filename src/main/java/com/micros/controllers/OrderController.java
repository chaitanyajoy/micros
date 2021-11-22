package com.micros.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.micros.dto.PaymentDto;
import com.micros.entities.Customer;
import com.micros.entities.Order;
import com.micros.services.CustomerService;
import com.micros.services.OrderService;
import com.micros.utils.BillingUtils;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private CustomerService custService;

	@PostMapping("/new")
	public String newOrderForm(@ModelAttribute("order") Order order, Model model) {
		Customer customer = new Customer();
		List<Order> orderList = new ArrayList();
		
		model.addAttribute("orders", order);
		model.addAttribute("customer",customer);
		model.addAttribute("states", BillingUtils.getStates());
		
		orderList.add(order);
		customer.setOrder(orderList);
		order.setCustomer(customer);
		return "main/billing";
	}
	
	@PostMapping("/checkout")
	public String orderCheckout(@ModelAttribute("customer") Customer customer, @ModelAttribute("orders") Order order, Model model) {
		List<Order> orderList = new ArrayList();
		order.setCost(BillingUtils.calculatePrice(order));
		orderList.add(order);
		customer.setOrder(orderList);
		orderService.saveOrder(order);
		custService.saveCustomer(customer);
		
		return "order-success";
	}
	
}
