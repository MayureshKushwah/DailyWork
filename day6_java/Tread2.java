package com.cts.training.day6;

public class Tread2 implements Runnable {
	Resource2 resource2;
	
	 public Tread2(Resource2 resource2) {

		this.resource2 = resource2;
	}

	@Override
		public void run() {
		 for(int i=1; i<=10;i++)
			 
		 {
			
	           int td=4;
	           td = td*i;
				
			resource2.display(td);
			 }
			 try
			 {
				 Thread.sleep(2000);
			 }
			 catch (InterruptedException e)
			 {
				  e.printStackTrace();
			 }
		 }
		}