package com.cts.training;

public class BufferDemo {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Hello Mayuresh here");
		System.out.println(sb.capacity());
		sb.append("Hello Mayuresh kushwah from cts here");
		System.out.println(sb.capacity());
		sb.insert(9,"WWWW");
		System.out.println(sb);
		sb.replace(14, 20, "yyyy");
		System.out.println(sb);
		sb.delete(9, 13);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
