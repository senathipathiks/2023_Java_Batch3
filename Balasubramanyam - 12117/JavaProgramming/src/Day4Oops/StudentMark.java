package com.Day4Oops;

class Students{
	private String stuName;
	private int stuId;
	
	void setStudentDetails(int stuId,String stuName) {
		this.stuId=stuId;
		this.stuName=stuName;
	}
}

class Marks extends Students{
	private int m1,m2,m3;
	
	void setStudentDetails(int stuId,String stuName,int m1,int m2,int m3) {
		super.setStudentDetails(stuId, stuName);
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	    int tot = m1 + m2 + m3;   
	    int  avg = tot/3;
	    System.out.println("Student id: "+stuId);
	    System.out.println("Student Name: "+stuName);
	    System.out.println("Student marks: "+m1+" "+m2+" "+m3);
	}
}

class Result extends Students{
	 String grade;
	 
	  void result(int avg) {
		  if(avg > 40)
	        {
	           grade = "Pass";
	        }
	        else
	        {
	           grade = "Fail";
	        }
		System.out.println("Result: "+grade);
	  }
}

public class StudentMark {
   public static void main(String[] args) {
	Marks m = new Marks();
	m.setStudentDetails(101, "Lokesh", 50, 50, 100);
	Result r = new Result();
	r.result(0);
   }
}
