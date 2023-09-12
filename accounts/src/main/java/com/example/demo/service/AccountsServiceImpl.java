package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AccountSummary;
import com.example.demo.entity.AccountSummaryResponce;
import com.example.demo.entity.AccountsEntity;
import com.example.demo.repo.AccountsRepository;
@Service
public class AccountsServiceImpl implements AccountsService{

	@Autowired
	private AccountsRepository accountsRepository;
	@Override
	public List<AccountsEntity> findAll() {
		
		return this.accountsRepository.findAll();
	}

	@Override
	public AccountsEntity getAccountsBycifId(String cifId) {
		Optional<AccountsEntity> acc = accountsRepository.findById(cifId);
		return acc.get();
	}

	@Override
	public AccountsEntity createorAddAccounts(AccountsEntity accounts) {
		
		return accountsRepository.save(accounts);
	}

	@Override
	public void deleteBycifId(String cifId) {
		accountsRepository.deleteById(cifId);
		
	}

	@Override
	public AccountSummaryResponce accSummaryResponse(String cifId) {
		//Optional<AccountsEntity> accounts = accountsRepository.findAllById(cifId);
		
		List<AccountsEntity> accounts = accountsRepository.findAllByCifId(cifId);
	
	AccountSummary accountSummar=new AccountSummary();
	
	
	accountSummar.setAccounts(accounts);
	accountSummar.setCustomerName("TEST_CUSTOMER_013269383");
	accountSummar.setErrorCode("Test");
	accountSummar.setStatusCode("Test");
	accountSummar.setStatusDesc("Test");
	accountSummar.setErrorDesc("Test ");
		
		AccountSummaryResponce r=new AccountSummaryResponce();
		
		r.setStatus("test");
		r.setAccountSummary(accountSummar);
		
		
		
		return r;
	}

}
