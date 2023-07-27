package com.visitor;

public class NEFT implements Visitor{
	TransactionDetails details;
	
	
	public NEFT(TransactionDetails details) {
		super();
		this.details = details;
	}


	@Override
	public double getCharge() {
		// TODO Auto-generated method stub
		return details.getAmount() * 0.005;
	}
}
