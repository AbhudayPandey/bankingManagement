package com.cts.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.CustomerDetails;
import com.cts.respository.*;
@Service
@Transactional
public class CustomerDetailsService {
	@Autowired
	CustomerDetailsRepository repository;
	
	public List<CustomerDetails> getAlldetails(){
		return (List<CustomerDetails>) repository.findAll();
	}
	
	public CustomerDetails createcustomerDetails(CustomerDetails customerDetails) {
		return repository.save(customerDetails);
	}
	
}
