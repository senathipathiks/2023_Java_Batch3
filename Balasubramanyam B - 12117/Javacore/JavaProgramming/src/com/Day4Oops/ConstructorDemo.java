package com.Day4Oops;
class StudentXx{
	int rollno;
	String name;
	StudentXx(){
		
	}
    StudentXx(int r,String n){
		rollno=r;
		name=n;
	}
    StudentXx(StudentXx obj){
    	rollno=obj.rollno;
    	name=obj.name;
    }
	@Override
	public String toString() {
		return "StudentXx [rollno=" + rollno + ", name=" + name + "]";
	}
    
}
public class ConstructorDemo {

	public static void main(String[] args) {
		StudentXx obj = new StudentXx(123,"Balu");
		System.out.println(obj.toString());
		System.out.println(new StudentXx(143,"lokesh").toString());
		StudentXx x1 = new StudentXx(obj);
        System.out.println(x1.toString());
	}

}
