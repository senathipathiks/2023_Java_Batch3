package classIntro;

public class Student {
	private int studId;
	private String studName;
	private String dept;
	private String gender;
	Student(){
		System.out.println("hii");
	}
	public Student(int studId, String studName, String dept, String gender) {
		this.studId = studId;
		this.studName = studName;
		this.dept = dept;
		this.gender = gender;
	}
	void display() {
		System.out.println("Student ID : "+studId);
		System.out.println("Student Name: "+studName);
		System.out.println("Dept: "+dept);
		System.out.println("Gender: "+gender);
	}
	public static void main(String[] args) {
		Student s1=new Student(11,"kiruba","BCA","Male");
		s1.display();
		Student s2=new Student();
		s2.display();
		
	}
	
	

}
