package com.decorator;

public class DiamondCard extends CreditCardDecorator{

	public DiamondCard(CreditCard creditCard) {
		super(creditCard);
	}
	
	public void features() {
		super.features();
		System.out.println("Extra limit: Rs. 2L");
	}
}
