//Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews

package com.day4;

class Movie {
	private String title;
	private String director;
	private String actor;
	private String actress;
	private String review;

	public Movie(String title, String director, String actor, String actress, String review) {
		super();
		this.title = title;
		this.director = director;
		this.actor = actor;
		this.actress = actress;
		this.review = review;

	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ",director=" + director + ", actor=" + actor + ",actress=" + actress
				+ ", review=" + review + "]";
	}
}

public class MovieClass {

	public static void main(String[] args) {

		Movie obj = new Movie("Iniya Malargal", "Sheela", "Pregiya", "Ammu", "Nice");
		System.out.println(obj.toString());
	}

}
