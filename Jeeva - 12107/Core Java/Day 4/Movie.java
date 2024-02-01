package com.coreDay4;

public class Movie {
	
	String title;
	String director;
	String actor;
	String reviews;
	
	Movie(String title, String director, String actor, String reviews){
		this.title = title;
		this.director = director;
		this.actor = actor;
		this.reviews = reviews;
	}
	
	@Override
	public String toString() {
		return "Movie Title is " + title + " directed by " + 
	director + " \nStarring " + actor + " with reviews " + reviews;
	}
	
	public static void main(String[] args) {
		
//		Write a Java program to create a class called "Movie"
//		with attributes for title, 
//		director, actors, and reviews, and methods for
//		adding and retrieving reviews.
		
		System.out.println(new Movie("Revenant", "Innaritu", "Leonardo Dicaprio", "9.7/10").toString());
		

	}

}
