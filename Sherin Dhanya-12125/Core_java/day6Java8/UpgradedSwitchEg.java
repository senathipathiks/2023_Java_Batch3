package com.day6Java8;

public class UpgradedSwitchEg {

	public static void main(String[] args) {
		
		String days="Wed";
		String result=" ";
switch (days) {
case "Saturday","Sunday"-> System.out.println("6 AM");
case "Monday"-> System.out.println("7 AM");
default ->System.out.println("5AM");
}

result = switch(days) {
case "saturday","sunday" :yield "6AM";
case "monday" :yield "7AM";
default :yield("5 Am");
};
System.out.println(result);
	}

}
