package com.newclass;

public class StudentMark {


	private int studentId;
	private String studentName;
	private String dept;
	private String genter;
	
//	private int m1;
//	private int m2;
//	private int m3;
	private int avg;
	
	
	// constructor
	StudentMark(int studentId,String studentName,String dept,String gender){
		this.studentId=studentId;
		this.studentName=studentName;
		this.dept=dept;
		this.genter=gender;
		
	}
	
	void displayStudent() {
		 
		System.out.println("Student ID :"+studentId);
		System.out.println("Student Name :"+studentName);
		System.out.println("Student Department :"+dept);
		System.out.println("Student Gender :"+genter);
		
		
		System.out.println("**********************************************************");
		
	}
	
	void studentAvg(int m1,int m2, int m3) {
		
		
		
		int s = m1+m2+m3;
		
		avg = s/3;
		
		
		
		System.out.println("The mark Average is :"+avg);
		
		if(avg >50 && avg <=60) {
			System.out.println("Your Grade is D grade");
		}
		else if(avg >=60 && avg <=70) {
			
			System.out.println("Your Grade is C grade");
			
		}
		
         else if(avg >=70 && avg <=80) {
			
			System.out.println("Your Grade is B grade");
			
		}
		
         else if(avg >=80 && avg<=90) {
 			
 			System.out.println("Your Grade is A grade");
 			
 		}
		
         else if(avg >=90 && avg <=100) {
 			
 			System.out.println("Your Grade is O grade");
 			
 		}
		
         else {
        	 
        	 System.out.println("Sorry !!!! you are Fail, Prepare Well");
         }
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		
		StudentMark s = new StudentMark(12119, "Prashanth", "Software Engineer", "Male");
		s.displayStudent();
		
		s.studentAvg(100, 100, 100);
		

	}


}
