package com.bridge;

public abstract class Account {
	protected NEFT neft;
	protected UPI upi;
	
	public Account(NEFT neft, UPI upi) {
		this.neft = neft;
		this.upi = upi;
	}
	abstract void features();
}
