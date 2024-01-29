package day1;
class Student{
	int rollno;
	String name;
	Student(){
		System.out.println("super class constructor");
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

class mark extends Student{
	int mark1,mark2,mark3;
	mark(){
		super();
		System.out.println("Base class constructor");
	}
	public mark(int no,String n,int m1, int m2, int m3) {
		super(no,n);
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
	}
	@Override
	public String toString() {
		return "mark [mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mark m=new mark(122,"kiruba",11,22,33);
		System.out.println(m.toString());
		mark m2=new mark();

	}

}
