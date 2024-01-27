package Day_4;

class Studentt{
	int rollno;
	String name;
	public Studentt(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		
		return "Student[rollNo : "+rollno+", name : "+name+" ]";
	}
	

}

class Mark extends Studentt{
	int mark1,mark2,mark3;

	public Mark(int no,String n,int mark1, int mark2, int mark3) {
		super(no,n);
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Roll no : "+rollno +"\nName of the student: "+name+"\nMark:[ Mark 1: "+mark1+" Mark 2: "+mark2+" Mark 3: "+mark3+" ]";
	}
	
	
	
}

public class Inheritance1 {

	public static void main(String[] args) {
		Mark m1=new Mark(1,"Srini", 98,99, 100);
		System.out.println(m1.toString());

	}

}
