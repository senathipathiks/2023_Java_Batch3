package com.day4;

import java.util.ArrayList;
import java.util.HashMap;

class Restaurant {
    
    private HashMap<String, Double> menu;
    private ArrayList<Integer> ratings;
    

    
    public HashMap<String, Double> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, Double> menu) {
        this.menu = menu;
    }

    public Restaurant() {
        menu = new HashMap<>();
        ratings = new ArrayList<>();
    }

    public void addItem(String item, double price) {
        menu.put(item, price);
    }

    public void removeItem(String item) {
        menu.remove(item);
    }

    public void addRating(int rating) {
        ratings.add(rating);
    }

    public double getAverageRating() {
        if (ratings.size() == 0) {
            return 0;
        }
        double sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return sum / ratings.size();
    }
}


public class RestuarantDriver {

    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        r.addItem("Pizza", 10.99);
        r.addItem("Burger", 5.99);
        r.addItem("Salad", 7.99);
        r.addRating(4);
        r.addRating(5);
        r.addRating(3);
        System.out.println("Menu: " + r.getMenu());
        System.out.println("Average rating: " + r.getAverageRating());

    }

}