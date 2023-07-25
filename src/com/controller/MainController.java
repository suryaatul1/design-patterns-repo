package com.controller;

import com.utility.StringUtility;

public class MainController { //vineet
	public static void main(String[] args) {
		String input = "12,harry potter,london,AEMPGDF45,130000";
		
		StringUtility utility = StringUtility.getInstance();
		String name = utility.getName(input);
		System.out.println(name);
	}
}
