package Com.Day4;
import java.util.ArrayList;
import java.util.Scanner;

/*
 *  Write a Java program to create a class called "Restaurant" with attributes
 *   for menu items, prices, and ratings, and methods to add and remove items, and to calculate average rating
 */
public class Restuarant {
    static Scanner sc=new Scanner(System.in);
    static String items;
    static String prices="100";
    static int ratings;
    static String sum=" ";
    static int avg;
    Restuarant(String items, String prices, int ratings) {
        super();
        
    }
    
    ArrayList<String> list=new ArrayList<String>();
    ArrayList<Integer>list1=new ArrayList<Integer>();
    void adddish() {
        System.out.println("Enter the dish");
        items=sc.next();
        list.add(items);
        list.add(prices);
        System.out.println(list); 
    }
    
    void removedish() {
        items=sc.next();
        list.remove(items);
        System.out.println(list);
    }
    
    void ratings() {
        System.out.println("Enter the Ratings out of 5 ");
        ratings=sc.nextInt();
        if(ratings < 5) {
         list1.add(ratings);
         System.out.println( list1 );}
        else
            System.out.println("Give valid rating");
         
    }
    
    public static void main(String[] args) {
    	Restuarant res=new Restuarant(items, prices, ratings);
        boolean flag=true;
        while (flag) {
            
        
        System.out.println("1.Add dish\n2.Remove dish\n3.Ratings");
        int val=sc.nextInt();
        
        switch (val) {
        case 1:
            res.adddish();
            break;
        case 2:
            
            res.removedish();
            break;
        case 3:
            res.ratings();
        default:
            break;
        }
        System.out.println("Want to continue");
        System.out.println("1.yes\n2.no");
        int opt=sc.nextInt();
        if(opt==1) {
            flag=true;
        }
        else
            flag=false;
        }
    }

}