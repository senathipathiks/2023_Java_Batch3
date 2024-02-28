package Day4.ClassExamples;

class Student {
	int rollno;
	String name;
    static int count;//used for entire 
	Student() {

	}// Default Constructor
	

	Student(int no) {
		rollno = no;
	}

	Student(int rollno, String name) {
		this(rollno);
		// this.rollno=rollno;
		this.name = name;
		// without using this when arguments name are same it shows null
	}

	// CopyConstrutor
	Student(Student e) {
		rollno = e.rollno;
		name = e.name;
	}
	static int increment()
	{
		return ++count;
	}
	void display() {
		System.out.println("This method is invoked by this keyword");
	}

	@Override
	public String toString() {
		this.display();
		return "Student[rollno=" + rollno + ", name=" + name + "}";
	}
}

public class StudentDemo {

	public static void main(String[] args) {
		Student obj = new Student(122, "Prem");
		System.out.println(obj.toString());
		System.out.println(new Student(134, "Prem").toString());// Anonymous object
         // obj.increment();
		// Student obj1=obj;
		Student obj1 = new Student(obj);
		System.out.println(obj1.toString());
		
		System.err.println(Student.increment());
		System.err.println(Student.increment());
		System.err.println(Student.increment());


		
	}

}
