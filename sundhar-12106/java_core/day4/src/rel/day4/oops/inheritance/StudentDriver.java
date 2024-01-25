package rel.day4.oops.inheritance;

class Student {

	int rollno;
	String name;

	public Student() {
	}

	public Student(int rollno, String name) {

		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}

}

class Marks extends Student {
	
	int m1,m2,m3;
	
	public Marks() {
		
	}

	public Marks(int roll,String name,int m1, int m2, int m3) {
		super(roll,name);
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	@Override
	public String toString() {
		return "Marks [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "," + super.toString() + "]";
	}

	
	
	

}

public class StudentDriver {
	
	public static void main(String[] args) {
		
		Marks s1 = new Marks(101, "Srinivasan", 80, 70, 90);
		
		System.out.println(s1);
	}

}
