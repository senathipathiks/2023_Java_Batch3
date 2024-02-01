package rel.edu.day6.CustomException;

import java.util.Scanner;

class InvalidAge extends Exception{

	@Override
	public String getMessage() {
		return "Not Eligible to vote";
	}
	
}

class ElectionCommision{
	 public ElectionCommision(int age) throws InvalidAge {
		 
		 if (age < 18 || age>110) 
			 throw new InvalidAge();
		 else 
			 System.out.println("Welcome to Election Commision of India");
	}
}

public class InvalidAgeDriver {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age ");
		
		try {
			ElectionCommision ec = new ElectionCommision(sc.nextInt());
		} catch (InvalidAge e) {
			System.err.println(e);
		}
	}

}
