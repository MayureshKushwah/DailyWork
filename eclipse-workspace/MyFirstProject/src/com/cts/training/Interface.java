package com.cts.training;

public class Interface {

	public static void main(String[] args) {
	 Imp imp=new Imp();
	 System.out.println(imp.add(2, 4));

	}

}

interface Hello
{
	int add (int a, int b);
}
class Imp implements Hello
{
	public int add(int a, int b)
	{
		return a+b;
	}
}