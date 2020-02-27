package com.cts.training.day9;

import java.util.Scanner;

public class SortArrayInAscending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of elements to store in the array");
		int number = sc.nextInt();
		int[] arr = new int[number];

		System.out.println("Enter Elements");
		for (int i = 0; i < number; i++) {
			arr[i] = sc.nextInt();
		}
		for (int j = 0; j < number - 1; j++) {
			for (int i = 0; i < number-1; i++) {
				
				if(arr[i]>arr[i+1]) {
					int temp= arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
				
			}
		}
		System.out.println("Elements of array in sorted ascending order: ");
		for (int i = 0; i < number; i++) {
			System.out.println(arr[i]);
		}
	}

}
