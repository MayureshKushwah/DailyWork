package com.cts.training.day3;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		 
		 
		 String arr[] = str.split("\\s+");
		
		for(int i=0; i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
	}

}
