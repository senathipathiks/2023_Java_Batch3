package com.day6;

public class SwitchCase {
public static void main(String[] args) {
	
	String days="wed";
	String result="";
//	switch(days) {
//	case "sat,sun" -> System.out.println("6 am");
//	
//	case "mon"->System.out.println("7 am");
//	
//	default->System.out.println("5 am");
//	}
	
	result=switch(days) {
	case "sat,sun":yield "4am";
	case "mon" :yield "2 am";
	
	default :yield("6 am");
	};
	
	System.out.println(result);
}
}
