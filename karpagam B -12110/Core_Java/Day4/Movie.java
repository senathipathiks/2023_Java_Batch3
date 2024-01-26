package Com.Day4;

public class Movie{
	String title;
	String director_name;
	String actor_name;
	String reviews;
	
	public Movie(String title,String director_name,String actor_name){
		this.title=title;
		this.director_name=director_name;
		this.actor_name=actor_name;
		}
	 public String movieReview(){
	         reviews = "The Movie name is : "+title+"\nMovie Directer Name :" +director_name+"\nMovie Actors are :"+actor_name+"\nreview : Movie is too good";
		     return reviews;
		    }
	
	
      public static void main(String[] args) {
		
       Movie obj1 = new Movie("enthiran","Sankar","Rajini");
        
        System.out.println(obj1.movieReview());
 
	}
}


