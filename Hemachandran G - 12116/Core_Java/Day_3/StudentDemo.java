package Day_3;


class Student{
	
	
	int Id;
	String Name;
	Student(){ // default constructor
		
	}
	
	Student(int no){  // parameterized constructor 
		Id = no;
		
	}
	
	Student(int Id, String Name){
		this(Id);
		this.Name=Name;
	}
	
	Student(Student a){  // Copy constructor
		Id = a.Id;
		Name = a.Name;
	}
	
	static int count=0;
	
	static  void increment() {
		System.out.println((++count)); 
	}
	

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + "]";
	}
	
	
	
}

public class StudentDemo {

	public static void main(String[] args) {
		
		Student s = new Student(001,"Heram"); // parameterized constructor 
		System.out.println(s.toString());
		
		System.out.println(new Student().toString());  // Default Constructor
		
		Student s1 = new Student(s);
		System.out.println(s1.toString());  // Copy Constructor
		
		System.out.println(Student.count);
		Student.increment();

	}

}
