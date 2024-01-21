package Com.Day1;

class Student {
	private int stuID;
	private String studName;
	private String dept;
	private String gender;
	Student(){
		
	}
	// constructor overloading
	Student(int stuID, String studName, String dept, String gender){
		this.stuID=stuID;
		this.studName=studName;
		this.dept=dept;
		this.gender=gender;
		}
	void displayStudent() {
		System.out.println("Student ID :" +stuID);
		System.out.println("Student Name :" +studName);
		System.out.println("Student Deparment :" +dept);
		System.out.println("Student Gender :" +gender);

	}
public static void main(String[] args) {
	Student obj1=new Student(4020,"kaviya","CSE","Female");
	obj1.displayStudent();
	
	Student obj2=new Student();
	obj2.displayStudent();
	}

}
