package com.coreDay6;

import java.io.IOException;
import java.util.Scanner;

public class InvalidFile {

	public static void main(String[] args) throws IOException {
		
	Scanner sc = new Scanner(System.in);
	
	
		System.out.println("Enter the File Name : ");
		
		String Filename = sc.nextLine();
		
		Checker c = new Checker();
		
		c.namechecker(Filename);
		
		

	}

}


class Checker {
	
	public void namechecker(String filename) {
		String s[] = filename.split(".");
		
		if(s[1] == "pdf") {
			System.out.println("Valid File");
		}
	}
}