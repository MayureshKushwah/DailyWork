package com.cts.training.day7;

import java.util.Scanner;

public class Task1Day8 {
	
	public static int add(int num, int sum) {
		
		if (num > 9) {

			while (num > 0) {
				int digi = num % 10;
				sum = sum + digi;
				num = num / 10;
			}

			return add(sum,sum);
		}

		else
			return sum;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter nos");
		String strNum = sc.nextLine();
		int length = strNum.length();
		int num = Integer.parseInt(strNum);
		int sum = 0;
		System.out.println(add(num,sum));

	}

}
