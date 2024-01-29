package day1;


class Stud{

    static int count=0;
	int rollno;
	String name;
	Stud(){
		System.out.println("kiruba");

	}
	public Stud(int no) {
		rollno=no;

	}
	void display() {

		System.out.println("This class called by invoking ");

	}

	public Stud(int rollno, String name) {

		this.rollno = rollno;
		this.name = name;
	}
	public Stud(Stud e) {
		rollno=e.rollno;
		name=e.name;
	}
	static int incr() {
		return ++count;
	}

	@Override
	public String toString() {
		this.display();
		return "Stud [rollno=" + rollno + ", name=" + name + "]";
	}

}

public class IntroClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stud s=new Stud(132,"kiruba");//Parametrized construtor
		System.out.println(s.toString());
		System.out.println(Stud.incr());
		System.out.println(new Stud().toString());//default constructor
		System.out.println(new Stud(183,"Dhanya"));
		System.out.println(Stud.incr());
		Stud s11=new Stud(12365478);
		System.out.println(s11.toString());
		System.out.println(Stud.incr());
		Stud s1=new Stud(s);//Copy constructor
		System.out.println(s1.toString());
		System.out.println(Stud.incr());




	}

}
