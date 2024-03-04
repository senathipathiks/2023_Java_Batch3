package com.oops2;

public class ClassMain {
	int a,b,c;
	{
		a = 10;
		System.out.println(a);
	}
 ClassMain(){
	b = 20;
	System.out.println(b);
}

ClassMain(int c){
	this.c = c;
	System.out.println(c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassMain obj1 = new ClassMain();
	}

}
//no output will be displayed as nothing is printed until system print statement is used.