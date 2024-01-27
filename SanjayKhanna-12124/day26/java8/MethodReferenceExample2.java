package com.day26.java8;

interface Sayable{  
    void say();  
}  

public class MethodReferenceExample2 {
	
	 public static void saySomething(){  
	        System.out.println("Hello, this is static method.");  
	    }  
	 
	  public void Something(){  
	        System.out.println("Hello, this is non-static method.");  
	    }  

	public static void main(String[] args) {
		
//	    // Referring static method  
//        Sayable sayable = MethodReferenceExample2::saySomething;  
//        // Calling interface method  
//        sayable.say();  
        

        MethodReferenceExample2 methodReference = new MethodReferenceExample2();//Object Creation
        // Referring non-static method using reference  
            Sayable sayable1 = methodReference::Something;  
        // Calling interface method  
            sayable1.say();  
//            // Referring non-static method using anonymous object  
//            Sayable sayable2 = new MethodReferenceExample2()::Something; // You can use anonymous object also  
//            // Calling interface method  
//            sayable2.say();
		
//		//Using Lambda Function
//        Sayable sayable = () -> System.out.println("Using Lambda Expression...");
//        sayable.say();
	}

}
