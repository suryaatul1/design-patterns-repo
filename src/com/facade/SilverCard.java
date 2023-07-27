package com.facade;

public class SilverCard implements CreditCard{

	@Override
	public void charges() {
		System.out.println("Rs. 1K/year");
		
	}
	
	@Override
	public void getLimit() {
		System.out.println("2L");
	}
}
