package com.cts.training.day6;

public class MainResource2 {
	public static void main(String[] args) {
		Resource2 res = new Resource2();
		Tread1 threadone1 = new Tread1(res);
		Tread2 threadtwo = new Tread2(res);
		Thread trd1 = new Thread(threadone1);
		Thread trd2 = new Thread(threadtwo);
		
		
		trd1.start();
		trd2.start(); //ready state
		
		
	}
	

	}


