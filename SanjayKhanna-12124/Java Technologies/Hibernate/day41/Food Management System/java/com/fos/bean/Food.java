package com.fos.bean;

import javax.persistence.*;

@Entity
@Table
public class Food {
	
	@Id
	private int foodId;
	private String foodName;
	private Float price;
	public Food() {
		
	}
	public Food(int foodId, String foodName, Float price) {
		this.foodId = foodId;
		this.foodName = foodName;
		this.price = price;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}
