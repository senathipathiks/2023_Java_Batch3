package Java_Day_4;


class Student1{
	void display() {
		System.out.println("Student Name: Varshinee");
	}
}
class Mark01 extends Student1{
	void display() {
		int tamil=70;
		int eng=90;
		int mat=85;
		int sci=89;
		int soc=95;
		System.out.println("Tamil: "+tamil);
		System.out.println("English: "+eng);
		System.out.println("Maths: "+mat);
		System.out.println("Science: "+sci);
		System.out.println("Social: "+soc);
	}
}
class Result extends Mark01{
	void display() {
		System.out.println("Students Overrall marks is: 82%");
	}
}

public class Student1010 {
	
	

	public static void main(String[] args) {
	    Student1 obj = new Student1();
	    obj.display();
		Student1 obj1 = new Mark01();
		obj1.display();
		Student1 obj2 = new Result();
		obj2.display();
		

	}

}
