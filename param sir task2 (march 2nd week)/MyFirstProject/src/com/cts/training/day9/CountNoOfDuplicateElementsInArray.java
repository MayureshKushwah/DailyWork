package com.cts.training.day9;

import java.util.Scanner;

public class CountNoOfDuplicateElementsInArray {

	public static void main(String[] args) {
		int i,j, count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of rows: ");
       int row=sc.nextInt();
        int [] a =new int[row];
        System.out.println("Enter elements of array a:");
        for( j=0; j<a.length; j++)
        {
                a[j]=sc.nextInt();
            }
        for( j=0; j<a.length; j++)
        {
        	   for(  i=j+1; i<a.length; i++)
        	   {
             if(a[i]== a[j])
             {
              count++;
              System.out.println("Duplicate entry = " + count);
             }
            }
}
}
}
