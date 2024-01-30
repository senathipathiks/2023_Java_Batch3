package com.day6;

import java.util.Scanner;

class InvalidDateFormat extends Exception{
	
	InvalidDateFormat(String msg){
		super(msg);
	}
}
class Date{
	void Dformat() throws InvalidDateFormat{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Date Format");
		String in = sc.next();
		
		String [] dat = in.split("-");
		
		if(dat[0].length()==2 && dat[1].length()==3 && dat[2].length()==4) {
			System.out.println("Input Date Format is Correct");
		}
		else {
			throw new InvalidDateFormat("Please Enter valid Date Format");
		}
	}
}
public class Task4 {

	public static void main(String[] args) {
		
		try {
			Date obj = new Date();
			obj.Dformat();
			}
		catch(InvalidDateFormat e) {
			System.out.println(e.getMessage());
		}

	}

}
