package com.cts.training.day5;

public class Task3PrefixCount {

	public static void main(String[] args) {
		/*  String[] input={"100","111","10100","10","1111"}
		   input2="10"   
				   output=2;
				   count strings having prefix "10" but "10" not included in count.
	   */
		int count=0;
		String[] input={"100","111","10100","10","1111"};
		String input2="10";
		for (int i=0;i<input.length;i++)
		{
		 String str= input[i];
		
		
		 char str1= str.charAt(0);
		 char str2= str.charAt(1);
		 if((str1=='1' && str2=='0') && str.length()>=3) {
			 count++;
		 }
		
		
		}
		System.out.println(count);
	}

}
