package com.day6Java8;
record Alian(int id,String name) {
	public Alian(int id,String name) {
		if(id==0)
			throw new IllegalArgumentException("id cannot be zero");
		this.id=id;
		this.name=name;
	}
}
public class RecordClassEg {

	public static void main(String[] args) {
	Alian a = new Alian(1,"Sherin");
	System.out.println(a);

	}

}
