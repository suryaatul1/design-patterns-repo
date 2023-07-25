package com.utility;

public class StringUtility {

	/* Eager loading*/
	private static StringUtility utility = new StringUtility();
	
	private StringUtility(){  } //no one can create the class except Rakesh 
	
	public static StringUtility getInstance(){  //this method gives the instance 
		return utility; 
	} //making it static allows others to call this method using class name
	
	
	public String[] splitCSV(String input) {
		return input.split(",");
	}

	public String getName(String input) {
		 String[] arry = input.split(","); //["1","harry potter", "london", "AEMPGDF45","130000"]
		return arry[1];
	}
	
}
