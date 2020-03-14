package com.cts.training.day5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;

public class Task2SeachingWord {

	public static void main(String[] args)throws FileNotFoundException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter File Name");
		String bname1 = br.readLine();
		String bname = bname1;
		String path1 = ("C:\\Users\\seed\\Desktop\\"+bname1);
		
		
       FileInputStream fin1 = new FileInputStream(path1);
    
      
       int i;
	    while((i=sis.read())!=-1) {
	    	System.out.print((char)i);
	    }
       
	}
	}


