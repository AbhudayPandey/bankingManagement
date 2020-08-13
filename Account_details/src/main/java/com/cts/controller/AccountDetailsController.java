package com.cts.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.model.AccountDetails;
import com.cts.service.AccountDetailsService;


@RestController
public class AccountDetailsController {
	@Autowired
	AccountDetailsService service;
	// 1. Get all Account details
	@GetMapping("/AccountDetails")
	public List<AccountDetails> getAlldetails(){
	    return service.getAlldetails();
	}

	
	// 2. Add new Customer details
	@PostMapping("/AddAccount")
	public AccountDetails createaccountdetails(@RequestBody AccountDetails accountdetails) {
	    return service.createaccountdetails(accountdetails);
	}

}
