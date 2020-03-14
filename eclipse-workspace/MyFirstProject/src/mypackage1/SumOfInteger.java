package mypackage1;

import java.util.Scanner;


public class SumOfInteger {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		int num,sum=0,s;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number");
		num=input.nextInt();
		
		while (num!=0) {
			s=num%10;
			sum=sum+s;
			num=num/10;
			
			
		}
		
		
		System.out.println(sum);

	}
	}


