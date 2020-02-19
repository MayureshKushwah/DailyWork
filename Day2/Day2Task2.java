package com.cts.training;

public class Day2Task2 {

	public static boolean isTitleCase(String s) {
		boolean result = false;
		String arr[] = s.split("\\s+");
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i].charAt(0);
			if (ch >= 65 && ch <= 90) {
				result = true;
			} else {
				result = false;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String str = "Global Warming";
		int len = str.length();

		System.out.print("Last 4 characters:");

		System.out.println(str.substring(len - 4, len));
		System.out.println(str.substring(4, 9));
		System.out.println(str.matches("[a-zA-Z0-9]"));
		String tr = str.substring(len - 4);
		System.out.println(tr);
		System.out.println(str.substring(0, 4));
		System.out.println(str.indexOf('W'));
		System.out.println(str.toUpperCase());

		System.out.println(isTitleCase(str));

		String rplace = str.replace('a', '*');
		System.out.println(rplace);
	}

}
