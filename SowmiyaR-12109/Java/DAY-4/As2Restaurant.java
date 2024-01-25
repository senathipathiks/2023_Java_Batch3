package Day4;
//3. Write a Java program to create a class called "Restaurant" 
//with attributes for menu items, prices, and ratings, 
//and methods to add and remove items, and to calculate average rating.

	import java.util.ArrayList;

	class Restaurant{
		ArrayList<String> items;
		ArrayList<Integer> price;
		ArrayList<Integer> rating;
		
		Restaurant(){
			this.items= new ArrayList<String>();
			this.price= new ArrayList<Integer>();
			this.rating= new ArrayList<Integer>();
		}
		
	       
		void additems() {
			items.add("Veg friedrice");
			items.add("non-veg friedrice");
			items.add("chicken briyani");
			items.add(" mutton briyani");
			System.out.println("Menu Food Items: "+ items);
		}
		 
		void removeitems() {
			items.remove(0);
			System.out.println("Removed list: "+items);
		}
		
		void avgrate() {
			rating.add(4);
			rating.add(8);
			rating.add(6);
			rating.add(3);
			System.out.println("Rating List is: "+rating);
			int sum =0;
			for(int i : rating) {
				sum=sum+i;
			}
			int avg=sum/4;
			System.out.println("The average of the Rating is: "+avg);
			
		}
		
	}

	public class As2Restaurant {

		public static void main(String[] args) {
	          Restaurant obj = new Restaurant();
	          obj.additems();
	          obj.removeitems();
	          obj.avgrate();

		}

	}
