package com.chainresp;

public class Manager extends LoanHandler{
@Override
public void applyLoan(Loan loan) {
	 System.out.println("loan processed by Manager");
 }
}
