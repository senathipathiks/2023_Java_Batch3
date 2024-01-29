package com.day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class InvalidDateFormat extends Exception{
	
	public InvalidDateFormat(String msg) {
		
		super(msg);
		
	}
	
}

class DateCheck{
	public DateCheck() {
	     
		
		boolean flag = true;
	    String dateInString  = "01-JAN-2024";
	    SimpleDateFormat sdf = new SimpleDateFormat( "dd-MMM-yyyy");
	    try {
	        Date d = sdf.parse(dateInString);
	        System.out.println(d);
	        
	    } catch (ParseException e) {
	        flag = false;
	        e.printStackTrace();
	    } finally{
	        System.out.println(flag?"Success":"Failure");
	    }
	}
	
}


public class InvalidDateFormatEx {

	public static void main(String[] args) {
		DateCheck d = new DateCheck();
		

	}

}
