package com.cts.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.CustomerDetailsApplication;
import com.cts.model.CustomerDetails;
import com.cts.service.CustomerDetailsService;

@RestController
public class CustomerDetailsController {
	
	Logger logger = LoggerFactory.getLogger(CustomerDetailsApplication.class);
	//Customer
		@Autowired
		CustomerDetailsService service;
		
		// 1. Get all Customer details
		@GetMapping("/CustomerDetails")
		public List<CustomerDetails> getAlldetails(){
		    return service.getAlldetails();
		}
		
		// 2. Add new Customer details
		@PostMapping("/AddCustomerDetails")
		public CustomerDetails createcustomerDetails(@RequestBody CustomerDetails customerDetails) {
		    return service.createcustomerDetails(customerDetails);
		}
}
