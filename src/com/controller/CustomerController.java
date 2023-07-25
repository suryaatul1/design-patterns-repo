package com.controller;

import com.utility.StringUtility;

public class CustomerController { //rakesh
	public static void main(String[] args) {
		String input = "14,ronald weasley,kent,AEMTRGF45,150000";
		
		StringUtility utility = StringUtility.getInstance();
		String name = utility.getName(input);
		System.out.println(name);
	}
}
//400 controller - StringUtility : 400 objects of this class - 400 locations 