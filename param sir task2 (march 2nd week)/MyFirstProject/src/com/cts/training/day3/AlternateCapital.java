package com.cts.training.day3;
import java.util.Scanner;
public class AlternateCapital {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		 char arr[] = str.toCharArray();
		 
			
			for(int i=0; i<arr.length;i++)
			{   
				if(arr[i]>='a'&& arr[i]<='z')
				{
					arr[i]= (char)(arr[i]+ 'A' -'a');
				}
				else if (arr[i]>='A'&& arr[i]<='Z')  {
					arr[i]= (char)(arr[i]+ 'a' -'A');
				}
				
				
				
			}
		
             System.out.print(String.valueOf(arr));
	}

}
