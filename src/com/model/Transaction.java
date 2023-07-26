package com.model;

import java.time.LocalDate;

public class Transaction {
	private int id;
	private String fromAccount;
	private String benificiaryAccount;
	private double amount;
	private LocalDate dateOfTransaction;

	public Transaction(int id, String fromAccount, String benificiaryAccount, double amount,
			LocalDate dateOfTransaction) {
		super();
		this.id = id;
		this.fromAccount = fromAccount;
		this.benificiaryAccount = benificiaryAccount;
		this.amount = amount;
		this.dateOfTransaction = dateOfTransaction;
	}

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public String getBenificiaryAccount() {
		return benificiaryAccount;
	}

	public void setBenificiaryAccount(String benificiaryAccount) {
		this.benificiaryAccount = benificiaryAccount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getDateOfTransaction() {
		return dateOfTransaction;
	}

	public void setDateOfTransaction(LocalDate dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", fromAccount=" + fromAccount + ", benificiaryAccount=" + benificiaryAccount
				+ ", amount=" + amount + ", dateOfTransaction=" + dateOfTransaction + "]";
	}

}
