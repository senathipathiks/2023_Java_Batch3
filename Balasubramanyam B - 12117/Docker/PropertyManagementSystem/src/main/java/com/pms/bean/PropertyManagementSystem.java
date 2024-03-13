package com.pms.bean;

public class PropertyManagementSystem {
          private int id;
          private String name;
          private int ownedBuy;
      public  PropertyManagementSystem() {
    	  super();
      }
	public PropertyManagementSystem(int id, String name, int ownedBuy) {
		super();
		this.id = id;
		this.name = name;
		this.ownedBuy = ownedBuy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOwnedBuy() {
		return ownedBuy;
	}
	public void setOwnedBuy(int ownedBuy) {
		this.ownedBuy = ownedBuy;
	}
      
}
