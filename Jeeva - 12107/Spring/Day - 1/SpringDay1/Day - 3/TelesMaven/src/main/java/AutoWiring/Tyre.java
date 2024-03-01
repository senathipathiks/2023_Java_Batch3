package AutoWiring;

import org.springframework.stereotype.Component;


public class Tyre {

	private String brand;

	Tyre(){}
	public Tyre(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre IS Working";
	}
	
	
}
