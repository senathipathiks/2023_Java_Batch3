package Com.Day4;

class Student1{
	int rollno;
	String name;
	
	Student1(){ //default constructor
		
	}
     Student1(int rollno, String name) {
		this.rollno = rollno; 
		this.name = name;
	}
     Student1(Student1 e) {// copy constructor
 		this.rollno = e.rollno;
 		this.name =e. name;
 	}
	
	@Override // overriding toString method to display the details 
	public String toString() {
		return "Student{rollno="+rollno+",name="+name+"}";
	}
}

public class ConstructorType {

	public static void main(String[] args) {
		Student1 obj1=new Student1(123,"Kaviya"); // parameterized constructor
	    System.out.println(obj1.toString());//through object creation
	    
	    
	    System.out.println(new Student().toString()); // creating anonymous function or default constructor
	    
	    Student1 obj2=new Student1(obj1);//copy constructor
	    System.out.println(obj2.toString());
	}

}
