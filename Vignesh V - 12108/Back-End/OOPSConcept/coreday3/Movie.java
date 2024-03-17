package com.coreday3;

class Movies{
	private String title;
	private String director;
	private String actor;
	private String actress;
	private String review;
	
	public Movies(String title, String director, String actor, String actress, String review) {
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

public class Movie {

	public static void main(String[] args) {
		Movies obj = new Movies("Leo", "Lokesh ganakaraj", "Vijay", "Tisha", "Good");
		System.out.println(obj.toString());

	}

}