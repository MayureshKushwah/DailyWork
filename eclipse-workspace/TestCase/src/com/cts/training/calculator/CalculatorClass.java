package com.cts.training.calculator;

public class CalculatorClass {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		if (a > b) {
			return a - b;
		} else

		{
			return b - a;
		}
	}

	public int div(int a, int b) {
		return a / b;
	}

	public int mul(int a, int b) {
		return a * b;
	}



public boolean isPrime(int number) {
boolean status= true;
for(int i= 2; i<=number/2;i++) {
if(number%i==0) {
		status=false; 
	}
}
return status;
}
}