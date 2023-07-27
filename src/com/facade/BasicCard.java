package com.facade;

public class BasicCard implements CreditCard{

	@Override
	public void charges() {
		System.out.println("Rs. 0");
	}
	
	@Override
	public void getLimit() {
		System.out.println("50K");
	}
}
