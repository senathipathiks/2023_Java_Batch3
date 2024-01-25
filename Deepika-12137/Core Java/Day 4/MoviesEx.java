package com.day4;
import java.util.ArrayList;
import java.util.List;

class Movie {
    private String title;
    private String director;
    private String actors;
    private  String reviews;

    public Movie(String title, String director, String actors,String reviews) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = reviews;
    }

    public void setReview(String review) {
        this.reviews=review;
    }

    public String getReviews() {
        return reviews;
    }

    // getters and setters for title, director, and actors
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }
}


public class MoviesEx {

    public static void main(String[] args) {
        Movie ref=new Movie("VTV","Gowtham menon","STR","Good");
        System.out.println(ref.getTitle());
        System.out.println(ref.getDirector()); 
        System.out.println(ref.getActors());
        System.out.println( ref.getReviews());
        

    }

}
