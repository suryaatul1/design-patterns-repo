package com.decorator;

public class CreditCardDecorator {
	private CreditCard creditCard;

	public CreditCardDecorator(CreditCard creditCard) {
		this.creditCard = creditCard;
	} 
	
	public void features() {
		creditCard.features();
	}
}
