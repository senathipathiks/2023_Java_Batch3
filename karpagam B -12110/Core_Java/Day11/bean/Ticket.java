package com.stu_db.bean;

public class Ticket {
	private int id;
	private String priority;
	private String location;
	private int mobNo;
	private String category;
	private int locationid;
	
	public Ticket() {
		super();
	}
	public Ticket(int id, String priority, String location, int mobNo, String category, int locationid) {
		this.id = id;
		this.priority = priority;
		this.location = location;
		this.mobNo = mobNo;
		this.category = category;
		this.locationid = locationid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getMobNo() {
		return mobNo;
	}
	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getLocationid() {
		return locationid;
	}
	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}
	public static void main(String[] args) {

	}

}
