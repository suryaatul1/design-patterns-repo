package com.decorator;

public class DecoratorController {
	public static void main(String[] args) {
		CreditCard cc = new BasicCard();
		
		CreditCardDecorator goldCard = new GoldCard(cc);
		goldCard.features();
		
		CreditCardDecorator diamondCard = new DiamondCard(cc);
		diamondCard.features();
	}
}
