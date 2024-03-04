package com.javacoreday8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Student implements Serializable{
	int no;
	String name;
	Student(int n,String s){
		no =n;
		name =s;
		
	}
	@Override
	public String toString() {
		return "Student[no=" +no+",name=" +name+ "]";
		
	}
}

public class FileDemo {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("D:\\studobj.txt");
		ObjectOutputStream obj1 = new ObjectOutputStream(fout);
		
		FileInputStream fin = new FileInputStream("D:\\studobj.txt");
		ObjectInputStream obj2 = new ObjectInputStream(fin);
		
		Student stud1 = new Student(121,"Arun");
		obj1.writeObject(stud1);
		System.out.println("Completed");
		Student stud2 = null;
		try {
			stud2 = (Student)obj2.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(stud2.toString());
		
	}

}
