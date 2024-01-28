package com.dayy4;
class student33{
	int rollno;
	String name;
	student33(){
		
	}
	
	public student33(int rollno, String name) {
		
		this.rollno = rollno;
		this.name = name;
	}
	
	public String toString() {
		return "Student [rollno"+rollno+",name=" + name +"]";
	}
}
class Marks extends student33{
	int mark1,mark2,mark3;
	Marks(){
		super();
	}
	public Marks(int no,String n, int m1,int m2,int m3)
	{
		super(no,n);
		mark1=m1;
		mark2=m2;
		mark3=m3;
	}
	

@Override
	public String toString() {
		return "Mark [mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + ", toString()=" + super.toString()
				+ "]";
	}


public class StudentInheritence {

	public static void main(String[] args) {
		Marks obj=new Marks(12,"dhanu",100,65,74);
		System.out.println(obj.toString());
	}

	}

}
