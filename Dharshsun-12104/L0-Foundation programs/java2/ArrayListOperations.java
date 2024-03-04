package com.java2;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations {
	


	    public static void main(String[] args) {
	        ArrayList<String> elements = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);
	        
	        while (true) {
	            System.out.println("ArrayList Operations:");
	            System.out.println("1. Add Element");
	            System.out.println("2. Search Element");
	            System.out.println("3. Remove Element");
	            System.out.println("4. Update Element");
	            System.out.println("5. View All Elements");
	            System.out.println("6. Exit");
	            System.out.println("Enter your choice: ");
	            
	            int n = scanner.nextInt();
	            
	            switch (n) {
	                case 1:
	                    System.out.print("Enter the element to add: ");
	                    String newElement = scanner.next();
	                    elements.add(newElement);
	                    System.out.println("Element added successfully.");
	                    break;
	                    
	                case 2:
	                    System.out.println("Enter the element to search: ");
	                    String searchElement = scanner.next();
	                    if (elements.contains(searchElement)) {
	                        System.out.println("Element found in the ArrayList.");
	                    } else {
	                        System.out.println("Element not found in the ArrayList.");
	                    }
	                    break;
	                    
	                case 3:
	                    System.out.print("Enter the element to remove: ");
	                    String removeElement = scanner.next();
	                    if (elements.remove(removeElement)) {
	                        System.out.println("Element removed successfully.");
	                    } else {
	                        System.out.println("Element not found in the ArrayList.");
	                    }
	                    break;
	                    
	                case 4:
	                    System.out.println("Enter the element to update: ");
	                    String updateElement = scanner.next();
	                    if (elements.contains(updateElement)) {
	                        System.out.println("Enter the new value: ");
	                        String newValue = scanner.next();
	                        int index = elements.indexOf(updateElement);
	                        elements.set(index, newValue);
	                        System.out.println("Element updated successfully.");
	                    } else {
	                        System.out.println("Element not found in the ArrayList.");
	                    }
	                    break;
	                    
	                case 5:
	                    System.out.println("All Elements in the ArrayList:");
	                    for (String element : elements) {
	                        System.out.println(element);
	                    }
	                    break;
	                    
	                case 6:
	                    System.out.println("Exiting the program.");
	                    scanner.close();
	                    System.exit(0);
	                    break;
	                    
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        }
	    }
	}
