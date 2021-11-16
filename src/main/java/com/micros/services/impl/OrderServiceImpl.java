package com.micros.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micros.entities.Order;
import com.micros.repository.OrderRepo;
import com.micros.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepo orderRepo;
	
	@Override
	public void saveOrder(Order order) {
		orderRepo.save(order);
	}

}
