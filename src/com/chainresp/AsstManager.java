package com.chainresp;

public class AsstManager extends LoanHandler{

	@Override
	public void applyLoan(Loan loan) {
		switch(loan.getType().toString()) {
		case "PERSONAL":
			if(loan.getAmount() < 500000) {
				System.out.println("loan processed by Asst Manager");
			}else {
				handler.applyLoan(loan);
			}
			break; 
		case "HOME":
			if(loan.getAmount() < 7000000) {
				System.out.println("loan processed by Asst Manager");
			}else {
				handler.applyLoan(loan);
			}
			break; 
		}
		 
	}
}
