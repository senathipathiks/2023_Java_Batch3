package com.coreday7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{

	int no;
	String name;

	Student(int n, String s) {
		no = n;
		name = s;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}

}

public class FileExamples2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fout = new FileOutputStream("D:\\StudentObj.txt");
		ObjectOutputStream obj1 = new ObjectOutputStream(fout);
		
		FileInputStream fin =new FileInputStream("D:\\StudentObj.txt");
		ObjectInputStream obj2 = new ObjectInputStream(fin);
		
		
		Student stu = new Student(1, "vicky");
		obj1.writeObject(stu);
		
		Student stu1 = (Student)obj2.readObject();
		System.out.println(stu1.toString());
	}
}
