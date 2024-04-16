package com.liskov;

//dependency injection
class Engine{
	Engine(String Type){
		System.out.println(Type);
	}
	
}
class Wheels{
	
	Wheels(String Type){
		System.out.println(Type);
	}
	
	
}
public class DependencyInversion {
	
	Engine e;
	Wheels w;
	
	//constructor based injection
	DependencyInversion(Engine e){
		this.e=e;
		
//		e=new Engine("fiat");
//		w=new Wheels("siat");
	}
    DependencyInversion(Wheels w) {
    	this.w=w;
    	
	}
	public static void main(String[] args) {
		Engine fiat=new Engine("Fiat Engine");
		Engine ciat=new Engine("ciat Engine");
		
		DependencyInversion d=new DependencyInversion(fiat);
		
		
	}

}
