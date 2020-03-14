package com.cts.training.day6;

public class ThreadInterfaceDemo {

	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY - 2); // setting priority of main tread

		InterfaceThreadOne threadone = new InterfaceThreadOne();
		InterfaceThreadTwo threadtwo = new InterfaceThreadTwo();
		Thread t1 = new Thread(threadone);
		Thread t2 = new Thread(threadtwo);
		t1.setPriority(Thread.MAX_PRIORITY - 1);
		t2.setPriority(Thread.MAX_PRIORITY - 3);// we can set priority but output we can se its performance in project
												// here its effect is not seen
		t1.start();
		t2.start();
		System.out.println("Main Thread Priority:" + Thread.currentThread().getPriority());
		System.out.println("Thread-1 priority:" + t1.getPriority());
		System.out.println("Thread-2 pririty:" + t2.getPriority());
	}

}
