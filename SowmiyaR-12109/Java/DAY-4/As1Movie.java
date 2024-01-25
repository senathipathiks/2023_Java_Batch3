package Day4;
//Write a Java program to create a class 
//called "Movie" with attributes for title, director, actors, and reviews, 
//and methods for adding and retrieving reviews.
import java.util.Scanner;
class movie{
	String title;
	String director;
	String actor;
	String reviews;
	
	
	
	void addtitle() {
		System.out.println("Enter Title?");
		Scanner sc=new Scanner(System.in);
		title=sc.nextLine();
	}
	void gettitle() {
		System.out.println("title is: ");
		System.out.println(title);
	}
	void adddirector() {
		System.out.println("Enter director name");
		Scanner sc=new Scanner(System.in);
		director=sc.nextLine();
	}
	void getdirector() {
		System.out.println("director name is: ");
		System.out.println(director);
	}
	void adddactor() {
		System.out.println("Enter Actor name");
		Scanner sc=new Scanner(System.in);
		actor=sc.nextLine();
	}
	void getactor() {
		System.out.println("Actor name is: ");
		System.out.println(actor);
	}
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


public class As1Movie {

	public static void main(String[] args) {
	movie obj = new movie();
	obj.addtitle();
	obj.gettitle();
	obj.adddirector();
	obj.getdirector();
	obj.adddactor();
	obj.getactor();
	obj.addreview();
	obj.getreview();
	

	}

}
