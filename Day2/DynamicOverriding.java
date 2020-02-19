package com.cts.training;

public class DynamicOverriding {

	public static void main(String[] args) {
		
		
		
		A1 a1= new B();
		a1.display();

	}

}
class A1
{
	public void display()
	{
		System.out.println("Class A");
	}
}
class B extends A1
{   @Override
	public void display() {
	System.out.println("Class B");
}}
