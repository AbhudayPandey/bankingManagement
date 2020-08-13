package com.cts.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.AccountDetails;
import com.cts.repository.AccountDetailsRepository;
@Service
@Transactional
public class AccountDetailsService {
	@Autowired
	AccountDetailsRepository repository;
	
	public List<AccountDetails> getAlldetails(){
		return (List<AccountDetails>) repository.findAll();
	}
	
	public AccountDetails createaccountdetails(AccountDetails accountDetails) {
		return repository.save(accountDetails);
	}	

}
