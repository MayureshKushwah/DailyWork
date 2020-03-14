package com.cts.training.day6;

public class ThreadTwoOfResource implements Runnable{
	Resource resource;

	 public ThreadTwoOfResource(Resource resource) {
		this.resource= resource;
	}
	@Override
	public void run() {
		resource.display("Thread-2");
	}
}
