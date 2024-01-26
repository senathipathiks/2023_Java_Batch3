package com.Day5;

interface Student{
	
	
	
	abstract void displayInfo();
	
	
}

class PersonalInfo implements Student{
	
   String Student;
   String Dept;
   String Add;
   long PhoneNo;
   
   public PersonalInfo(String Student,
   String Dept,
   String Add,
   long PhoneNo) {
	   
	   this.Student=Student;
	   this.Dept=Dept;
	   this.Add=Add;
	   this.PhoneNo=PhoneNo;
	
}

	@Override
	public void displayInfo() {
		
		System.out.println("Student Name is :"+Student+"\nStudent Department :"+Dept
				+"\nStudent Address :"+Add+"\nStudent Mobile No :"+PhoneNo );
		
		
	}
	
	
}

class CollegeInfo implements Student{

	
	String College_Name;
	String Collegeadd;
	String Collegeph;
	String ClgDepts;
	
	public CollegeInfo(String College_Name,
	String Collegeadd,
	String Collegeph,
	String ClgDepts) {
		
		this.College_Name=College_Name;
		this.Collegeadd=Collegeadd;
		this.Collegeph=Collegeph;
		this.ClgDepts=ClgDepts;
		
	}
	
		
	@Override
	public void displayInfo() {
		
		System.out.println("College Name is :"+College_Name+"\nCollege Departments :"+ClgDepts
				+"\nCollege Address :"+Collegeadd+"\nCollege Mobile No :"+Collegeph );
		
		
	}
		
		
	}
	
	


public class Students {

	public static void main(String[] args) {
		
		Student s = new PersonalInfo("Prasanth","CSE","TTP",908765445);
		Student s1 = new CollegeInfo("GKMCET","Chennai","9023456","Mech,CSE,ECE,EEE");
		
		s.displayInfo();
		System.out.println("*****************************************************");
		
		s.displayInfo();
		
		
		

	}

}
