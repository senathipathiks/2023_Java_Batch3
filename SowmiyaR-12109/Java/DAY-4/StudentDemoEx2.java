package Day4;

 class StudentEx1{
	 int rollno;
	 String name;
	 StudentEx1(int no){
		rollno=no; 
	 }
	 
	 StudentEx1(int rollno,String name){
//		 rollno=rollno;
//		 name=n;
		 this(rollno);
		 this.name=name;
	 }
	 StudentEx1(StudentEx1 e){
		 rollno=e.rollno;
		 name=e.name;
	 }
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	 
	 
 }
public class StudentDemoEx2 {

	public static void main(String[] args) {
		StudentEx1 obj=new StudentEx1(123,"sowmi");
		System.out.println(obj.toString());
		
		System.out.println( new StudentEx1(1,"sowmiya").toString());
		
		StudentEx1 obj1=new StudentEx1(obj);
		System.out.println(obj1.toString());
		

	}

}

