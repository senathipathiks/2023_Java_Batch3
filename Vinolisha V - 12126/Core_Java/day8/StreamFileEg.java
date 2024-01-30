package com.day8;

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
		no=n;
		name=s;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
	
}



public class StreamFileEg {

	public static void main(String[] args)throws IOException,ClassNotFoundException {
		FileOutputStream fout=new FileOutputStream("D:\\StudentObj.txt"); //creating instance for writing the file output stream
		ObjectOutputStream obj1=new ObjectOutputStream(fout);//stores as an object so objectoutputstream
		
		FileInputStream fin=new FileInputStream("D:\\StudentObj.txt");//to read that object file and display that in console we use fileinputstream and then objectopstream
		ObjectInputStream obj2=new ObjectInputStream(fin);
		
		
		
		Student std=new Student(122,"Vino");//create instance for objectopstream
		obj1.writeObject(std);//call that object
		
		Student std1=(Student)obj2.readObject(); //to read the object file
		System.out.println(std);
		
		System.out.println("Completed");
		

	}

}
