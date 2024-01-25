/*Write a Java program to create a class called "Restaurant" with attributes for menu items,
 *  prices, and ratings, and methods to add and remove items, and to calculate average 
 *  rating.
 */
package Day4;

import java.util.ArrayList;
import java.util.List;

class Restaurant {
	ArrayList<String> items;
	ArrayList<Integer> price;
	ArrayList<Integer> rating;

	Restaurant() {
		this.items = new ArrayList<String>();
		this.price = new ArrayList<Integer>();
		this.rating = new ArrayList<Integer>();
	}

	void additems() {
		items.add("Dosa");
		items.add("idly");
		items.add("chicken");
		items.add("briyani");
		System.out.println("Menu Food Items are: " + items);
	}

	void removeitems() {
		items.remove(0);
		System.out.println("Removed list are: " + items);
	}

	void avgrate() {
		rating.add(4);
		rating.add(8);
		rating.add(6);
		rating.add(3);
		System.out.println("Rating List is: " + rating);
		int sum = 0;
		for (int i : rating) {
			sum = sum + i;
		}
		int avg = sum / 4;
		System.out.println("The average of the Rating is: " + avg);

	}

}

public class RestraurantAss2 {

	public static void main(String[] args) {
		Restaurant obj = new Restaurant();
		obj.additems();
		obj.removeitems();
		obj.avgrate();

	}
}