package com.decoratords;

//implementing class for the food type fried rice
public class FriedRice implements Food {

	Food food;

	public FriedRice() {

	}

	public FriedRice(Food food) {
		super();
		this.food = food;
	}

	@Override
	public double getPrice() {

		return 129.89;
	}

	@Override
	public String description() {
		
		return "fried Rice ";
	}

}
