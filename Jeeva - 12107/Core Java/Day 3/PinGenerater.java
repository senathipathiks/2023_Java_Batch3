package com.corejava.day3;
/*
 *  GENERATE A PIN THE PIN SHOULD CONTAIN LAST THREE CHARACTERS OF YOUR FIRST NAME,MIDDEL 3 MIDDLE NAME ,LAST FOUR AADHAR NUMBER
		 FIRST THREE CHRACTERS OF LAST NAME */
public class PinGenerater {
	public static void main(String[] args) {
		

		
		String firstName="Leonal";
		String middleName="Andress";
		Long aadharNumber=630334876499l;
		String aadharNumberString=aadharNumber.toString();
		String lastName="Messi";
		
		String pinNumber="";
		pinNumber=firstName.substring(firstName.length()-3)+middleName.substring(middleName.length()/2-1,middleName.length()/2+2)
		+aadharNumberString.substring(aadharNumberString.length()-4);
		
		System.out.println(pinNumber);
		
		
	}
}
