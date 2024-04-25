package com.decoratords;

//this class is going to act as a decorator class
public abstract  class FoodCombo implements Food {

	Food food;

	FoodCombo() {

	}

	FoodCombo(Food food) {
		super();
		this.food = food;
	}

}
