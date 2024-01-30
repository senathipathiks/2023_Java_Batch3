package Day_3;

class Students{
	int rollno;
	String Name;
	Students(int rollno, String Name){
		this.rollno=rollno;
		this.Name=Name;
	}
	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", Name=" + Name + "]";
	}
	
	
}

class Mark extends Students{
	
	int mark1,mark2,mark3;

	Mark(int  rollno, String Name, int m1,int m2,int m3) {
		
		super(rollno, Name);
		mark1=m1;
		mark2=m2;
		mark3=m3;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mark [mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + ", toString()=" + super.toString()
				+ "]";
	}

	
	
	
}

public class InheritanceEx1 {

	public static void main(String[] args) {
		
		Mark m = new Mark(006,"Heram",70,80,90);
		System.out.println(m.toString());
		
		// TODO Auto-generated method stub

	}

}
