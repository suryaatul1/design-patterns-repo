package com.visitor;

import java.util.Arrays;
import java.util.List;

public class VisitorController {
	public static void main(String[] args) {
		TransactionDetails details1 
				= new TransactionDetails("FRTG586867", 120000, TransactionType.UPI);
		
		TransactionDetails details2 
				= new TransactionDetails("FR564FFD67", 2500000, TransactionType.NEFT);
		
		TransactionDetails details3 
				= new TransactionDetails("FRTFHN86867", 100000, TransactionType.RTGS);
		
		Transaction t1 = new Transaction(new UPI(details1));
		Transaction t2 = new Transaction(new NEFT(details2));
		Transaction t3 = new Transaction(new RTGS(details3));
		
		List<Transaction> list = Arrays.asList(t1,t2,t3);
		list.parallelStream().forEach(t->t.accept());
	}
}








