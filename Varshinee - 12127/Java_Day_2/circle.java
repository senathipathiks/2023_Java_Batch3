package Java_Day_2;

import java.util.Scanner;

public class circle {
	Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
	void area() {
		System.out.println("Area of the Circle:" +(3.14*a));
		
	}
	void perimeter() {
		System.out.println("Perimeter of the Circle: "+ (2*3.14*a));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle obj=new circle();
		obj.area();
		obj.perimeter();
	}

}
