package com.day5;

import java.util.Scanner;

//Arrays of Objects

class Arr{
	int empno;
	String name;
	void getdata(int no,String nam){
		empno=no;
		name=nam;
	}
	void display() {
		System.out.println("No: "+empno);
		System.out.println("Name: "+name);
			}
}

public class Abstr {

	public static void main(String[] args) {
		Arr [] emp = new Arr[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			emp[i]= new Arr();
			int n=sc.nextInt();
			String fn = sc.next();
			emp[i].getdata(n, fn);
		}
        for(int i=0;i<3;i++) {
        	emp[i].display();
        }
	}

}
