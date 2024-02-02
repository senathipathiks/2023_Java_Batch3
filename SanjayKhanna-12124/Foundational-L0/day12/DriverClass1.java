package com.day12;

interface Department{
	String detpName ="Computer Science";
	String detpHead ="John Rangasamy";
	void displayDetails();
}

class Hostel{
	String hostelName;
	String hostelLocation;
	int numberOfRoom;
	
	public void getHostelDetails(String hostelName,String hostelLocatio,int numberOfRoom) {
		this.hostelName=hostelName;
		this.hostelLocation=hostelLocatio;
		this.numberOfRoom=numberOfRoom;
	}
	
	public void diplayHostelDetails() {
		System.out.println("Hostel Name : "+hostelName);
		System.out.println("Hostel Location : "+hostelLocation);
		System.out.println("Number of Room : "+numberOfRoom);
	}
}

class Student extends Hostel implements Department{
	
	public void displayDetails() {
		System.out.println("Department Name : "+detpName);
		System.out.println("Department Head : "+detpHead);
	}
	
	
}
public class DriverClass1 {

	public static void main(String[] args) {
		

	}

}
