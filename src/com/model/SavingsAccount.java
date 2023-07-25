package com.model;

public class SavingsAccount extends Account{

	private String accountNumber; 
	private double rateOfInterest;
	
	
	public SavingsAccount(String accountNumber, double rateOfInterest) {
		super();
		this.accountNumber = accountNumber;
		this.rateOfInterest = rateOfInterest;
	}
	
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
	@Override
	public double getRateOfInterest() {
		return rateOfInterest;
	} 
	
	
}
