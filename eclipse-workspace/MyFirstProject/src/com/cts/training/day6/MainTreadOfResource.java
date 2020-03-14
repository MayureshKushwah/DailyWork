package com.cts.training.day6;

public class MainTreadOfResource {
	//System.out.println(Thread.currentThread().getName());
	public static void main(String[] args) {
		Resource res = new Resource();
		ThreadOneOfResource threadone1 = new ThreadOneOfResource(res);
		ThreadTwoOfResource threadtwo = new ThreadTwoOfResource(res);
		Thread trd1 = new Thread(threadone1);
		Thread trd2 = new Thread(threadtwo);
		
		
		trd1.start();
		trd2.start(); //ready state
		
		for (int i=1; i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}	
	}
	

}