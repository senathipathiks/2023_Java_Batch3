package com.hms.bean;

public class Staff {
	private int s_id;
	private String s_name;
	private String s_role;
	
	public Staff() {
		super();
		}

	public Staff(int s_id, String s_name, String s_role) {
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_role = s_role;
	}

	public int getSid() {
		return s_id;
	}

	public void setSid(int s_id) {
		this.s_id = s_id;
	}

	public String getSname() {
		return s_name;
	}

	public void setSname(String s_name) {
		this.s_name = s_name;
	}

	public String getSrole() {
		return s_role;
	}

	public void setSrole(String s_role) {
		this.s_role = s_role;
	}
	
	


}
