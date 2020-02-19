package com.cts.training;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
	

	        Scanner user_input = new Scanner( System.in );
	        int Input1, Input2;
	        System.out.println("Enter First no");
	        Input1 = user_input.nextInt( );
	        System.out.println("Enter max");
	        Input2 = user_input.nextInt( );

	       
	        int j, Count = 1;

	        
	        for (j=Input1; j <=Input2; j++){ 

	            String str = String.valueOf(j);

	          
	            for(int i = 0; i < str.length(); i++){
	               char mk = str.charAt(i);
	               
	               if ( Count== 1){
	                Count++;
	               }
	            }
	        }
	        System.out.println(Count);
	      }
		
	

}
