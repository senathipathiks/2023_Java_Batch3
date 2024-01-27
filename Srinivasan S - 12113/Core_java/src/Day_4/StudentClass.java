package Day_4;

class Student{
	int rollNo;
	String name;
	
	public Student() {
	
	}

	Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	Student (Student e){
		
		this.rollNo=e.rollNo;
		this.name=e.name;
	}
	
	
	
	@Override
	public String toString() {
		
		return "Student[rollNo : "+rollNo+", name : "+name+" ]";
	}
	
}

public class StudentClass {
	public static void main(String[] args) {
		Student s1=new Student(263,"Srini");//normal object creation
		System.out.println(s1.toString()+"It is argument constructor");
		
		System.out.println(new Student(257,"Shiva").toString());// creating anonymous function
		
		System.out.println(new Student().toString()+" It is default constructor");
		
		System.out.println(new Student(s1).toString()+" It is copy constructor");

	}

}
