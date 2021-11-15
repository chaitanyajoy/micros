package com.micros.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.micros.entities.Customer;

public interface CustomerService {
	public void saveCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	
}
