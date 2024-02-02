package com.day28;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample4 {

	public static void main(String[] args)throws IOException {
		
		FileWriter fout = new FileWriter("D:\\new.txt");
		Scanner sc  =  new Scanner(System.in);
		System.out.println("ENter the No of Lines");
		int line = sc.nextInt();
		System.out.println("Enter the Text: ");
		String s;
		for(int i=0;i<line;i++) {
			s = sc.nextLine();
			fout.write(s+"\n");
		}
		System.out.println("Completed");
		sc.close();
		fout.close();

	}

}
