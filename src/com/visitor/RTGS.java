package com.visitor;

public class RTGS implements Visitor{
	TransactionDetails details; 
	
	
	public RTGS(TransactionDetails details) {
		super();
		this.details = details;
	}


	@Override
	public double getCharge() {
		 
		return details.getAmount()*0.01;
	}
}
