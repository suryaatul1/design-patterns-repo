package com.bridge;

public class NEFT implements Payment{

	@Override
	public void limit() {
		System.out.println("NEFT limit is 2L");
	}
}
