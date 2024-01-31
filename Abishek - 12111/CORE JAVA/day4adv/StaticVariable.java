package com.day4adv;

class StudentsEx1
{
	int rollno;
	String name;
	//static int count;
	int count =0;
	StudentsEx1(int no)
	
	{
		rollno =no;
	}
	StudentsEx1 (int rollno, String name)
	{
		//this.rollno = rollno;
		this(rollno); //constructor which is accepting one arg
		this.name = name;
	}
	StudentsEx1(StudentsEx1 e)
	{
		rollno=e.rollno;
		name=e.name;
	}
	void classDisplay()
	{
		System.out.println("Student Class");
	}
	int increment()
	{
		return ++count;
	}
	@Override
	public String toString() {
		
		this.classDisplay();
		return "StudentsEx1 [rollno=" + rollno + ", name=" + name + "]";
	}
	
}
public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentsEx1 obj = new StudentsEx1(123, "Abishek"); //parameterized constructor
		System.out.println(obj.toString());
		System.out.println(obj.increment());
		//System.out.println(StudentsEx1.increment());
		System.out.println(new StudentsEx1(124, "Emperor").toString());//default
		
		StudentsEx1 obj1 = new StudentsEx1(obj); //copy constructor
		
		
		System.out.println(obj1.toString());
	}

}

