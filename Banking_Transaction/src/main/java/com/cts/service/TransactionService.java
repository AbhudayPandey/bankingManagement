package com.cts.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Transaction;
import com.cts.repository.TransactionRepository;

@Service
@Transactional
public class TransactionService implements ITransactionService {
	
	@Autowired
	TransactionRepository repository;
	
	public List<Transaction> getAllTransact(){
		return (List<Transaction>) repository.findAll();
	}
	
	public Transaction saveTransact(Transaction transact) {
		return repository.save(transact);
	}
	
	public Optional<Transaction> getById(Long id) {
		return repository.findById(id);
	}
	
	public void deleteTransact(Long id) {
		repository.deleteById(id);
	}



}
