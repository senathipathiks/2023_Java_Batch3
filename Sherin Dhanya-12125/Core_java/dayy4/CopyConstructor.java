package com.dayy4;
class Stud{
	int rollno;
	String name;
	Stud(){
		
	}
	
	public Stud(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	 public Stud(Stud e){
		rollno=e.rollno;
		name=e.name;
	}
	
	public String toString() {
		return "Student [rollno"+rollno+",name=" + name +"]";
	}
}
public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud obj=new Stud(123,"Sherin");//parameterized constructor
		System.out.println(obj.toString());
		
		System.out.println(new Stud().toString());//default constructor
		
		Stud obj1=new Stud(obj);//copy constructor
		System.out.println(obj1.toString());
	}

}
