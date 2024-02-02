package Day4;

class StudentEx{
	int rollno;
	String name;
	
	static int count;
	
	public StudentEx() {
		
	}
	
public StudentEx(int rollno) {
	this.rollno=rollno;
		
	}

	
public StudentEx(int rollno,String name) {
	
	
//	this(rollno); // constructor which is accepting one arg
	this.rollno=rollno;
	this.name=name;
	System.out.println("jothilingam");
	
}
public StudentEx(String name,int rollno) {
	
	
	this(rollno,name);
//	this(rollno); // constructor which is accepting one arg
	this.rollno=rollno;
	this.name=name;
	
	
}

public StudentEx(StudentEx e) {
//	this(e.rollno,e.name); 
	rollno=e.rollno;
	name=e.name;
	
}

static int increament() {
	return ++count;
}

@Override
public String toString() {
	return "StudentDetails [rollno=" + rollno + ", name=" + name + "]";
}

	
}

public class studentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentEx obj=new StudentEx(123,"jothi");
		System.out.println(obj.toString());
		System.out.println(StudentEx.increament());
		System.out.println(new StudentEx(124, "hema").toString());
		
		StudentEx obj1=new StudentEx(obj);
		System.out.println(obj1.toString());
		
		StudentEx obj2=new StudentEx("jothilingam",125);
		System.out.println(obj2.toString());
		
		System.out.println(StudentEx.increament());
	}

}
