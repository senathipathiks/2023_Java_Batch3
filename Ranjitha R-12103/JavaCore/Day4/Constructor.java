package Day4;

class student {
	int rollno;
	String name;

	student() {

	}

	student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	student(student e) {
		rollno = e.rollno;
		name = e.name;
	}
}

public class Constructor {

	public static void main(String[] args) {

		student obj1 = new student();
		System.out.println(obj1.toString());

		student obj2 = new student(123, "Ram");
		System.out.println(obj2.toString());

		student obj3 = new student(obj2);
		System.out.println(obj3.toString());

	}

}
