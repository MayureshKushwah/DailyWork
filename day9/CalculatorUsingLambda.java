package com.cts.training.day9;

public class CalculatorUsingLambda {

	public static void main(String[] args) {
		 Hello3 add = (a,b) -> a+b; //add is object of Hello interface
		 Hello3 sub = (a,b) -> a-b;
		 Hello3 mul = (a,b) -> a*b;
		 Hello3 div = (a,b) -> a/b;
		 System.out.println(add.calculate(25, 5));
		 System.out.println(sub.calculate(25, 5));
		 System.out.println(mul.calculate(25, 5));
		 System.out.println(div.calculate(25, 5));

	}

}
 @FunctionalInterface
 interface Hello3{
	 double calculate(double a, double b);
 }