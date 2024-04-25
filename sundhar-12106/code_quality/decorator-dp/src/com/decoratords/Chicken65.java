package com.decoratords;

public class Chicken65 extends FoodCombo {

	Food food;

	public Chicken65() {

	}

	public Chicken65(Food food) {
		super();
		this.food = food;
	}

	@Override
	public double getPrice() {

		return 50.90+food.getPrice();
	}

	@Override
	public String description() {
		
		return food.description()+ "+ chicken65 ";
	}

}
