package com.decoratords;

public class GrillChicken extends FoodCombo{
	
	Food food;
	
	public GrillChicken() {
		
	}

	public GrillChicken(Food food) {
		super();
		this.food = food;
	}
	
	@Override
	public String description() {
		
		return food.description()+ "+ chicken grill ";
	}



	@Override
	public double getPrice() {
		return 150.89+food.getPrice();
	}

}
