package com.day2;

import java.util.*;
import java.util.Map.Entry;

public class Student4 {
         private int id;
         private String name;
         private Map<String,String> address;
		public Student4() {
			super();
		}
		public Student4(int id, String name, Map<String,String> address) {
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
		public Map<String, String> getAddress() {
			return address;
		}
		public void setAddress(Map<String, String>  address) {
			this.address = address;
		}
          
		void display() {
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Address :");
		Set<Entry<String, String>> set=address.entrySet();
		Iterator<Entry<String, String>> itr=set.iterator();
		    while(itr.hasNext()){  
		        Entry<String,String> entry=itr.next();  
		        System.out.println(entry.getKey()+" :"+entry.getValue());  
		    }  
        

		
		 }
}
