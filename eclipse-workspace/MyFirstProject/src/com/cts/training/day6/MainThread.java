package com.cts.training.day6;

public class MainThread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		ThreadDemo threadOne = new ThreadDemo();
		ThreadTwo threadtwo = new ThreadTwo();
		threadtwo.start();
		threadOne.start();//ready state
		for (int i=1; i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	
		
		
		//System.out.println(t);
//System.out.println(t.getName());
//System.out.println("Is DAemon?"+t.isDaemon());
//System.out.println("Is Alive?"+t.isAlive());
	}

}
