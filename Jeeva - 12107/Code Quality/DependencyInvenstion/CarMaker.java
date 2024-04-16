package DependencyInvenstion;

class Engine{
	
	Engine(String type){
		System.out.println(type);
	}
}
class Wheels{
	Wheels(String type){
		System.out.println(type);
	}
}
public class CarMaker {

	Engine e;
	Wheels w;
	
	CarMaker(Engine e){
		//this.e=e;
	}
	
	CarMaker(Wheels w){
		//this.w=w;
	}
	
	public static void main(String[] args) {
		
		Engine e=new Engine("Fiat Engine");	
		
		
		
	}
	
	
}
