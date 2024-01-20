package Day1;

public class Student {
	private int stuID;
	private String stuName;
	private String dept;
	private String gender;  //instance variable
	Student(){
		
	}
    Student(int stuID,String stuName,String dept,String gender){ //local variable
	this.stuID=stuID;
	this.stuName=stuName;
	this.dept=dept;
	this.gender=gender;
	}
	void displayStudent(){
		System.out.println("Student ID:"+stuID);
		System.out.println("Student Name:"+stuName);
		System.out.println("Student Dept:"+dept);
		System.out.println("Student gender:"+gender);
		}
	public static void main (String s[]) {
		Student s1=new Student(123,"sowmi","EEE","Female");
		s1.displayStudent();
		System.out.println(".................");
		Student s2=new Student();
		s2.displayStudent();
	}

}
