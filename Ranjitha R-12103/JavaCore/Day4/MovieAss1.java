/*Write a Java program to create a class called "Movie" with attributes for title, director, 
 * actors, and reviews, and methods for adding and retrieving reviews.*/
package Day4;

import java.util.Scanner;

class movie {
	String title;
	String director = "Gowtham Menan";
	String actors = "Suriya";
	String reviews;

	void addtitle() {
		System.out.println("Enter Title?");
		Scanner sc = new Scanner(System.in);
		title = sc.nextLine();
	}

	void gettitle() {
		System.out.println("title is: ");
		System.out.println(title);
	}

	void addreview() {
		System.out.println("Say You Review about this Movie: ");
		Scanner sc = new Scanner(System.in);
		reviews = sc.nextLine();

	}

	void getreview() {
		System.out.println("Reviews are: ");
		System.out.println(reviews);
	}
}

public class MovieAss1 {

	public static void main(String[] args) {
		movie obj = new movie();
		obj.addtitle();
		obj.gettitle();
		obj.addreview();
		obj.getreview();

	}

}
