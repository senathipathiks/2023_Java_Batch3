package com.coreDay7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileDemo  {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileOutputStream fo = new FileOutputStream("D:\\FileHandling\\Student.txt");
		ObjectOutputStream o = new ObjectOutputStream(fo);
		
		FileInputStream fin = new FileInputStream("D:\\FileHandling\\Student.txt");
		ObjectInputStream o2 = new ObjectInputStream(fin);
		
		Student stu = new Student(111, "Jeeva");
		o.writeObject(stu);
		
		Student stu2 = (Student) o2.readObject();
		System.out.println(stu2.toString());
	}

}

class Student implements Serializable
{
	int no;
	String name;
	
	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	@Override
	public String toString() {
		return "student [no=" + no + ", name=" + name + "]";
	}
	
	
}