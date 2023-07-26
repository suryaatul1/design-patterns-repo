package com.controller;

public class ContructorUtil {

}

class A{ //Account
	 Z z; //injecting Z into A 
	 
	public A(Z z) {
		this.z = z;
	}
 
	 
}

class B extends A{
	//1 : default (no-arg) : JVM
	public B(Z z) {
		super(z);
	}
}

class C extends A{
	public C(Z z) {
		super(z); 
	}
}


class Z{
	
}