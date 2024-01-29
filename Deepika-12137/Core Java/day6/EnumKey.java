package com.day6;

public class EnumKey {
public static void main(String[] args) {
	
	
	enum Days{mon,tue,wed,thurs,fri,sat,sun}
	
	Days day = Days.fri;
	
	switch(day) {
	case mon->System.out.println("Monday");
	
	case fri->System.out.println("Friday");
	
	default->System.out.println("default");
	}
}
}
