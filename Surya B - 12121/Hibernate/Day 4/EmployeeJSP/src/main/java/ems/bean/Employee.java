package ems.bean;

public class Employee {

	private int eid;
	private String name;
	private String role;
	private String city;
	public Employee(int eid, String name, String role, String city) {
		super();
		this.eid = eid;
		this.name = name;
		this.role = role;
		this.city = city;
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
