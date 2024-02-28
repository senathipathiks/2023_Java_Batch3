package com.postassessment;

class Person {
	
	    private String name;
	    private int age;
	    private String country;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }
	    
	    
	    
}

public class MainClass{
	
	public static void main(String[] args) {
		
		        Person person = new Person();
		        
		        System.err.println("Before Initializing the value");
		        
		        System.out.println("Name: " + person.getName());
		        System.out.println("Age: " + person.getAge());
		        System.out.println("Country: " + person.getCountry());
		        
		        person.setName("Sathiyan");
		        person.setAge(22);
		        person.setCountry("India");
		        
		        System.err.println("After Initializing the value");

		        System.out.println("Name: " + person.getName());
		        System.out.println("Age: " + person.getAge());
		        System.out.println("Country: " + person.getCountry());
		    }
	}

