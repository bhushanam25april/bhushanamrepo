package com.example.demo.entity;

import java.util.List;

public class AccountSummary {
	
	
private String errorCode;
private String errorDesc;
private String statusCode;
private String statusDesc;
private String customerName;

private List<AccountsEntity> accounts;

public String getErrorCode() {
	return errorCode;
}

public void setErrorCode(String errorCode) {
	this.errorCode = errorCode;
}

public String getErrorDesc() {
	return errorDesc;
}

public void setErrorDesc(String errorDesc) {
	this.errorDesc = errorDesc;
}

public String getStatusCode() {
	return statusCode;
}

public void setStatusCode(String statusCode) {
	this.statusCode = statusCode;
}

public String getStatusDesc() {
	return statusDesc;
}

public void setStatusDesc(String statusDesc) {
	this.statusDesc = statusDesc;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public List<AccountsEntity> getAccounts() {
	return accounts;
}

public void setAccounts(List<AccountsEntity> accounts) {
	this.accounts = accounts;
}





}
