package com.example.demo.service;



import java.util.List;

import com.example.demo.entity.AccountSummaryResponce;
import com.example.demo.entity.AccountsEntity;

public interface AccountsService {
	
	public List<AccountsEntity>findAll();
	public AccountsEntity getAccountsBycifId(String cifId);
	public AccountsEntity createorAddAccounts(AccountsEntity accounts);
	public void deleteBycifId(String cifId);
	
	public AccountSummaryResponce accSummaryResponse(String cifId);
	

}
