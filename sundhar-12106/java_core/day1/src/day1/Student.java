package day1;

public class Student {
	
	private int s_id;
	private String s_name;
	private String gender;
	private String dept;
	
	Student(int s_id, String s_name, String gender, String dept){
		this.s_id = s_id;
		this.s_name = s_name;
		this.gender = gender;
		this.dept = dept;
	}
	
	public void displayStudent() {
		System.out.println("Student id : "+ s_id);
		System.out.println("Student name : "+ s_name);
		System.out.println("Student dept : "+ dept);
		System.out.println("Student gender : "+ gender);
	}

}
