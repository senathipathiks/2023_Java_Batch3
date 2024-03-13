package com.Day7;
@SuppressWarnings("serial")
class InvalidNo extends Exception{
	InvalidNo(String msg) {
		super(msg);
	}
}
public class ExceptionEx {
	public static void main(String[] args) {
	int num =110;
	try {
		if(num>100)
			throw new InvalidNo("Num is Invalid please provide valid number bet 1 to 100");
	}
    catch(InvalidNo e) {
    	System.out.println(e.toString());
    }
	System.out.println("Custom generated exception");
	}

}
