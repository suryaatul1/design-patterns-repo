package com.bridge;

public class UPI implements Payment{

	@Override
	public void limit() {
		System.out.println("UPI limit is 1L");
		
	}
	
}
