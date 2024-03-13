package com.Day4Oops;
class Restaurant1{
private String menuitems;
private double prices;int ratings;
   void add(String m,double p,int r) {
	   this.menuitems=m;
	   this.prices=p;
	   this.ratings=r;
	   System.out.println("Adding: "+menuitems+" "+prices+" "+ratings);
   }
   void remove(String m,double p) {
	   this.menuitems=m;
	   this.prices=p;
	   System.out.println("Removing: "+menuitems+" "+prices);
   }
   void calculateaveragerating(int rating) {
	   int a=rating+rating+rating;
	   System.out.println("The average rating: "+a/3);
   }
}
public class Restaurant {
	public static void main(String[] args) {
		Restaurant1 r = new Restaurant1();
		r.add("Biryani", 100.0, 5);
		r.remove(null, 0);
		r.calculateaveragerating(5);

	}

}
