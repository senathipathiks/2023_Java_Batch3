package rel.day4.oops.assignment;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 3. Write a Java program to create a class called "Restaurant" 
 * with attributes for menu items, prices, and ratings, and 
 * methods to add and remove items, and to calculate average rating.
 */

//Define the Restaurant class
class Restaurant {
// Declare the attributes as private ArrayLists
	private ArrayList<String> menuItems;
	private ArrayList<Double> prices;
	private ArrayList<Double> ratings;

// Define the constructor that initializes the attributes as empty ArrayLists
	public Restaurant() {
		this.menuItems = new ArrayList<String>();
		menuItems.add("poori");
		menuItems.add("pongal");
		menuItems.add("idly");
		menuItems.add("dosa");
		menuItems.add("vada");
		this.prices = new ArrayList<Double>();
		prices.add(40.00);
		prices.add(35.00);
		prices.add(30.00);
		prices.add(50.00);
		prices.add(20.00);
		this.ratings = new ArrayList<Double>();
		ratings.add(0.0);
		ratings.add(0.0);
		ratings.add(0.0);
		ratings.add(0.0);
		ratings.add(0.0);
	}

// Define a method to add an item with its price to the menu
	public void addItem(String item, double price) {
		// Add the item and the price to their respective ArrayLists
		this.menuItems.add(item);
		this.prices.add(price);
		// Initialize the rating for the new item as zero
		this.ratings.add(0.0);
	}

// Define a method to remove an item from the menu
	public void removeItem(String item) {
		// Find the index of the item in the menuItems ArrayList
		int index = this.menuItems.indexOf(item);
		// If the item exists, remove it and its corresponding price and rating
		if (index >= 0) {
			this.menuItems.remove(index);
			this.prices.remove(index);
			this.ratings.remove(index);
		}
	}

// Define a method to add a rating for an item
	public void addRating(String item, double rating) {
		// Find the index of the item in the menuItems ArrayList
		int index = this.menuItems.indexOf(item);
		// If the item exists, update its rating by adding the new rating
		if (index >= 0) {
			// Get the current rating for the item
			double currentRating = this.ratings.get(index);
			// Set the new rating as the sum of the current and the new rating
			this.ratings.set(index, currentRating + rating);
		}
	}

// Define a method to calculate the average rating for an item
	public double getAverageRating(String item) {
		// Find the index of the item in the menuItems ArrayList
		int index = this.menuItems.indexOf(item);
		// If the item exists, return its average rating
		if (index >= 0) {
			// Get the total rating and the number of ratings for the item
			double totalRating = this.ratings.get(index);
			int numRatings = this.menuItems.size();
			// Return the average rating as the total rating divided by the number of
			// ratings
			return (double) totalRating / numRatings;
		} else {
			// If the item does not exist, return zero
			return 0.0;
		}
	}

// Define a method to display the menu with the items and their prices
	public void displayMenu() {
		// Loop through the menuItems ArrayList and print each item and its price
		for (int i = 0; i < menuItems.size(); i++) {
			System.out.println(i + 1 + ". " + menuItems.get(i) + ": $" + prices.get(i));
		}
	}
}

public class RestaurantDriver {

	public static void main(String[] args) {

		boolean b = true;
		Scanner sc = new Scanner(System.in);

		Restaurant r1 = new Restaurant();

		while (b) {
			System.out.println("\t\t\tWelcome to Hotel Srinivasan\n\tMenus");
			System.out.println("1.Add Dishes\n2.Remove Dish\n3.Rate Dish\n4.average rating of dish\n5.Exit");

			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter dish name & price");
				r1.addItem(sc.next(), sc.nextDouble());
				System.out.println("Dish added successfully...!");
				break;
			case 2:
				System.out.println("Enter dish name");
				r1.removeItem(sc.next());
				System.out.println("Dish added successfully...!");
				break;
			case 3:
				System.out.println("Enter dish name & its rating out of five");
				r1.addRating(sc.next(), sc.nextDouble());
				System.out.println("***Thank You for rating us***");
				break;
			case 4:
				System.out.println("Enter the dish name");
				System.out.println("the average rating of the dishes is "+r1.getAverageRating(sc.next()));
				break;
			case 5:
				//Exit
				b=false;
				System.out.println("*****Thank You*****");
				break;
			

			default:
				System.out.println("\t\tPlease enter valid input");
				break;
			}

		}

	}
}
