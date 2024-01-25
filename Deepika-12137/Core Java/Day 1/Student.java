package oops;

public class Student {
        private int studId;
        private String studName;
        private String dept;
        private String gender;
        
        Student(){
        	
        }
        Student(int studId,String studName,String dept,String gender){
        	this.studId=studId;
        	this.studName=studName;
        	this.dept=dept;
        	this.gender=gender;
        }
        void displayStudent() {
        	System.out.println("student ID is "+studId);
        	System.out.println("student Name is "+studName);
        	System.out.println("student Department is "+dept);
        	System.out.println("student gender is "+gender);
       }
 public static void main(String s[]) {
	 Student s1=new Student(111,"deepika","cse","female");
	 s1.displayStudent();
	 Student s2=new Student();
	 s2.displayStudent();
 }
}

