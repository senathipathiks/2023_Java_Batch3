//Write a Java program to create a class with methods to search for flights and hotels, and to book and cancel reservations.

package com.day4;

import java.util.ArrayList;

class Flight{
	String aero = "Airbus";
	String from= "Chennai";
	String to = "Dubai";
	String date = "12/03/2024";
	int Fc;
	int Hc;
	
	ArrayList<Integer> book;
	ArrayList<Integer> cancel;
	
	Flight(){
		
		this.book = new ArrayList<Integer>();
		this.cancel = new ArrayList<Integer>();
	}
	

	void searchFlight() {
		System.out.println("Seraching Process: ");
		System.out.println(aero + "is available from "+from +" to "+to+" on "+ date );
		
	}
	void searchHotel() {
		System.out.println("Rooms are avilable in the, Ramu Hotel is available on 12/04/2024.");
	}
	
	void bookFlight() {
		System.out.println("****Booking process********");
		book.add(1010);
		book.add(2020);
		book.add(3030);
		book.add(4040);
		System.out.println("Your Flight is booked on "+date+". "+"Your booking number is: "+book.get(2));
	}
	void bookHotel() {
		book.add(1010);
		book.add(2020);
		book.add(3030);
		book.add(4040);
		System.out.println("Your Hotel is booked on "+date+". "+"Your booking number is: "+book.get(3));
	}
	
	void cancelFlight() {
		System.out.println("*****Cancelling process*******");
		book.add(1010);
		book.add(2020);
		book.add(3030);
		book.add(4040);
		System.out.println("Your Booked Flight was cancelled. Your booking number is "+book.get(2) );
	}
	void cancelHotel() {
		book.add(1010);
		book.add(2020);
		book.add(3030);
		book.add(4040);
		System.out.println("Your Booked Hotel was cancelled. Your booking number is "+book.get(3) );
	}
}

public class Task3 {

	public static void main(String[] args) {
		Flight obj = new Flight();
		obj.searchFlight();
		obj.searchHotel();
		obj.bookFlight();
		obj.bookHotel();
		obj.cancelFlight();
		obj.bookHotel();
		

	}

}
