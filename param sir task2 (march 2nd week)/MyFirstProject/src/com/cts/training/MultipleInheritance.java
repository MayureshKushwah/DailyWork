package com.cts.training;

public class MultipleInheritance {

	public static void main(String[] args) {
		Mayu mk = new Mayu();
		System.out.println(mk.add(3, 7));
		System.out.println(mk.sub(13, 3));
		System.out.println(Add.mul(13, 3));
	}

}

interface Add {
	int add(int a, int b);

	// from java 8 we can define method in interface, it must be static or default
	static int mul(int a, int b) {
		return a * b;
	}

}

interface Sub {
	int sub(int a, int b);
}

class Mayu implements Add, Sub {
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}
}