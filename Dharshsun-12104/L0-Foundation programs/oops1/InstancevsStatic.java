package com.oops1;

public class InstancevsStatic {
      static int a = 10;
      
      public static void main(String[] args) {
    	 
    	  
    	  InstancevsStatic obj1 = new InstancevsStatic();
    	  InstancevsStatic obj2 = new InstancevsStatic();
    	  
    	  System.out.println(obj1.a);
    	  System.out.println(obj2.a);
    	  
    	  obj1.a = 20;
    	  System.out.println(obj1.a);
    	  System.out.println(obj2.a);
      }
}
