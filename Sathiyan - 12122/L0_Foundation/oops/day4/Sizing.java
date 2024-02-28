package com.oops.day4;

import java.util.Scanner;

interface Resizable{
	void resizeWidth(int width);
	void resizeHeight(int height);
}

class Rectangle1 implements Resizable{
	
	Scanner sc=new Scanner(System.in);
	
	public void resizeWidth(int width) {
		System.out.println("By default size of the width is :"+width);
		System.out.println("Enter the alternate width size : ");
		width=sc.nextInt();
		System.out.println("Width of the Rectangle is Changed to "+width);
	}
	
	public void resizeHeight(int height) {
		System.out.println("By default size of the Height is :"+height);
		System.out.println("Enter the alternate Height size : ");
		height=sc.nextInt();
		System.out.println("Height of the rectangle is Changed to "+height);	
	}
	
}

public class Sizing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resizable rs=new Rectangle1();
		rs.resizeWidth(10);
		rs.resizeHeight(20);
		

	}

}
