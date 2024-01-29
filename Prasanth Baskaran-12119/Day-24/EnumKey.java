package com.java17;

public class EnumKey {

	public static void main(String[] args) {
		
		enum Days{Monday,Thusday,Wed,Thurs,Fri,Saturday,Sun}
		
		Days day = Days.Fri;
		
		
		switch (day) {
		case Monday->System.out.println("Monday I wakeup 7 am");
		
		case Saturday,Sun->System.out.println("Sat & Sun I wakeup 8 am");
			

		default->System.out.println("Week days I wakeup 6 am");
			
		}
		
	}

}
