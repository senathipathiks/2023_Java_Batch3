package com.day4;

import java.util.Scanner;

//Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews.

class movie{
	String title="kaththi";
	String director="murugadoss";
	String actors="vijay";
	String reviews;
	void addreview() {
		System.out.println("Say You Review about this Movie: ");
		Scanner sc = new Scanner(System.in);
		reviews=sc.nextLine();
		
	}
	void getreview() {
		System.out.println("Reviews are: ");
		System.out.println(reviews);
	}
}


public class Task1 {

	public static void main(String[] args) {
	movie obj = new movie();
	obj.addreview();
	obj.getreview();

	}

}
