package Day_1;

public class Student {
	private int stuId;/*Instance variables in Java are non-static variables which are defined in a class
	 					outside any method, constructor or a block. */
	private String stuName;
	private String dept;
	private String gender;	
	
	public Student(int stuId, String stuName, String dept, String gender) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.dept = dept;
		this.gender = gender;
	}
	
	void displayStudent() {
		System.out.println("Student Id is: "+stuId);
		System.out.println("Student name is: "+stuName);
		System.out.println("Dept is: "+dept);
		System.out.println("Student gender is: "+gender);
		System.out.println("*******************");
	}

	public static void main(String[] args) {
		Student s1=new Student(121,"Srinivasan","ECE","Male");
		Student s2=new Student(111,"Kaviya","CSE","Female");
		Student s3=new Student(131,"Sundar","BCA","Male");
		Student s4=new Student(141,"Hemachandran","EEE","Male");
		Student s5=new Student(151,"Varshinee","ECE","Female");
		
		s1.displayStudent();
		s2.displayStudent();
		s3.displayStudent();
		s4.displayStudent();
		s5.displayStudent();	
	}
}
