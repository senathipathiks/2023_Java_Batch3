//Student,Mark,Result
package Day4;

class StudentExs1{
	void displayGrade() {
		System.out.println("A+");
	}
}
class Marks extends StudentExs1{
	void displayMark() {
		System.out.println(96);
	}
}
class Result extends Marks{
	void displayResult() {
		System.out.println("Pass");
	}
}
public class MultilevelStudent {

	public static void main(String[] args) {
		StudentExs1 obj1=new StudentExs1();
		obj1.displayGrade();
		
		Marks obj2=new Marks();
		obj2.displayMark();
		
		Result obj3=new Result();
		obj3.displayResult();

	}

}
