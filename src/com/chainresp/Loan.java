package com.chainresp;

public class Loan {
	private double amount;
	private LoanType type;

	public Loan(double amount, LoanType type) {
		super();
		this.amount = amount;
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LoanType getType() {
		return type;
	}

	public void setType(LoanType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Loan [amount=" + amount + ", type=" + type + "]";
	}

}
