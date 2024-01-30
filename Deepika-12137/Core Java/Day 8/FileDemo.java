package com.day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student1 implements Serializable{
	int no;
	String name;
	Student1(int n,String s){
		no=n;
		name=s;
		
	}
	public String toString() {
		return "Student [no=" +no +" , name=" + name+"]";
	}
}
public class FileDemo {
public static void main(String[] args) throws IOException,ClassNotFoundException {
	FileOutputStream fout=new FileOutputStream("D:\\Demo1.txt");
	ObjectOutputStream obj1=new ObjectOutputStream(fout);
	
	FileInputStream fin=new FileInputStream("D:\\Demo1.txt");
	ObjectInputStream obj2=new ObjectInputStream(fin);
	
	Student1 stud1=new Student1(12,"Deeps");
	obj1.writeObject(stud1);
	System.out.println("completed");
	
	Student1 stud2=(Student1)obj2.readObject();
	System.out.println(stud2.toString());

}
}
