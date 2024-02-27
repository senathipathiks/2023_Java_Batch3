package com.day6.seminar;

public class EnumKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enum Days{Monday,Tuesday,Wed,Thurs,Fri,Sat,Sun}
		Days day= Days.Fri;
		
		switch (day) {
		case Monday ->System.out.println("Monday i woke up at 7 AM");
		case Sat,Sun ->System.out.println("Sat and Sunday I woke up at 9 AM");

		default->System.out.println("Weekdays I woke up at 6 AM");
		}
	}

}
