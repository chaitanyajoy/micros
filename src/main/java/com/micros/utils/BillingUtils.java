package com.micros.utils;

import java.util.Arrays;
import java.util.List;

import com.micros.entities.Order;

public class BillingUtils {

	public static List<String> getStates() {	
		return Arrays.asList( "Andaman and Nicobar Islands", "Andhra Pradesh", "Arunachal Pradesh", "Assam",
				"Bihar", "Chandigarh", "Chhattisgarh", "Dadra and Nagar Haveli", "Daman and Diu", "Delhi", "Goa",
				"Gujarat", "Haryana", "Himachal Pradesh", "Jammu", "Jharkhand", "Karnataka", "Kashmir", "Kerala",
				"Ladakh", "Lakshadweep", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland",
				"Odisha", "Puducherry", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura",
				"Uttarakhand", "Uttar Pradesh", "West Bengal");
	}
	
	public static double calculatePrice(Order order) {

		double pricePerLetter = 75;
		double minimumPrice = 499;
		double maximumPrice = 999;
		double price = minimumPrice;
		int noOfCharcters = order.getCharacters().length();
		if (noOfCharcters > 5 && noOfCharcters <= 12)
			price = noOfCharcters * pricePerLetter;
		else if (noOfCharcters > 12)
			price = maximumPrice;
		return price;

	}
}
