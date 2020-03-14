package com.cts.training;

public class ConstAndNonConstPoll {

	public static void main(String[] args) {
		String city1="Pune";
		String city2="Mumbai";
		String city3="Pune";
        
		String city4=new String ("Pune");
		String city5=new String ("Mumbai");
		String city6=new String ("Pune");
		System.out.println(city1==city3);
		System.out.println(city4==city6);
	
	}

}
