package com.cts.training.day9;

public class AnynomusInnerClass {

	public static void main(String[] args) {
		//1. For Concrete Class
				Hello h=new Hello(){
					
					public void sayHello()
					   {
						   System.out.println("I am Inner class");
					   }
				};
				h.sayHello();	
				
				//2. For Abstract Class
				
				AbTest abTest=new AbTest() {
					
					@Override
					public void hiTere() {
						System.out.println("I am Inside AbTest inner class");
						
					}
				};
				abTest.hiTere();
				
				//3. For Interface
				
				MyInterface myInterface = new MyInterface() {
					
					@Override
					public void hiMessage() {
						System.out.println("Inside Anonymous Inner class");
						
					}
				};
				myInterface.hiMessage();
			}



	}

class Hello
{
	
   public void sayHello()
   {
	   System.out.println("I am Inside Hello class");
   }
}

abstract class AbTest
{
	public abstract void hiTere();
}
interface MyInterface
{
    public void hiMessage();	
}
