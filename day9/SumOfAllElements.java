package com.cts.training.day9;

import java.util.Scanner;

public class SumOfAllElements {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of elements to store in the array");
	    int number=sc.nextInt();
	    int[] arr= new int[number];
	    System.out.println("Enter Elements");
	     for(int i=0 ; i<number;i++)
	     {
	    	 arr[i] = sc.nextInt();
	     }
	     
	     for(int i=0 ; i<number;i++)
	     {
	    	 sum=sum+arr[i];
	     }
	     System.out.println("Sum of all elements stored in the array is :"+sum);
	}

	}


