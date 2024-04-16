package dip;

class Engine
{
	Engine(String type)
	{
		System.out.println(type);
	}
}
class Wheels
{
	Wheels(String type)
	{
		System.out.println(type);
	}
}
public class CarMaker {

	Engine e;
	Wheels w;
	
	CarMaker(Engine e)
	{
        this.e=e;
	}
	CarMaker(Wheels w)
	{
		this.w=w;
//		e=new Engine("Fiat");
//		w=new Wheels("Ceat");
	}
	public static void main(String[] args) {
		
		Engine fiat=new Engine("Fiat Engine");
		Engine porshe=new Engine("Porsche");
		CarMaker m=new CarMaker(fiat);
	}
	
}
