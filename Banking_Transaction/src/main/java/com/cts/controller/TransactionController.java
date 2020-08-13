package com.cts.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.exception.TransactionException;
import com.cts.model.Transaction;
import com.cts.service.TransactionService;

import io.swagger.annotations.ApiOperation;


@RestController
public class TransactionController {
	
	@Autowired
	TransactionService service;
	
	@GetMapping("/transaction")
	@ApiOperation(value = "Find All Transactions",
	notes="Return all transaction with there details",
	response = Transaction.class)
	public List<Transaction> getAllTransaction() {
	    return service.getAllTransact();
	}
	
	@ApiOperation(value = "Create a new Transactions",
			notes="Put new transaction into the List",
			response = Transaction.class)
	@PostMapping("/transaction")
	public Transaction createTransaction(@Valid @RequestBody Transaction transact) {
	    return service.saveTransact(transact);
	}
	
	@ApiOperation(value = "Find Transactions from the Transaction List",
			notes="Use transaction Id for Searching",
			response = Transaction.class)
	@GetMapping("/transaction/{id}")
	public Transaction getById(@PathVariable(value = "id") Long id) {
	    return service.getById(id)
	            .orElseThrow(() -> new TransactionException("Transact", "id", id));
	}
	
	@ApiOperation(value = "Delete Transactions from List",
			notes="Delete Existing transaction from the List",
			response = Transaction.class)
	@DeleteMapping("/transaction/{id}")
	public ResponseEntity<?> deleteId(@PathVariable(value = "id") Long id) {
		Transaction transact = service.getById(id)
	            .orElseThrow(() -> new TransactionException("Transact", "id", id));

		service.deleteTransact(id);

	    return ResponseEntity.ok().build();
	}

}
