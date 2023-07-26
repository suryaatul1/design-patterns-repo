package com.bridge;

public class CurrentAccount extends Account{
	
	public CurrentAccount(NEFT neft, UPI upi){
		super(neft,upi);
	}
	@Override
	void features() {
		System.out.println("UPI Available" );
		upi.limit();
		System.out.println("NEFT AVailable");
		neft.limit();
	}
}
