package com.facade;

public class GoldCard implements CreditCard{

	@Override
	public void charges() {
		System.out.println("Rs. 10K/year");
	}
	
	@Override
	public void getLimit() {
		System.out.println("5L");
		
	}
}
