package com.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import com.Day3.ArraySort;

class student implements Serializable{ // process of convert obj to byte stream
	int no;
	String name;
	public student(int no, String name) {
	
		this.no = no;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "student [no=" + no + ", name=" + name + "]";
	}
	
	
	
}




public class InputStreamEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
		
		FileOutputStream fout = new FileOutputStream("d://Demo1.txt");
		
		ObjectOutputStream Obj = new ObjectOutputStream(fout);
		
		student stud1 = new student(121,"Prashanth");
		
		 Obj.writeObject(stud1);
		 
		   System.out.println(stud1);
		 
		 
		 
		 
		 
		 
		
		 
		 

			FileInputStream fin = new FileInputStream("d://Demo1.txt");
			
			ObjectInputStream Obj2 = new ObjectInputStream(fin);
			
			student stud2 = (student) Obj2.readObject();
			
		      System.out.println(stud2);
			
//			Scanner sc = new Scanner(fin);
//			 
//			 while(sc.hasNext()) {
//				 System.out.println(sc.next()+"");
//			 }
			
		
		
		System.out.println("Completed");

	}

}
