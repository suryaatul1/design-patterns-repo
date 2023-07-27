package com.chainresp;

public class Executive extends LoanHandler{

	@Override
	public void applyLoan(Loan loan) {
		switch(loan.getType().toString()) {
		case "PERSONAL":
			if(loan.getAmount() < 200000) {
				System.out.println("loan processed by Executive");
			}else {
				handler.applyLoan(loan);
			}
			break; 
		case "HOME":
			if(loan.getAmount() < 2500000) {
				System.out.println("loan processed by Executive");
			}else {
				handler.applyLoan(loan);
			}
			break; 
		}
		
		 
		
	}
}
