package com.day4;
class StudentDetail {
	int rollno;
	String name;
	
	static int count;
	
	StudentDetail(){
		
	}
	
	StudentDetail(int rollno, String name){
		this.rollno = rollno;
		this.name = name;
		
	}
	
	StudentDetail(StudentDetail e){
		rollno = e.rollno;
		name = e.name;		
	}
	
	static int increment() {
		return count++;
	}
	
	@Override
	public String toString () {
		return "Student[Rollno: " +rollno+ " , Name: " +name+ "]";
	}
}


public class Static {

	public static void main(String[] args) {
        System.out.println(new StudentDetail().toString());
		System.out.println(StudentDetail.increment());
		
		StudentDetail obj = new StudentDetail(123, "Logesh");
		System.out.println(obj.toString());
		System.out.println(StudentDetail.increment());
		
		System.out.println(new StudentDetail(124,"Durgesh").toString());
		System.out.println(StudentDetail.increment());

		
		StudentDetail obj1 = new StudentDetail(obj);
		System.out.println(obj1.toString());
		System.out.println(StudentDetail.increment());
	}

}
