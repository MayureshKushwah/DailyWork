package com.cts.training.day5;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIntoMultipleFiles {

	public static void main(String[] args) throws FileNotFoundException,IOException {
	
		String path1 = "C:\\Users\\seed\\Desktop\\cse.java";
		String path2= "C:\\Users\\seed\\Desktop\\it.java";
		String path3 = "C:\\Users\\seed\\Desktop\\ec.java";
		String path4 = "C:\\Users\\seed\\Desktop\\me.java";
 
		FileOutputStream out1 = new FileOutputStream(path1);
		FileOutputStream out2 = new FileOutputStream(path2);
		FileOutputStream out3 = new FileOutputStream(path3);
		FileOutputStream out4 = new FileOutputStream(path4);
		ByteArrayOutputStream bout= new ByteArrayOutputStream();
		
		String data ="This is a common to be Written in the Files";
		byte[] b = data.getBytes();
		bout.write(b); //this writes data into bout object and then we use bout to add into multiple files as done belove 
		
		bout.writeTo(out1);
		bout.writeTo(out2);
		bout.writeTo(out3);
		bout.writeTo(out4);
		
		
	}

}
