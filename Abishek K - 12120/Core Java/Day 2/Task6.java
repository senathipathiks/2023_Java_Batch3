//Write a Java program to print numbers between 
//1 and 100 divisible by 3, 5 and both.


package com.day;

public class Task6 {

	public static void main(String[] args) {
	    System.out.println("The number are divisible by 3 and 5 and the both");
	    
	    for(int i=1;i<=100;i++) {
	    	int three=i%3;
	    	int five=i%5;
	    	if(three==0) {
	    		System.out.println("Divisible by 3: "+i);
	    	}
	    	else if(five==0) {
	    		System.out.println("Divisible by 5: "+i);
	    	}
	    	
	    	if(three==0 && five==0) {
	    		System.out.println("Divisible by both: "+ i);
	    	}
	    }
	    

	}

}
