package Day4;

 class StudentExp{
	 int rollno;
	 String name;
	 StudentExp(){
		 
	 }
	 
	 StudentExp(int rollno,String n){
		 rollno=rollno;
		 name=n;
	 }
	 StudentExp(StudentEx e){
		 rollno=e.rollno;
		 name=e.name;
	 }
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	 
	 
 }
public class StudentDemoEx1 {

	public static void main(String[] args) {
		StudentExp obj=new StudentExp(123,"sowmi");
		System.out.println(obj.toString());
		
		System.out.println( new StudentExp().toString());
		
		StudentExp obj1=new StudentExp();
		System.out.println(obj1.toString());
		

	}

}

