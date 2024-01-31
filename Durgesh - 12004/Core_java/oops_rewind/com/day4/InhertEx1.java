package com.day4;

class Stud {
	int rollno;
	String name;
	
	Stud(){	}
	
	Stud(int rollno, String name){
		this.rollno=rollno;
		this.name= name;
	}
	
	public String student() {
		return "Student[ Roll no: " +rollno+ " , Name: "+name+ "]";
	}
}
	
	class Mark extends Stud{
		int mark1, mark2, mark3;
		
		Mark(){
			super();
		}
		
		Mark(int rollno, String name, int m1, int m2, int m3){
			super(rollno,name);
			mark1 = m1;
			mark2 = m2;
			mark3 = m3;
		}
		
		public String student() {
			return "Mark [mark1 " +mark1+ " mark2 " +mark2+ " mark3 " +mark3+ "]";
		}
		
	}


public class InhertEx1 {

	public static void main(String[] args) {
		Mark obj = new Mark(1801065, "Durgesh", 70, 89, 95);
		System.out.println(obj.student());

	}

}
