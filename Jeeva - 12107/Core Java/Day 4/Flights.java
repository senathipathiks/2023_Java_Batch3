package com.coreDay4;

import java.util.Scanner;

public class Flights {
	
	
	
	void Flightlist() {
		
		String flights[] = {"1.Indigo 6E6347", "2,Air India AI569",
							"3.Vistara UK828"	, "4.Indigo 6E5188"};
		
		
		for (String a : flights) {
			System.out.println(a);
		}
		}
	
	void Select(int red) {
		String flights[] = {"1.Indigo 6E6347", "2,Air India AI569",
				"3.Vistara UK828"	, "4.Indigo 6E5188"};
		System.out.println("Ticket has been Booked in the Flight " + flights[red]);
			
		
		
	}
	
	
	void hotels() {
		String Hotel[] = {"1.Taj Coramendal", "2.Ominpia", "3.Holiday Inn",
				"4.The Park", "5.Sun Venue"};
		
		for (String h : Hotel) {
			System.out.println(h);
		}
	}
	
	void selectHotel(int hred) {
		String Hotel[] = {"1.Taj Coramendal", "2.Ominpia", "3.Holiday Inn",
				"4.The Park", "5.Sun Venue"};
		
		System.out.println("A Room has been Booked in the Hotel " + Hotel[hred]);
		
	}
		

	public static void main(String[] args) {
		
//		Write a Java program to create a class with
//		methods to search for flights 
//		and hotels, and to book and cancel reservations.
		
		Scanner sc = new Scanner(System.in);
		
		Flights f = new Flights();
		
		System.out.println("Do you want to Check Flights?? Y/N ");
		
		char choice = sc.next().charAt(0);
		
		if(choice == 'y' || choice =='Y') {
			f.Flightlist();
		}
		
		System.out.println("Select the Flight to Book ");
		
		int fn = sc.nextInt();
		
		int red = fn - 1;
		
		f.Select(red);
		
		System.out.println("Do you wanna Book any Room for Stay?? Y/N ");
		
		char rchoice = sc.next().charAt(0);
		
		if(rchoice == 'y' || rchoice =='Y') {
			f.hotels();
		}
		
		int hn = sc.nextInt();
		
		int hred = hn - 1;
		
		f.selectHotel(hred);
		
		
				
	}

}
