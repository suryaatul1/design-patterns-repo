package com.visitor;

public class UPI implements Visitor{

	TransactionDetails details; 
	
	
	public UPI(TransactionDetails details) {
		super();
		this.details = details;
	}

	@Override
	public double getCharge() {
		if(details.getAmount() > 100000)
			return details.getAmount()*0.001;
		return 0;
	}
}
