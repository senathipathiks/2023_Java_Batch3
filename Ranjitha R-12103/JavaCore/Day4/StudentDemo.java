package Day4;

class StudentEx {
	int rollno;
	String name;

	StudentEx() { // default constructor

	}

	StudentEx(int no) {
		rollno = no;
	}

	StudentEx(int rollno, String name) { // argument constructor
//		this.rollno = rollno;
		this(rollno);// Constructor which is accepted one argument
		this.name = name;

	}

	StudentEx(StudentEx e) {
		rollno = e.rollno;
		name = e.name;
	}

	void classDisplay() {
		System.out.println("Student class");
	}

	@Override
	public String toString() {
		this.classDisplay();
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}

}

public class StudentDemo {

	public static void main(String[] args) {
		StudentEx obj = new StudentEx(123, "Ranjitha"); // Parameterized constructor
		System.out.println(obj.toString());

		System.out.println(new StudentEx(234).toString());

		System.out.println(new StudentEx().toString());// Anonymous object //default

		StudentEx obj1 = new StudentEx(obj); // copy constructor
		System.out.println(obj1.toString());

	}

}
