package com.cts.training.day6;

public class ThreadTwo extends Thread {
	@Override
	public void run() {
		for(int i=1 ;i<=10;i++) {
			 System.out.println("Thread-2:"+i);
			 try
			 {
				 Thread.sleep(5000);
			 }
			 catch (InterruptedException e)
			 {
				  e.printStackTrace();
			 }
		}
	}

}
