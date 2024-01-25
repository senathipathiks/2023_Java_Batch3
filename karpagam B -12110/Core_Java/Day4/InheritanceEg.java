package Com.Day4;

class Student3{
	int rollno;
	String name;
	
	Student3(){ 
			
		}
	
	Student3(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	} 
	
	@Override // overriding toString method to display the details 
	public String toString() {
		return "Student{rollno="+rollno+",name="+name+"}";
	}
}
class Mark extends Student3{
	int mark1,mark2,mark3;
	Mark(){
		super();
	}
	Mark(int no,String n,int m1,int m2,int m3){
		super(no,n);
		mark1=m1;
		mark2=m2;
		mark3=m3;
	}
	@Override
	public String toString() {
		return "Mark [mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + ",toString()="+super.toString()+" ,"
				+ "rollno=" + rollno + ", name="
				+ name + "]";
}
}

public class InheritanceEg {

	public static void main(String[] args) {
		Mark obj1=new Mark(123,"kAVI",78,89,67);
	    System.out.println(obj1.toString() );
	}
}
