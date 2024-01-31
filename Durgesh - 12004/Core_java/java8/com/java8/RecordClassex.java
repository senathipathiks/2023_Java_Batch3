package com.java8;

import java.util.Objects;

class Record {
	private int id;
	private String name;
	
	public Record(int id , String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "Record [id=" +id+ " , name: "+name+ "]";
	}
	
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Record other = (Record) obj;
        return id == other.id && Objects.equals(name, other.name);
    }

}

public class RecordClassex {

	public static void main(String[] args) {
		Record r1 = new Record(12090, "Kiran");
		Record r2 =  new Record(13055, "Inba");
		
		System.out.println(r1.equals(r2));
	}

}
