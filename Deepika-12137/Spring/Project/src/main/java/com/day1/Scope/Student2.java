package com.day1.Scope;

import java.util.List;

public class Student2 {

	   
		private int id;
		private String name;
		private List<String> address;
		public Student2() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student2(int id, String name, List<String> address) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
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
		public List<String> getAddress() {
			return address;
		}
		public void setAddress(List<String> address) {
			this.address = address;
		}
	
		void display() {
			System.out.println("ID:"+id);
			System.out.println("Name"+name);
			System.out.println("Address :");
			for (String add:address) {
				System.out.println(add);
			}
		}
		
		
		
	}


