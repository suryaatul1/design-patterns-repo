package com.utility;

public class StringUtilityV2 {
	/* Lazy loading */
	private static StringUtilityV2 utility;
	
	private StringUtilityV2(){  } //no one can create the class except Rakesh 
	
	public static synchronized StringUtilityV2 getInstance(){  //this method gives the instance 
		if(utility == null)
			return new StringUtilityV2();
		
		return utility; 
	} //making it static allows others to call this method using class name
	//synchronized make this method Thread-Safe
	
	public String[] splitCSV(String input) {
		return input.split(",");
	}

	public String getName(String input) {
		 String[] arry = input.split(","); //["1","harry potter", "london", "AEMPGDF45","130000"]
		return arry[1];
	}
}
