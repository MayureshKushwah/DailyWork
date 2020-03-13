package com.cts.training.day5;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		String path1 = "C:\\Users\\seed\\Desktop\\cse.java";
		String path2 = "C:\\Users\\seed\\Desktop\\it.java";
		String path3 = "C:\\Users\\seed\\Desktop\\ec.java";
		String path4 = "C:\\Users\\seed\\Desktop\\me.java";

		FileInputStream fin1 = new FileInputStream(path1);
		FileInputStream fin2 = new FileInputStream(path2);
		FileInputStream fin3 = new FileInputStream(path3);
		FileInputStream fin4 = new FileInputStream(path4);
		
		Vector vector = new Vector();
		vector.add(fin1);
		vector.add(fin2);
		vector.add(fin3);
		vector.add(fin4);
		
		Enumeration en = vector.elements();
		SequenceInputStream sis = new SequenceInputStream(en);
		
		 int i;
		    while((i=sis.read())!=-1) {
		    	System.out.print((char)i);
		    }
	}

}
