package com.cts.training.day6;

public class Resource2 {
	public void display(int name) {
		synchronized (this) { // this synchronise block allocates this to one thread at a time

		
				System.out.println("Table" +  "-" + name);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}


