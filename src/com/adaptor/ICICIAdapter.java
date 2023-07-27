package com.adaptor;

import com.model.Converter;
import com.model.Transaction;

public class ICICIAdapter implements Converter{
	
	Transaction transaction;

	public ICICIAdapter(Transaction transaction) {
		this.transaction = transaction;
	}

	@Override
	public String convert() {
		StringBuilder sb=new StringBuilder("");
		sb.append("{")
			.append(transaction.getDateOfTransaction() + ",")
			.append(transaction.getAmount() + ",")
			.append(transaction.getFromAccount() + ",")
			.append(transaction.getBenificiaryAccount())
			.append("}");
		return sb.toString();
	} 
	
	
}
