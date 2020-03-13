package com.cts.training.day9;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of elements to store in the array");
	    int number=sc.nextInt();
	    int[] arr= new int[number];
	    System.out.println("Enter Elements");
	     for(int i=0 ; i<number;i++)
	     {
	    	 arr[i] = sc.nextInt();
	     }
	     System.out.print("The Values Stored are:");
	     for(int i=0 ; i<number;i++)
	     {
	    	 System.out.print(arr[i]);
	     }
	     System.out.println();
	     System.out.print("The values store into the array in reverse are :");
	     for(int i=(number-1) ; i>=0;i--)
	     {
	    	 System.out.print(arr[i]);
	     }
	}

}
