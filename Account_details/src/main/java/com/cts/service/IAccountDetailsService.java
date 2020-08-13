package com.cts.service;

import java.util.List;

import com.cts.model.AccountDetails;

public interface IAccountDetailsService {
	public List<AccountDetails> getAlldetails();
	public AccountDetails createaccountdetails(AccountDetails accountDetails);
}
