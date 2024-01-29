package com.java17;


record Alian(int id , String name) {
	
	
	public Alian(int id,String name) {
		
		
		if(id==0)
			
			throw new IllegalArgumentException("id connot be zero");
		
		this.id=id;
		this.name=name;
		
	}
	
	
	
	
	
}



public class AutoRecordClass {

	public static void main(String[] args) {
		
            Alian a = new Alian(1,"Prashanth");
            
            Alian a1 = new Alian(0,"Prashanth");
            
            System.out.println(a);
	}

}
