package com.cts.training.day7;

import java.awt.geom.Area;
import java.util.Scanner;

public class DaphneArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Array length");
		int arlen = sc.nextInt();
		System.out.println("Enter Elemnents one by one");
		int[] arr = new int[arlen];
		for(int i=0;i<arlen;i++) {
			arr[i]= sc.nextInt();
		}
		int i=0, count1=0;
		while(i<arr.length)
		{
			if(arr[i]%2==0)
			{
				count1++;
			}
			else
				break;
			i++;
		}
		int count2=0, j=arr.length-1;
		while(j>0)
		{
			if(arr[j]%2==0)
			{
				count2++;
			}
			else {
				break;
			}
			j--;
		}
		if(count1==0)
		{
			System.out.println("Not DapheneArray");
		}
	   else {
		if(count1==count2)
		{
			System.out.println("DaphneArray");
		}
		else {
			
			System.out.println("Not DaphneArray");
		}
		}
	}

}
