package com.Day2;

class Instance{
      int x = 5;
	void incre() {
		x++;
	}
}



public class Variable {
     
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance i = new Instance();
		i.incre();
		System.out.println("X value Invoke :"+ i.x);
		
		Instance i1 = new Instance();
		
		System.out.println("X value Invoke :"+ i1.x);
		
		

	}

}
