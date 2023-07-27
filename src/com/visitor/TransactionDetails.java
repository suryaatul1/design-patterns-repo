package com.visitor;

public class TransactionDetails {

	private String accountId;
	private double amount; 
	private TransactionType type;
	
	
	public TransactionDetails(String accountId, double amount, TransactionType type) {
		super();
		this.accountId = accountId;
		this.amount = amount;
		this.type = type;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public TransactionType getType() {
		return type;
	}
	public void setType(TransactionType type) {
		this.type = type;
	}
	
	
}
