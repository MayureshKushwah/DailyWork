package com.cts.training.day4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		System.out.println("-----------Hash Map-------------");

		HashMap<String, Integer> map = new HashMap<>();
		map.put("Banana", 35);
		map.put("Orange", 60);
		map.put("Mango", 110);
		map.put("Grapes", 200);
		System.out.println(map);
		System.out.println(map.get("Mango"));
		map.remove("Mango");
		System.out.println(map);

		// map.clear();
		// System.out.println(map);
	

		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "------>" + entry.getValue());
		}

		System.out.println("-----------Linked Hash Map-------------");

		LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();
		map1.put("Banana", 35);
		map1.put("Orange", 60);
		map1.put("Mango", 110);
		map1.put("Grapes", 200);
		System.out.println(map1);

		System.out.println("-----------Hash-+table-------------");
		Hashtable<String, Integer> map2 = new Hashtable<>();
		map2.put("Banana", 35);
		map2.put("Orange", 60);
		map2.put("Mango", 110);
		// map2.put("Grapes", null);//this will show error as hashtable can not have
		// null
		System.out.println(map2);
		System.out.println("-----------Tree Map-------------");
		// It sort the key alphabetically
		TreeMap<String, Integer> map3 = new TreeMap<>();
		map3.put("Banana", 35);
		map3.put("Orange", 60);
		map3.put("Mango", 110);
		map3.put("Grapes", 200);
		System.out.println(map1);

	}
}