package com.cts.training.day9;

import java.util.Scanner;

public class MaxMinElementInArray {

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
	     int max= arr[0],min=arr[0];
	     for(int i=1 ; i<number;i++)
	     {
	    	 
	    	if(arr[i]>max) {
	    		max=arr[i];
	    	}
	    	if(arr[i]<min)
	    	{
	    		min=arr[i];
	    	}
	     }
	     System.out.println("Maximum element is :"+max);
	     System.out.println("Minimum element is :"+min);
	}

}
