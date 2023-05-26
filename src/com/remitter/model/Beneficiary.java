package com.remitter.model;

public class Beneficiary {
	
	private int bAccountNumber;
	private String bName;
	private String bankname;
	private String IFSC;
	private int currentBalance;
	private String email;
	
	public Beneficiary() {
		
	}

	public Beneficiary(int bAccountNumber, String bName, String bankname, String iFSC, int currentBalance,
			String email) {
		super();
		this.bAccountNumber = bAccountNumber;
		this.bName = bName;
		this.bankname = bankname;
		IFSC = iFSC;
		this.currentBalance = currentBalance;
		this.email = email;
	}

	public int getbAccountNumber() {
		return bAccountNumber;
	}

	public void setbAccountNumber(int bAccountNumber) {
		this.bAccountNumber = bAccountNumber;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getIFSC() {
		return IFSC;
	}

	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}

	public int getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(int currentBalance) {
		this.currentBalance = currentBalance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Beneficiary [bAccountNumber=" + bAccountNumber + ", bName=" + bName + ", bankname=" + bankname
				+ ", IFSC=" + IFSC + ", currentBalance=" + currentBalance + ", email=" + email + "]";
	}
	
}
