package com.visitor;

public class Transaction implements Visitable{

	private Visitor visitor;
	
	
	public Transaction(Visitor visitor) { //new UPI()
	 
		this.visitor = visitor;
	}


	@Override
	public void accept() {
		System.out.println("Accepted");
		System.out.println("Transaction charge :" + visitor.getCharge());
	}
}
