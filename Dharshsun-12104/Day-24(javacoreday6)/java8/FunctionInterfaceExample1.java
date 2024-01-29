package com.javacoreday6;

public class FunctionInterfaceExample1 {

	public static void main(String[] args) {
		
		  // create anonymous inner class object
        new Thread(new Runnable() {
            @Override public void run()
            {
                System.out.println("New thread created");
            }
        }).start();

	}

}
