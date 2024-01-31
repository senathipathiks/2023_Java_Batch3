package com.java8;

interface Book{
	HarryPotter bookTitle(String bt);
}

class HarryPotter {
	public HarryPotter(String bt ) {
		System.out.println(bt);
	}
}
public class MethodReferenceConst {

	public static void main(String[] args) {
		 
		Book b1 = HarryPotter::new;
		b1.bookTitle("The Philoshoper stone");
	}

}
