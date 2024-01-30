package com.day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int no;
	String name;
	Student(int n,String s){
		no=n;
		name=s;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
	
}


public class IO4 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fout = new FileOutputStream("D:\\Studentobj.txt");
		ObjectOutputStream obj1 = new ObjectOutputStream(fout);
		
		FileInputStream fin = new FileInputStream("D:\\Studentobj.txt");
		ObjectInputStream obj2 = new ObjectInputStream(fin);
		
		Student std1 = new Student(1210, "Abishek");
		obj1.writeObject(std1);
		
		Student std2 = (Student) obj2.readObject(); //Return type of the obj2.readobject() is an "object" so here typecasting the Object into the references type. so It made equal to the student reference.
		System.out.println(std2.toString());
		
		System.out.println("completed");
		obj1.close();
		obj2.close();
	}

}
