package Day_4;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Write a Java program to create a class called "Movie" with attributes
 *  for title, director, actors, and reviews, and methods for adding and retrieving reviews.
 */
class Production{
	 String title;
	 String director;
	 String actor,review;
	
	 public Production(String title, String director, String actor,String review) {
		super();
		this.title = title;
		this.director = director;
		this.actor = actor;
		this.review=review;
	}

	public String review() {
		return "The "+title +" movie which is given by "+director+" "+actor+" "+" is "+review;
	}
		
}


public class Movie extends Production{

	public Movie(String title, String director, String actor,String review) {
		super(title, director, actor,review);
		
	}

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter movie title: ");
		String title=sc.next();
		System.out.println("Enter movie director: ");
		String director=sc.next();
		System.out.println("Enter movie actor: ");
		String actor=sc.next();
		System.out.println("Enter movie review: ");
		String review=sc.next();
		
		Production p=new Production(title, director, actor,review);
		
		System.out.println(p.review().toString());
		
		

	}

}
