package com.cts.training.day3;
import java.util.Scanner;

public class AlphabeticString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		int n=str.length();
	    char ch[]=str.toCharArray();
	    
	 char temp;
		for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (ch[i]>(ch[j])) 
                {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
		System.out.println("Alphabatic Arranged String is:");
		for (int k=0; k<n;k++)
		{
			System.out.print(ch[k]);
		}
	}

}
