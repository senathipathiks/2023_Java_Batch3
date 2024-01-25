package rel.day4.oops.classObject;


class Student{
	int rollno;
	String name;
	
	public Student() {
	}
	
	
	
	public Student(int rollno, String name) {
		
		this.rollno = rollno;
		this.name = name;
	}
	
	Student(Student s){
		
		System.out.println("I'm Copy Constructor called");
		this.rollno = s.rollno;
		this.name = s.name;
	}

	@Override
	public String toString() {
		return "name : "+name+" \nrollno : "+rollno;
	}
	
	public Student details() {
		return this;
	}
}


public class StudentDriver {
 
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Sundhar Raj");//parameterized constructor
		
//		Student s2 = new Student(s1);//Copy constructor
		
		new Student();//default constructor
		
//		System.out.println(s1);
		
//		System.out.println(new Student(102, "Srinivasan"));
		
		System.out.println(s1.details());
	}

}
