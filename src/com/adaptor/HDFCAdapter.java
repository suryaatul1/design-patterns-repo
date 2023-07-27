package com.adaptor;

import com.model.Converter;
import com.model.Transaction;

public class HDFCAdapter implements Converter{

	private Transaction transaction; 
	
	public HDFCAdapter(Transaction transaction) {
		this.transaction = transaction;
	}


	@Override
	public String convert() {
		StringBuilder sb=new StringBuilder("");
		sb.append("[")
			.append(transaction.getFromAccount() + "@")
			.append(transaction.getBenificiaryAccount() + "@")
			.append(transaction.getAmount() + "@")
			.append(transaction.getDateOfTransaction() + "@") 
			.append("]");
		return sb.toString();
	}

}
