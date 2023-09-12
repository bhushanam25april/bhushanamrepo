package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AccountSummaryResponce;
import com.example.demo.entity.AccountsEntity;
import com.example.demo.service.AccountsService;

@RestController
@RequestMapping("/accounts")
public class AccountsController {
	
	@Autowired
	private AccountsService accountsService;
	
	@GetMapping()
	public List<AccountsEntity> getAllAccount(){
		return this.accountsService.findAll();
	}
	@GetMapping("/{cifId}")
	public AccountsEntity getAccount(@PathVariable("cifId") String cifId) {
		return this.accountsService.getAccountsBycifId(cifId);
		
	}
	@PostMapping 
	public AccountsEntity createorAddAccounts(@RequestBody AccountsEntity accouts) {
		return this.accountsService.createorAddAccounts(accouts);
	}
	@DeleteMapping("/{cifId}")
	public void deleteBycifId(@PathVariable("cifId")  String cifId) {
		this.accountsService.deleteBycifId(cifId);
	}
	@GetMapping("/dto/{cifId}")
	public AccountSummaryResponce AccountSummaryResponce(@PathVariable("cifId") String cifId){
	
		return this.accountsService.accSummaryResponse(cifId);
	}

	
	
	
	
	
}
