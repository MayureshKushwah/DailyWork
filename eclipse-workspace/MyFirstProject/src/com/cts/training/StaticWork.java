package com.cts.training;

public class StaticWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticDemo d = new StaticDemo();
		StaticDemo d1 = new StaticDemo();
		StaticDemo d2 = new StaticDemo();
		System.out.println(d.x);
		System.out.println(d.y);
		d2.x =50;
		d1.y=30;
		System.out.println(d.x);
		System.out.println(d2.y);
		
	}

}
class StaticDemo
{
	int x=10;
	static int y = 20;
	
}