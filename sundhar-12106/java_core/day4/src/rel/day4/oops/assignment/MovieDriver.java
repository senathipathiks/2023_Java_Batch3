package rel.day4.oops.assignment;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Write a Java program to create a class called "Movie" with 
 * attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews.
 * */

class Movie {
	private String title;
	private String director;
	private String[] actors;
	private double reviews;

	public Movie(String title, String director, String[] actors) {
		super();
		this.title = title;
		this.director = director;
		this.actors = actors;
	}

	public double getReviews() {
		return reviews;
	}

	public void setReviews(double rating) {
		this.reviews = rating;
	}

	@Override
	public String toString() {
		return "Movie : title=" + title + ", director=" + director + ", actors=" + Arrays.toString(actors) + ", reviews="
				+ reviews ;
	}
	
	

}

public class MovieDriver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String actor[] = { "prabhas", "prithiviraj", "shruthihasan", "sriya reddy" };
		Movie salaar = new Movie("salaar", "Prasanth Neel", actor);

		System.out.println("Do you want to rate this movie\n1.yes\n2.no");
		switch (sc.nextInt()) {
		case 1:
			System.out.println("Enter the review 1-5");
			double rating = sc.nextInt();
			if (rating <= 5)
				salaar.setReviews(rating);
			break;
		case 2:
			System.out.println("*******Thank You******");
			break;

		default:
			System.out.println("\t\t\tinvalid input");
			break;
		}
		
		System.out.println(salaar);
		
	}

}
