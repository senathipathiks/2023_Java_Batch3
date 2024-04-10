package com.springboot.model;

	import lombok.AllArgsConstructor;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;
	 
	import jakarta.persistence.*;
	 
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@Entity
	@Table
	public class Movie {
	 
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	 
	    @Column(name="Title")
	    private String movieName;
	    
	    @Column(name="Director")
	    private String directorName;
	    
	    @Column(name="ScreenNo")
	    private String screenNo;
	    
	    @Column(name="Ratings")
	    private int ratings;

	    
	    
	    
		public Movie() {
			super();
			// TODO Auto-generated constructor stub
		}




		public Movie(long id, String movieName, String directorName, String screenNo, int ratings) {
			super();
			this.id = id;
			this.movieName = movieName;
			this.directorName = directorName;
			this.screenNo = screenNo;
			this.ratings = ratings;
		}




		public long getId() {
			return id;
		}




		public void setId(long id) {
			this.id = id;
		}




		public String getMovieName() {
			return movieName;
		}




		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}




		public String getDirectorName() {
			return directorName;
		}




		public void setDirectorName(String directorName) {
			this.directorName = directorName;
		}




		public String getScreenNo() {
			return screenNo;
		}




		public void setScreenNo(String screenNo) {
			this.screenNo = screenNo;
		}




		public int getRatings() {
			return ratings;
		}




		public void setRatings(int ratings) {
			this.ratings = ratings;
		}




		@Override
		public String toString() {
			return "Movie [id=" + id + ", movieName=" + movieName + ", directorName=" + directorName + ", screenNo="
					+ screenNo + ", ratings=" + ratings + "]";
		}
	    
	    
	    

		
	
}
