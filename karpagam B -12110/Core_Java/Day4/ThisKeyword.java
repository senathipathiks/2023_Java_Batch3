package Com.Day4;

class Student2{
	
	int rollno;
	String name;
	
	Student2(int no){//default constructor
	     rollno=no;
	}
	
     Student2(int rollno, String name) {
		this(rollno); // constructor which is accepting one argument
		this.name = name;
	}
     void classDisplay() {
    	 System.out.println("Student Class");
     }
    
	
	@Override // overriding toString method to display the details 
	public String toString() {
		this.classDisplay();
		return "Student{rollno="+rollno+",name="+name+"}";
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
	    Student2 obj1=new Student2(123,"Kaviya");
	    System.out.println(obj1.toString());
	}

}
