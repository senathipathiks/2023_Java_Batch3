package com.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	int no;
	String name;
	Student(int n, String s)
	{
		no=n;
		name=s;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
	
	}

public class StreamEg3 {

	public static void main(String[] args)  throws IOException{
	FileOutputStream fout=new FileOutputStream("D:\\sample\\StudentObj.txt");
	ObjectOutputStream obj1=new ObjectOutputStream(fout);
	
	FileInputStream fin=new FileInputStream("D:\\sample\\StudentObj.txt");
	ObjectInputStream obj2=new ObjectInputStream(fin);
	
	Student stud11 =new Student(121,"Sherin");
	obj1.writeObject(stud11);
	System.out.println("Completed");
	
	Student stud12 =new Student(122,"Dhanya");
	System.out.println(stud12.toString());

	}

}
