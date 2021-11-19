package com.micros.dto;

import com.micros.entities.Customer;

public class CustomerDto {

	public String firstName;
	public String lastName;
	public String address;
	public long phoneNumber;
	public String email;
	public String country;
	public String state;
	public long pincode;
	
	public void customerDto(Customer customer){
		
		this.firstName=customer.getFirstName();
		this.lastName=customer.getLastName();
		this.address=customer.getAddress();
		this.phoneNumber=customer.getPhoneNumber();
		this.email=customer.getEmail();
		this.country=customer.getCountry();
		this.state=customer.getState();
		this.pincode=customer.getPincode();
	}
	
}
