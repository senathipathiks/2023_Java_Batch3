package com.coreday3;

 class ClassExample1 {
	
	int rollno;
	String name;
	
	ClassExample1(){
		
	}
	
	ClassExample1(int no,String n){
		rollno=no;
		name=n;
		
	}

	public ClassExample1(ClassExample1 obj) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ClassExample1 [rollno=" + rollno + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		ClassExample1 obj=new ClassExample1(123,"jeeva");
		System.out.println(obj.toString());
		System.out.println(new ClassExample1(1234,"deva").toString());
		
		ClassExample1 obj1=new ClassExample1(obj);
		System.out.println(obj1.toString());
		
	}
	

}
 

