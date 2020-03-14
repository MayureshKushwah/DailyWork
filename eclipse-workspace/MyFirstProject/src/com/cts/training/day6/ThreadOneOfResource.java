package com.cts.training.day6;

public class ThreadOneOfResource implements Runnable{
Resource resource;

 public ThreadOneOfResource(Resource resource) {
	this.resource= resource;
}
@Override
public void run() {
	resource.display("Thread-1");
}
   
}
 