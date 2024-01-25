package Day4;

 class StudentEx{
	 int rollno;
	 String name;
	 StudentEx(){
		 
	 }
	 
	 StudentEx(int no,String n){
		 rollno=no;
		 name=n;
	 }
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	 
	 
 }
public class StudentDemo {

	public static void main(String[] args) {
		StudentEx obj=new StudentEx(123,"sowmi");
		System.out.println(obj.toString());
		
		System.out.println( new StudentEx().toString());
		
		StudentEx obj1=new StudentEx(12,"Ranji");
		System.out.println(obj1.toString());
		

	}

}
