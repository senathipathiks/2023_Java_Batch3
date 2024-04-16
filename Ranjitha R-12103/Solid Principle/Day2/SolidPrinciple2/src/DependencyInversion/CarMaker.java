package DependencyInversion;

class Engine {

	Engine(String type) {
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

	CarMaker(Engine e) {
		this.e = e;
	}

	CarMaker(Wheels w) {
		this.w = w;
//		e = new Engine("Flat");
//		w = new Wheels("Ceat");
	}

	public static void main(String[] args) {

		Engine fiat = new Engine("fiat engine");
		Engine parse = new Engine("parse engine");
		CarMaker m = new CarMaker(fiat);
	}
}
