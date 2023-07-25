package com.model;

public class CurrentAccount extends Account{
	
	private String accountNumber; 
	private double rateOfInterest;
	
	public CurrentAccount(String accountNumber, double rateOfInterest) {
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
