package com.controller;

import com.enums.AccountType;
import com.factory.AccountFactory;
import com.model.Account;
import com.model.SavingsAccount;

public class AccountController {
	public static void main(String[] args) {
		Account a1 =  AccountFactory.createAccount(AccountType.SAVINGS, "ACC4569IG");
		Account a2 =  AccountFactory.createAccount(AccountType.CURRENT, "ACC89869IG");
		
		System.out.println(a1.getRateOfInterest());
		System.out.println(a2.getRateOfInterest());
	}
}
/* 
 * Account a1 = new SavingsAccount(accountNumber, rateOfInterest);
 * */
