package Day_1;

public class Student {
	private int studId;
	private String studName;
	private String dept;
	private String gender;
	Student(int studId,String studName,String dept,String gender){
		this.studId=studId;
		this.studName=studName;
		this.dept=dept;
		this.gender=gender;
	}
	void displayStudent() {
		System.out.println("Student Id"+studId);
		System.out.println("Student Name"+studName);
		System.out.println("Dept"+dept);
		System.out.println("Gender"+gender);
	}
	public static void main(String s[]) {
		Student s1=new Student(123,"Varshinee","CSE","Female");
		s1.displayStudent();
		
	}
	

	}


