package com.day24;

class Movie{
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
		return "Movie [title=" + title + ", director=" + director + ", actor=" + actor + ", actress=" + actress
				+ ", review=" + review + "]";
	}
	
	
}

public class MovieClass {

	public static void main(String[] args) {
		Movie obj = new Movie("Leo", "Lokesh ganakaraj", "Vijay", "Tisha", "Good");
		System.out.println(obj.toString());

	}

}
