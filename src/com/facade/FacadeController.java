package com.facade;

import java.util.Scanner;

public class FacadeController {
	public static void main(String[] args) {
		CreditCardGateway facade = new CreditCardGateway();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Basic card");
			System.out.println("2. Gold Card");
			System.out.println("3. Silver Card");
			System.out.println("0. Exit");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Bye.. ");
				break; 
			}
			switch(input) {
			case 1: 
				facade.getBasicCardDetails();
				break;
			case 2: 
				facade.getGoldCardDetails();
				break;
			case 3: 
				facade.getSilverCardDetails();
				break;
			default: 
				System.out.println("Invalid option..");
			}
		}
		sc.close();
	}
}
