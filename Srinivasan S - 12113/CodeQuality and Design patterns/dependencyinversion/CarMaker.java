package com.code.dependencyinversion;

class Engine {
	public Engine(String type) {
		System.out.println(type);
	}
}

class Wheels {
	Wheels(String type) {
		System.out.println(type);

	}
}

public class CarMaker {
	
	Engine e;
	Wheels w;
	
	CarMaker(Engine e){
		
		// this leads to tight couple 
//		e=new Engine("Fiat");
//		w=new Wheels("MRF");
		
		
		this.e=e;
	}
	
	 CarMaker(Wheels w) {
		 this.w=w;
	}

	 
	 public static void main(String[] args) {
		Engine fiat=new Engine("Fiat engine");
		Wheels mrf=new Wheels("MRF tyres");
		
		CarMaker car=new CarMaker(fiat);
		CarMaker wheel=new CarMaker(mrf);
	}
}
