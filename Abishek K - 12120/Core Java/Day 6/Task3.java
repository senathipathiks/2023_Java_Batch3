package com.day6;

import java.util.Scanner;

class InvalidMonthException extends Exception{
	
	InvalidMonthException(String msg){
		super(msg);
	}
}
class Month {
	
	void Mformat() throws InvalidMonthException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month:");
		int mon = sc.nextInt();
		
		if(mon<=12) {
			System.out.println("The month is Accepted");
		}
		else {
			throw new InvalidMonthException("Please Enter the Valid Month");
		}
	}
}
public class Task3 {

	public static void main(String[] args) {
		
		try {
			Month obj = new Month();
			obj.Mformat();
			}
		catch(InvalidMonthException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
