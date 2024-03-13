package com.day2;

public class Student1 {
         private int id;
         private String name;
         private String city;
		
         public Student1() {
			System.out.println("Bean Created");
		}
		
		public void init() {
			System.out.println("I am in init() Method");
		}
		
		public void destroy() {
			System.out.println("I am in destroy() Method");
		}

		
         
}
