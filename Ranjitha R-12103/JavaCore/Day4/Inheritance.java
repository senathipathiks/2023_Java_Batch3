package Day4;

class Vehicles {
	int no;
	String name;
	int price;

	Vehicles() {
	}

	Vehicles(int no, String name, int price) {
		this.no = no;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [no=" + no + ", name=" + name + ", price=" + price + "]";
	}

}

class twowheelers extends Vehicles {
//	int no;
//	String name;
//	int price;

	twowheelers() {
		super();
	}

	twowheelers(int no, String name, int price) {
		super(no, name, price);
		this.no = no;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "twowheeler [no=" + no + ", name=" + name + ", price=" + price + "]";
	}

}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicles obj1 = new twowheelers();
		System.out.println(obj1.toString());

		twowheelers obj2 = new twowheelers(234, "Honda", 17000);
		System.out.println(obj2.toString());
	}

}
