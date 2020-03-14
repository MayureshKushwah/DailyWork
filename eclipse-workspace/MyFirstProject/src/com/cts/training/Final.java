package com.cts.training;

public class Final {
	public static final int a;

	//as final should be initialize at time of declaration but if.. 
	//use case ie we can initialize final constant in static block & constructor 
	static {
		a=10;	
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		
	}

}