package com.java3;

import java.util.Stack;

public class RemoveStackAllElements {
	public static void main(String args[]) 
    { 
         
        Stack<String> stack = new Stack<String>(); 
  
        // Use add() method to add elements into the Stack 
        stack.add("Welcome"); 
        stack.add("To"); 
        stack.add("java"); 
        stack.add("class"); 
        stack.add("in relevantz"); 
  
      
        System.out.println("Stack: " + stack); 
  
        // Clearing the Stack using clear() method 
        stack.clear(); 
  
        // Displaying the final Stack after clearing; 
        System.out.println("The final Stack: " + stack); 

}
}
