package com.day11;

interface BuildingPlan{
	void structure();	
}

interface InteriorDesign{
	void wallPainting();
}

class Flat implements BuildingPlan,InteriorDesign{
	
	public void structure() {
		System.out.println("Basement , Pillars and Roof were biult");
		
	}
	
	public void wallPainting() {
		System.out.println("Walls are painted with Dark themes");
	}
}

public class InterfaceSample2 {

	public static void main(String[] args) {
		Flat san = new Flat();
		san.structure();
		san.wallPainting();

	}

}
