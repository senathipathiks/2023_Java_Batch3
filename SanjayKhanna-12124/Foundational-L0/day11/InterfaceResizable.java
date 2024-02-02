package com.day11;

interface Resizalbe {										//Interface Declaration
	int resizeWidth(int width);
	int resizeHeight(int height);
}

class Rectangles implements Resizalbe{						//Interface implementation
	public int resizeWidth(int width) {
		return width+10;
	}
	public int resizeHeight(int height) {
		return height+10;
	}
}

public class InterfaceResizable {						

	public static void main(String[] args) {
		Resizalbe rect = new Rectangles();					//DMD Dynamic method dispatch
		System.out.println("Width of Rectangle : "+7+"cm");
		System.out.println("After Resize : "+rect.resizeWidth(7)+"cm");
		System.out.println("lenght of Rectangle : "+12+"cm");
		System.out.println("After Resize : "+rect.resizeHeight(12)+"cm");

	}

}
