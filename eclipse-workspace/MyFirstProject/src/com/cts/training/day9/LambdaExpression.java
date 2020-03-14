package com.cts.training.day9;

public class LambdaExpression {

	public static void main(String[] args) {
//		MyThread t = new MyThread();
//		Thread thread = new Thread();
//		thread.start();
//		thread.run();

//	 Runnable r= () -> System.out.println("Hello Runnable");
//	 Thread thread = new Thread(r);
//	 thread.start();
//	
		Hello2 h = () -> "Good morninig";
		System.out.println(h.greetings());

		Hello2 h1 = () -> "Good Eveninig";
		System.out.println(h1.greetings());

	}

}

@FunctionalInterface // the functional interface is putted so know that only
// one method is present inside interface
interface Hello2 {
	String greetings();
	// public void display();
}
//class MyThread implements Runnable{
//
//
//
//	@Override
//	public void run() {
//		System.out.println("Hello Runnable");
//		// TODO Auto-generated method stub
//		
//	}	}