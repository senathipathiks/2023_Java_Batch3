package Com.Day4;

class Student{
	int rollno;
	String name;
	
	Student(){ //default constructor
		
	}
	public Student(int rollno, String name) {
		//super();
		this.rollno = rollno;// this for mentioning the current instance
		this.name = name;
	} 
	
	@Override // overriding toString method to display the details 
	public String toString() {
		return "Student{rollno="+rollno+",name="+name+"}";
	}
}

public class StudentDemo {

	public static void main(String[] args) {
    Student obj1=new Student(123,"Kaviya");
    System.out.println(obj1.toString());//through object creation
    
    
    System.out.println(new Student(124,"Kavi").toString()); // creating anonymous function
    System.out.println(new Student(125,"kp").toString());
	}

}
