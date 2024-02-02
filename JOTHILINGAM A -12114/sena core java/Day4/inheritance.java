package Day4;

class StudentEx1{
	int rollno;
	String name;
	
public StudentEx1() {
	// TODO Auto-generated constructor stub
}
public StudentEx1(int rollno,String name) {
	
	this.rollno=rollno;
	this.name=name;
	}
@Override
public String toString() {
	return "StudentEx1 [rollno=" + rollno + ", name=" + name + "]";
}

}

class mark extends StudentEx1{
	int mark1,mark2,mark3;
	mark(){
		super();
	}
	mark(int rollno,String name,int m1,int m2,int m3){
		super(rollno,name);
		mark1=m1;mark2=m2;mark3=m3;
	}
	@Override
	public String toString() {
		return "marks [tamil=" + mark1 + ", English=" + mark2 + ", Maths=" + mark3 + ", rollno=" + rollno + ", name="
				+ name + "\n toString()=" + super.toString() + "]";
	}
}

public class inheritance {
	

	public static void main(String[] args) {
		mark m=new mark(123,"jothi",100,1001,100);
		System.out.println(m.toString());
	}

}
