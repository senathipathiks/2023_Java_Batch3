package com.java3;

import java.util.Stack;

public class CountSize {
	public static void main(String args[]) 
    { 
         
        Stack<String> stack = new Stack<String>(); 
  
        // Use add() method to add elements into the Stack 
        stack.add("Welcome"); 
        stack.add("To"); 
        stack.add("java"); 
        stack.add("class"); 
        stack.add("of data structure");
        stack.add("in relevantz"); 
  
      
        System.out.println("Stack: " + stack); 
  
        // Clearing the Stack using clear() method 
       
  
        // Displaying the final Stack after clearing; 
        System.out.println("The  Stack size: " + stack.size()); 
        Stack<Integer> stack1 = new Stack<Integer>();
     
        stack1.add(10); 
        stack1.add(15); 
        stack1.add(30); 
        stack1.add(20); 
        stack1.add(5); 
        System.out.println("Number Stack: " + stack1); 
        System.out.println("The  Stack size: " + stack1.size()); 

}

}
