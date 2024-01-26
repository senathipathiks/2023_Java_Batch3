package com.day1oops;
import java.util.Scanner;

public class StudentMarks {
	Scanner sc= new Scanner(System.in);
	
private int studid;
private String studname;
private String studgender;

private int subject1;
private int subject2;
private int subject3;

StudentMarks(int studid,String studname,String studgender){
	this.studid=studid;
	this.studname=studname;
	this.studgender=studgender;

}
public void displayStudentMarks() {
	System.out.println("Id of the student:"+" "+studid);
	System.out.println("Name of the student:"+" "+studname);
	System.out.println("Gender of the student:"+" "+studgender);
	
}
public char marks1(){
	System.out.println("Enter the mark of subject1");
	subject1=sc.nextInt();
	System.out.println("Enter the mark of subject2");
	subject2=sc.nextInt();
	System.out.println("Enter the mark of subject3");
	subject3=sc.nextInt();
	
	int grade=(subject1 + subject2 + subject3)/3;
	if(grade>90 && grade<100) {
		return 'A';
	}
		if (grade>70 && grade<80) {
			return 'B';
		}
		if(grade>35 && grade<70) {
			return 'C';
	}
		else {
			return 'F';
		}
	
	
}


	public static void main(String[] args) {
		StudentMarks s1= new StudentMarks(12,"Aaa","Male");
		s1.displayStudentMarks();
		System.out.println("Grade of the subject1:"+s1.marks1());
		
		

	}

}
