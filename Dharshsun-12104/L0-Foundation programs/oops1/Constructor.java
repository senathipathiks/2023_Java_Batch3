package com.oops1;

public class Constructor {
   Constructor(){
	   this("ABC");
	   System.out.println("A");
   }
   Constructor(int a){
	   System.out.println("B");
   }
   Constructor(String a){
	   System.out.println("C");
   }
   public static void main(String[] args) {
	   Constructor obj = new Constructor();
   }
}
