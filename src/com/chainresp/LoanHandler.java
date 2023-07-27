package com.chainresp;

public abstract class LoanHandler {
	protected LoanHandler handler;
	
	public void setForwardHandler(LoanHandler handler){
		this.handler = handler;
	}
	
	public abstract void applyLoan(Loan loan);
}
