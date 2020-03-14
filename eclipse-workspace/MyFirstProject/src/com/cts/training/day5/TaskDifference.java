package com.cts.training.day5;

public class TaskDifference {

	public static void main(String[] args) {
		//1. Generate a series of first 10 number as follows 36,34,30,28,24,22,18,16,12,10
		int a =36;
		int count=0;
		for (int i=a;i>=10;i--)
		{
		    count++;
			System.out.println(i);
			i--;
			if (count%2==0)
				i=i-2;
		}

	}

}
