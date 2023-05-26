package com.remitter.model;

public class Remitter {
	
	private int accountNumber;
	private String name;
	private String emailId;
	private String password;
	private int balance;
	private int accountStatus;
	private String ifsc;
	
	public Remitter() {
		
	}

	public Remitter(int accountNumber, String name, String emailId, String password, int balance, int accountStatus,
			String ifsc) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.balance = balance;
		this.accountStatus = accountStatus;
		this.ifsc = ifsc;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(int accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	@Override
	public String toString() {
		return "Remitter [accountNumber=" + accountNumber + ", name=" + name + ", emailId=" + emailId + ", password="
				+ password + ", balance=" + balance + ", accountStatus=" + accountStatus + ", ifsc=" + ifsc + "]";
	}
	
}
