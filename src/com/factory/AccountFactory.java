package com.factory;

import com.enums.AccountType;
import com.model.Account;
import com.model.CurrentAccount;
import com.model.SavingsAccount;

public class AccountFactory {

	public static Account createAccount(AccountType type, String accountNumber) {
		//based on the type, this must return either savings or current account.  
		
		if(type.equals(AccountType.SAVINGS)) {
			double rateOfInterest = AccountType.SAVINGS.getRoi();
			return new SavingsAccount(accountNumber, rateOfInterest);
		}
		
		if(type.equals(AccountType.CURRENT)) {
			double rateOfInterest = AccountType.CURRENT.getRoi();
			return new CurrentAccount(accountNumber, rateOfInterest);
		}
		
		return null;
	}
}
