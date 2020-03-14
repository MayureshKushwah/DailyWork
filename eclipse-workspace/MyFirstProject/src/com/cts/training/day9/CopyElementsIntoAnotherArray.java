package com.cts.training.day9;

import java.util.Scanner;

public class CopyElementsIntoAnotherArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of elements to store in the array");
	    int number=sc.nextInt();
	    int[] arr= new int[number];
	    int[] arr2= new int[number];
	    System.out.println("Enter Elements");
	     for(int i=0 ; i<number;i++)
	     {
	    	 arr[i] = sc.nextInt();
	     }
	     System.out.print("The elements stored in the first array are :");
	     for(int i=0 ; i<number;i++)
	     {
	    	 System.out.print(arr[i]+" ");
	     }
	     System.out.println();
	     for(int i=0 ; i<number;i++)
	     {
	    	arr2[i]=arr[i];
	     }
	     System.out.print("The elements stored in the second array are :");
	     for(int i=0 ; i<number;i++)
	     {
	    	 System.out.print(arr2[i]+" ");
	     }
	     
	}
	}


