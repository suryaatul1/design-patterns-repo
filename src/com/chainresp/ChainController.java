package com.chainresp;

public class ChainController {
	public static void main(String[] args) {
		LoanHandler executive = new Executive();
		LoanHandler asstManager = new AsstManager();  
		LoanHandler manager = new Manager();  
		
		executive.setForwardHandler(asstManager);
		asstManager.setForwardHandler(manager);
		
		Loan loan = new Loan(150000,LoanType.PERSONAL);
		executive.applyLoan(loan);
		
		loan = new Loan(250000,LoanType.PERSONAL);
		executive.applyLoan(loan);
		
		loan = new Loan(600000,LoanType.PERSONAL);
		executive.applyLoan(loan);
		
		loan = new Loan(2400000,LoanType.HOME);
		executive.applyLoan(loan);
		
		loan = new Loan(5000000,LoanType.HOME);
		executive.applyLoan(loan);
		
		loan = new Loan(8000000,LoanType.HOME);
		executive.applyLoan(loan);
	}
}
