package Com.Day4;

class Studentt{
	void stuData() {
		System.out.println("Sudent Name is Kaviya..!!!");
	}
}
class Mark1 extends Studentt{
	void StuMark() {
		System.out.println("Student mark is 78..");
	}
	
}
class Result extends Mark1{
	void stuResult() {
		System.out.println("Student Grade is B");
	}
	
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		Result obj1=new Result();
		obj1.stuData();
		obj1.StuMark();
		obj1.stuResult();

	}

}
