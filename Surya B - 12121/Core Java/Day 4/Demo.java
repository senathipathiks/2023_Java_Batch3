package com.coreDay4;

public class Demo {
	
	int rollno;
	String name;
	
	Demo(){
		
	}
	
	Demo(int rollno, String name){
		this.rollno = rollno;
		
	}
	
	public String toString() {
		return "Student [rollno=" + rollno + ",name=" + name + "`]";
	}

	public static void main(String[] args) {
		
		Mark s = new Mark(005, "Surya", 70, 80, 90);
				System.out.println(s.toString());
	}

}

class Mark extends Demo {
	
	int mark1, mark2, mark3;
	
	Mark(){
		super();
	}
	
	Mark(int no, String n, int m1, int m2, int m3){
		super(no,n);
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
	}
	
	
	@Override
	public String toString() {
		return "Mark [mark1 =" + mark1 + ", mark2= " + mark2 + "mark3 =" + mark3 + ", toString()=" + 
				super.toString() + "]";
	}
}