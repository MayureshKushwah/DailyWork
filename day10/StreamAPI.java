package com.cts.training.day10;

import java.util.ArrayList;
import java.util.Scanner;

public class StreamAPI {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		list.add(20);
		list.add(40);
		list.add(35);
		list.add(80);
		list.add(62);

		System.out.println(list+"\n");
		for(int i=0;i<(list.size());i++){
			if(list.get(i)%2==0 && list.get(i)%5==0) {
				System.out.println(list.get(i));
			}
			
		}
		System.out.println("\n Double Elements");
		for(Integer obj : list) {
			System.out.println(obj*2);
		}
		
	}

}
