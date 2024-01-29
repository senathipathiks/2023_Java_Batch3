package com.java17;

import java.util.Objects;

class Record{
	
	private int id;
	private String name;
	
	
	// Constructor for initialize the data members
	public Record(int id, String name) {
		this.id = id;
		this.name = name;
	}

    
	// to string method for using print the object
//	@Override
//	public String toString() {
//		return "Record [id=" + id + ", name=" + name + "]";
//	}


	
	// for equalling the two object values
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, name);
//	}


//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Record other = (Record) obj;
//		return id == other.id && name == other.name;
//	}
	
	
	
	
	
	
	
	
	
}





public class ManualRecordClass {

	public static void main(String[] args) {
		

		Record r = new Record(1,"Prashanth");
		
		Record r1 = new Record(1,"Prashanth");
		
		System.out.println(r1);
		
		System.out.println(r.equals(r1));
		
		//System.out.println(r.equals(r1));
		
		
		
		
	}

}
