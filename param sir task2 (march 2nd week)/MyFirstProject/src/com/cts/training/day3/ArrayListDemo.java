package com.cts.training.day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		/*
		 * ArrayList<String> list= new ArrayList<>(); list.add("hello"); list.add("to");
		 * list.add("Batch"); list.add("7"); list.add("true");
		 * //System.out.println(list);
		 * 
		 * for(String obj:list) { System.out.println(obj); } Iterator<String> it1=
		 * list.iterator(); while (it1.hasNext()) { String element= it1.next();
		 * System.out.println(element); }
		 * 
		 * //listiterator...
		 * 
		 * ListIterator<String> it= list.listIterator();
		 * System.out.println("Forward direction"); while (it.hasNext()) { String
		 * element= it.next(); System.out.println(element); }
		 * System.out.println("Backward direction"); while (it.hasPrevious()) { String
		 * element= it.previous(); System.out.println(element); }
		 */
		// HashSet....

		HashSet<String> set = new HashSet<>();
		set.add("hello");
		set.add("to");
		set.add("Batch");
		set.add("7");
		set.add("true");
		Iterator<String> it2 = set.iterator();
		while (it2.hasNext()) {
			String element = it2.next();
			System.out.println(element);
		}

	}

}
