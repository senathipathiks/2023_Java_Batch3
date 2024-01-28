package com.day6Java8;

public class EnumKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
enum Days{Monday,Tuesday,Thursday,Wednesday,Sunday,Friday}
Days day=Days.Friday;
switch(day) {
case Monday->System.out.println("Monday I wakeup 7 am");
case Thursday,Sunday->System.out.println("Thursday and Sunday I wakeup 9 am");
default->System.out.println("Week days I wakeup 10 am");}
	}

}
