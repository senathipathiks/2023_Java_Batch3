
package com.day5;



public class Except2 {

	public static void main(String[] args) {
          try {
        	  Class temp = Class.forName("com.day4.Class1");
        	  System.out.println("The Class is Found");
        	  
          }
          catch(ClassNotFoundException e) {
        	  System.out.println(e);
          }

	}

}

//we can able to declare multiple catch statement