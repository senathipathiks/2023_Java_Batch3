package com.decoratords;

public class FoodDriver {
	
	public static void main(String[] args) {
		
		//without combo
//		Food food = new Biriyani();
		
//		System.out.println(food.description());
//		System.out.println(food.getPrice());
		
		
		
		
		
		
		
		
		
		
		
		//with combo 65 combo
//		FoodCombo combo1 = new Chicken65(new Biriyani());
//		
//		System.out.println("price  : "+ combo1.getPrice());
//		System.out.println("description  : "+ combo1.description());
//		
//		
//		//with chicken65 and Grill Chicken Combo
		
		Food food =  new FriedRice();
		FoodCombo combo = new GrillChicken(new Chicken65(food));
		System.out.println("desc : "+combo.description());
		System.out.println("price : "+Math.round(combo.getPrice()));
		
//		System.out.println(Math.round(combo.getPrice()));
		
	}

}
