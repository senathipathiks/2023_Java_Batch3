package com.day2.threads;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.day4.Student;

class Mobile implements Serializable{
	int no;
	String name;
	
	Mobile(int n, String nam){
		no = n;
		name = nam;
	}
	public String toString() {
		return "Mobile [Name: " +name+ " ; Number: " +no+ "]";
	}
}

public class OuputStreamEx1 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream f = new FileOutputStream("D:\\File.txt");
		ObjectOutputStream o = new ObjectOutputStream(f);
		
		FileInputStream f1 = new FileInputStream("D:\\File.txt");
		ObjectInputStream o1 = new ObjectInputStream(f1);
		
		Mobile s = new Mobile(18, "Poco M3");
		o.writeObject(s);
		System.out.println("Completed");
		
		Mobile s1 = (Mobile)o1.readObject();
		System.out.println(s1.toString());
	}

}
