package com.cts.training.day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		String path ="C:\\Users\\seed\\Desktop\\filehandle.java";
		String newpath ="C:\\Users\\seed\\Desktop\\copy.txt";
		
		File file=new File(path);//this file contains all methods to provide info like file name, so we have to use it for gettin file name
	    FileInputStream in = new FileInputStream(file);
	   
	    FileOutputStream out= new FileOutputStream(newpath);
	    
	    int i;
	    while((i=in.read())!=-1) {
	    	out.write(i);
	    }
		
		
		
		
		System.out.println("File Name:"+file.getName());
		/* System.out.println("File Lengh:"+file.length());
        System.out.println("Parent:"+file.getParent());
        System.out.println("path:"+file.getPath());
*/	
	}
	

}
