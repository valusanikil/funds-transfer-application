package com.remitter.model;


public class FundTransfer {
	private int transactionId;
	private int beneficiaryAccountNumber;
	private int remitterAccountNumber;
	private int transactionAmount;
	private String transactionStatus;
	private String transactionDate;
	
	public FundTransfer() {
		
	}

	public FundTransfer(int transactionId, int beneficiaryAccountNumber, int remitterAccountNumber,
			int transactionAmount, String transactionStatus, String transactionDate) {
		super();
		this.transactionId = transactionId;
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
		this.remitterAccountNumber = remitterAccountNumber;
		this.transactionAmount = transactionAmount;
		this.transactionStatus = transactionStatus;
		this.transactionDate = transactionDate;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getBeneficiaryAccountNumber() {
		return beneficiaryAccountNumber;
	}

	public void setBeneficiaryAccountNumber(int beneficiaryAccountNumber) {
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
	}

	public int getRemitterAccountNumber() {
		return remitterAccountNumber;
	}

	public void setRemitterAccountNumber(int remitterAccountNumber) {
		this.remitterAccountNumber = remitterAccountNumber;
	}

	public int getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	@Override
	public String toString() {
		return "FundTransfer [transactionId=" + transactionId + ", beneficiaryAccountNumber=" + beneficiaryAccountNumber
				+ ", remitterAccountNumber=" + remitterAccountNumber + ", transactionAmount=" + transactionAmount
				+ ", transactionStatus=" + transactionStatus + ", transactionDate=" + transactionDate + "]";
	}
	
}
