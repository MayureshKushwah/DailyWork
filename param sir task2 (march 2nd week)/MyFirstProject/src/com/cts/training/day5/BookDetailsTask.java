package com.cts.training.day5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;
import java.util.List;
import java.util.Scanner;

public class BookDetailsTask {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int flag = 0;
		do {
			System.out.println("Enter your Choice");
			System.out.println("Enter 1 : Insert book Details");
			System.out.println("Enter 2 : Display book Details");
			System.out.println("Enter 3 : Exit");
			int num = sc.nextInt();
			switch (num) {
			case 1:

				System.out.println("Enter Book Name");
				String bname1 = br.readLine();
				String bname = "Book Name: "+bname1;

				System.out.println("Enter Author Name");
				String aname1 = br.readLine();
				String aname="\t Author Name: "+aname1;

				System.out.println("Enter Book Price");
				int price = sc.nextInt();
				String pr1 = Integer.toString(price);
				String pr = "\t Price"+pr1+"\t";

				String path = "C:\\Users\\seed\\Desktop\\bookData.txt";

				FileOutputStream out = new FileOutputStream(path, true); // The true will writ after the existing
																			// content of
																			// the file
				
				byte b1[] = bname.getBytes(); // string message is converted into byte array because we are using byte
												// stream
				byte b2[] = aname.getBytes();
				byte b3[] = pr.getBytes();
				out.write(b1);
				out.write(b2);
				out.write(b3);
				out.close();
				System.out.println("Do yo want to continue if yes press 1 else press 0");
				int r = Integer.parseInt(br.readLine());
				if (r == 1)
				flag = 1;
				else
					flag = 0;
				break;
			

			case 2:

				String path1 = "C:\\Users\\seed\\Desktop\\bookData.txt";

				FileInputStream in1 = new FileInputStream(path1);

				int i;
				while ((i = in1.read()) != -1) {
					System.out.print((char) i);
					
				}
			
				System.out.println("\n\n"+" Do yo want to continue if yes press 0 else press 1");
				int l = Integer.parseInt(br.readLine());
				if (l == 1)
					flag= 1;
				else
					flag = 0;
				break;
			case 3:
				flag = 1;
			break;
			default:
				System.out.println("Sorry..You have Entered Wrong Input...Plz Try Again");
				break;
			}
		} while (flag != 1);

	}
}
