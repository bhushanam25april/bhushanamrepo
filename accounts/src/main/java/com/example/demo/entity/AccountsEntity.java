package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "accounts")
public class AccountsEntity {

	@Id
	@Column(name = "CIF_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String cifId;
	@Column(name = "ACCOUNT_NO")
	private String ACCOUNT_NO;
	@Column(name = "ACCOUNT_SHORT_NAME")
	private String ACCOUNT_SHORT_NAME;
	@Column(name = "CUSTOMER_NAME")
	private String CUSTOMER_NAME;
	@Column(name = "ACCOUNT_CURRENCY")
	private String ACCOUNT_CURRENCY;
	@Column(name = "STATUS")
	private String STATUS;
	@Column(name = "AVALABLE_BALANCE")
	private double AVALABLE_BALANCE;
	@Column(name = "CURRENT_BAL")
	private double CURRENT_BAL;
	@Column(name ="TOTAL_OVERDRADFT")
	private double TOTAL_OVERDRADFT;
	@Column(name = "ACCOUNT_BRANCH")
	private String ACCOUNT_BRANCH;
	@Column(name = "OPERATION_INSTRUCTIONS")
	private String OPERATION_INSTRUCTIONS;
	@Column(name = "SHOW_ACCOUNTS")
	private String SHOW_ACCOUNTS;
	public String getACCOUNT_NO() {
		return ACCOUNT_NO;
	}
	public void setACCOUNT_NO(String aCCOUNT_NO) {
		ACCOUNT_NO = aCCOUNT_NO;
	}
	
	public String getCifId() {
		return cifId;
	}
	public void setCifId(String cifId) {
		this.cifId = cifId;
	}
	public String getACCOUNT_SHORT_NAME() {
		return ACCOUNT_SHORT_NAME;
	}
	public void setACCOUNT_SHORT_NAME(String aCCOUNT_SHORT_NAME) {
		ACCOUNT_SHORT_NAME = aCCOUNT_SHORT_NAME;
	}
	public String getCUSTOMER_NAME() {
		return CUSTOMER_NAME;
	}
	public void setCUSTOMER_NAME(String cUSTOMER_NAME) {
		CUSTOMER_NAME = cUSTOMER_NAME;
	}
	public String getACCOUNT_CURRENCY() {
		return ACCOUNT_CURRENCY;
	}
	public void setACCOUNT_CURRENCY(String aCCOUNT_CURRENCY) {
		ACCOUNT_CURRENCY = aCCOUNT_CURRENCY;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public double getAVALABLE_BALANCE() {
		return AVALABLE_BALANCE;
	}
	public void setAVALABLE_BALANCE(double aVALABLE_BALANCE) {
		AVALABLE_BALANCE = aVALABLE_BALANCE;
	}
	public double getCURRENT_BAL() {
		return CURRENT_BAL;
	}
	public void setCURRENT_BAL(double cURRENT_BAL) {
		CURRENT_BAL = cURRENT_BAL;
	}
	public double getTOTAL_OVERDRADFT() {
		return TOTAL_OVERDRADFT;
	}
	public void setTOTAL_OVERDRADFT(double tOTAL_OVERDRADFT) {
		TOTAL_OVERDRADFT = tOTAL_OVERDRADFT;
	}
	public String getACCOUNT_BRANCH() {
		return ACCOUNT_BRANCH;
	}
	public void setACCOUNT_BRANCH(String aCCOUNT_BRANCH) {
		ACCOUNT_BRANCH = aCCOUNT_BRANCH;
	}
	public String getOPERATION_INSTRUCTIONS() {
		return OPERATION_INSTRUCTIONS;
	}
	public void setOPERATION_INSTRUCTIONS(String oPERATION_INSTRUCTIONS) {
		OPERATION_INSTRUCTIONS = oPERATION_INSTRUCTIONS;
	}
	public String getSHOW_ACCOUNTS() {
		return SHOW_ACCOUNTS;
	}
	public void setSHOW_ACCOUNTS(String sHOW_ACCOUNTS) {
		SHOW_ACCOUNTS = sHOW_ACCOUNTS;
	}
	
	
	
	
	
	
	
}
