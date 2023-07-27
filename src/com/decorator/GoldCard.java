package com.decorator;


public class GoldCard extends CreditCardDecorator{

	GoldCard(CreditCard creditCard){
		super(creditCard);
	}
	
	public void features() {
		super.features();
		System.out.println("Extra limit: Rs. 1L");
	}
}
