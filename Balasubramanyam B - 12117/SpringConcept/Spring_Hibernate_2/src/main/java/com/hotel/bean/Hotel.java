package com.hotel.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Hotel {
	@Id
     private int id;
     private String roomType;
     private int price;
	public Hotel() {
		super();
	}
	public Hotel(int id, String roomType, int price) {
		super();
		this.id = id;
		this.roomType = roomType;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Hotel => Id: " + id + ", Room Type: " + roomType + ", Price: " + price;
	}
	
	
     
}
