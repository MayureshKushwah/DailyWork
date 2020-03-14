package com.cts.training;


import java.util.*;
public class  Day2Task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter minimum ");
		int a = input.nextInt();
		System.out.println("Enter max");
		int b = input.nextInt();
		int count = 0;
		for (int i = a; i <= b; i++) {
			String number = String.valueOf(i);
			while (number.contains("1")) {
				number = number.substring(number.indexOf("1") + 1);
				count++;
			}
		}
		System.out.println(count);
	}
}