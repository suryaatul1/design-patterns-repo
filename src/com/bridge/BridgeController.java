package com.bridge;

public class BridgeController {
	public static void main(String[] args) {
		System.out.println("******SAVINGS ACCOUNT*********");
		Account account = new SavingsAccount(new NEFT(), new UPI());
		account.features();
		System.out.println("******CURRENT ACCOUNT*********");
		Account accountc = new CurrentAccount(new NEFT(), new UPI());
		accountc.features();
		
	}
}
