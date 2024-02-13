package com.sms.bean;

public class Student {
	private int S_id;
	private String S_name;
	private String S_city;
	
	public Student() {
		
	}

	public Student(int s_id, String s_name, String s_city) {
		
		S_id = s_id;
		S_name = s_name;
		S_city = s_city;
	}

	public int getS_id() {
		return S_id;
	}

	public void setS_id(int s_id) {
		S_id = s_id;
	}

	public String getS_name() {
		return S_name;
	}

	public void setS_name(String s_name) {
		S_name = s_name;
	}

	public String getS_city() {
		return S_city;
	}

	public void setS_city(String s_city) {
		S_city = s_city;
	}

	public static void main(String[] args) {

	}

}
