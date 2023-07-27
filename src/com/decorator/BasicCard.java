package com.decorator;

public class BasicCard extends CreditCard{ //BasicCard is-a CreditCard

	@Override
	public void features() {
		System.out.println("Basic Limit: 50K");
		
	}
}
