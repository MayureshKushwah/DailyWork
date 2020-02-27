package com.cts.training.day9;

import java.util.Scanner;

public class OddAndEvenInSeperateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of elements to store in the array");
	    int number=sc.nextInt();
	    int[] arr= new int[number];
	    int[] oddArray= new int[number];
	    int[] evenArray= new int[number];
	    System.out.println("Enter Elements");
	     for(int i=0 ; i<number;i++)
	     {
	    	 arr[i] = sc.nextInt();
	     }
	     int evencount=0, oddcount=0;
	     for(int j=0;j<number;j++) {
	    	 if(arr[j]%2==0) {
	    		 evenArray[evencount]=arr[j];
	    		 evencount++;
	    	 }
	    	 else {
				oddArray[oddcount]=arr[j];
				oddcount++;
			}
	     }
	     System.out.print("The Even elements are :");
	     for(int j=0;j<evencount;j++) {
	     
	    	 System.out.print(evenArray[j]+" ");
	     }
	     System.out.println();
	     System.out.print("The Odd elements are :");
	     for(int j=0;j<oddcount;j++) {
	     
	    	 System.out.print(oddArray[j]+" ");
	     }
	}

}
