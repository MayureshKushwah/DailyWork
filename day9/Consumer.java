package com.cts.training.day9;
class Test<T>
{
	private T obj;
	public T get()
	{
		return obj;
	}
	public void set(T ob)
	{
		this.obj=ob;
	}
}
public class Consumer {
	public static void main(String[] args) {
    Test<Integer> t=new Test<>();
    t.set(5);
    int i=(int)t.get();
    	System.out.println(i);
    	Test<String> t2=new Test<>();
    	t2.set("mayu");
    String s=t2.get();
    System.out.println(s);
	}
}