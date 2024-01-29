package day1;

public class Movie {
	   String title;
	    String director;
	    String actors;
	    String review;
	    public Movie( String title,String director, String actors) {
	        
	        this.title=title;
	        this.director=director;
	        this.actors=actors;
   
	    }
	    
	    public String movieReview(){
    
	    review = "The Movie name is : "+title+"\nMovie Directer Name :" +director+"\nMovie Actors are :"+actors+"\nreview : Movie is good";
	         
	    
	    return review;
	    }

	    public static void main(String[] args) {
	        
	        Movie m = new Movie("Adiyae","Gauthammenon","Gvprakash");
	        
	        System.out.println(m.movieReview());
	        
	    }


	

}
