package com.cts.training.day9;

import java.util.Scanner;

public class FindTheSecondLargestInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of elements to store in the array");
		int number = sc.nextInt();
		int[] arr = new int[number];

		System.out.println("Enter Elements");
		for (int i = 0; i < number; i++) {
			arr[i] = sc.nextInt();
		}
		int secondlarg=0, largest = arr[0];
		for (int i = 0; i < number; i++) {
			if (largest < arr[i]) {
			
				largest=arr[i];

			}
		}
		for()
		System.out.println("Second large="+arr[secondlarg]);;

	}

}
