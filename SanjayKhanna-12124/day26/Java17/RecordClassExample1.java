package com.day26.Java17;

import java.util.Objects;


class Container{
	
	int id;
	String name;
	
	public Container(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id,name);
	}

	@Override
	public boolean equals(Object obj) {

		if(this==obj)
			return true;
		if(obj==null)
			return false;
		Container check = (Container)obj;
		return id == check.id && name == check.name;
	}

	@Override
	public String toString() {
		
		return "Record:[Id : "+id+" Name : "+name+"]";
	}
	
}

public class RecordClassExample1 {

	public static void main(String[] args) {
		
		Container obj1 = new Container(123, "Sanjay Khanna");
		
		Container obj2 = new Container(123, "Sanjay Khanna");
		
		System.out.println("Overriding HashCode Function : "+obj1.hashCode());
		
		System.out.println("Overriding toString() : "+obj2.toString());
		
		System.out.println("Overriding Equals : "+obj1.equals(obj2));

	}

}
