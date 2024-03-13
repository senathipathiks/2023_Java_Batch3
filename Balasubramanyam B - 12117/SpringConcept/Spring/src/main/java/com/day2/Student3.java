package com.day2;

import java.util.List;

public class Student3 {
         private int id;
         private String name;
         private List<Address> address;
         
		public Student3() {
			super();
		}

		public Student3(int id, String name, List<Address> address) {
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

		public List<Address> getAddress() {
			return address;
		}

		public void setAddress(List<Address> address) {
			this.address = address;
		};
		void display(){
			System.out.println("Id :"+id);
			System.out.println("Name :"+name);
			System.out.println("Address: ");
			System.out.println();
			for(Address add:address) {
				System.out.println(add);
			}
			
		}
		
        

		
         
}
