package com.day28;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Student implements Serializable{
	
	int rollNo;
	String name;
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	
	
	
	
}

public class FileExample5 {

	public static void main(String[] args)throws IOException, ClassNotFoundException {
		
		FileOutputStream file = new FileOutputStream("D:\\StudentObj.txt");
		ObjectOutputStream obj = new ObjectOutputStream(file);
		
		Student s1 = new Student(111, "Sanjaykhanna");
		try {
			obj.writeObject(s1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Process Completed");
		
		FileInputStream fileIn = new FileInputStream("D:\\StudentObj.txt");
		ObjectInputStream objIn = new ObjectInputStream(fileIn);
		
		Student s2 = (Student)objIn.readObject();
		System.out.println(s2.toString());
		
		obj.close();
		file.close();
		objIn.close();
		fileIn.close();
	}

}
