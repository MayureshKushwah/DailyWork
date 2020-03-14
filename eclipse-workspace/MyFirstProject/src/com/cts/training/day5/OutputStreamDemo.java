package com.cts.training.day5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String path ="C:\\Users\\seed\\Desktop\\filehandle.java";
		
		FileOutputStream out = new FileOutputStream(path,true); //The true will writ after the existing content of the file 
		String message = "CTS Training ";
		byte b[] = message.getBytes(); // string message is converted into byte array because we are using byte stream
		out.write(b);
		out.close();

	}

}
