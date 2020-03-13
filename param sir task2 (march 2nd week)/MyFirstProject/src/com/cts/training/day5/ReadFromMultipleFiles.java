package com.cts.training.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class ReadFromMultipleFiles {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		String path1 = "C:\\Users\\seed\\Desktop\\cse.java";
		String path2= "C:\\Users\\seed\\Desktop\\filehandle.java";
		
       FileInputStream fin1 = new FileInputStream(path1);
       FileInputStream fin2 = new FileInputStream(path2);
       SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
       int i;
	    while((i=sis.read())!=-1) {
	    	System.out.print((char)i);
	    }
       
	}

}
