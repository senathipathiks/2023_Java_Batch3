package com.day11;

abstract class Building{
	void structure() {
		System.out.println("Basement,pillars & roof are built successfully");
	}
	abstract void wallPainting();
}

class House extends Building{
	void wallPainting() {
		System.out.println("Wall are built then painting process completed");
	}
}
public class AbstractClassSample1 {

	public static void main(String[] args) {
	Building house = new House();
	house.structure();
	house.wallPainting();

	}

}
