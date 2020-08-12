package com.cts.service;

import java.util.List;

import com.cts.model.CustomerDetails;

public interface ICustomerDetailsService {
	public List<CustomerDetails> getAlldetails();
	public CustomerDetails createcustomerDetails(CustomerDetails customerDetails);
	
}
