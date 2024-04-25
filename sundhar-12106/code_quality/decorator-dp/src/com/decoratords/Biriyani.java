package com.decoratords;

//implementing class for the food type biriyani
public class Biriyani implements Food {

	Food food;

	public Biriyani() {

	}

	public Biriyani(Food food) {
		super();
		this.food = food;
	}

	@Override
	public double getPrice() {

		return 199.90;
	}

	@Override
	public String description() {
		
		return "Biriyani ";
	}

}
