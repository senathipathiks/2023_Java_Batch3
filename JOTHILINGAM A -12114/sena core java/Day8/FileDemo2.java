package Day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student implements Serializable{
	int no;
	String name;
	public student(int n,String s) {
		no=n;
		name=s;
		
	}
	@Override
	public String toString() {
		return "student [no=" + no + ", name=" + name + "]";
	}
	
}

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream fout=new FileOutputStream("C:\\Users\\jothilingam.a\\Desktop\\FileOperations\\jo.txt");
		
		ObjectOutputStream obj1=new ObjectOutputStream(fout);
		
		FileInputStream 
		student std=new student(121, "jothi");
		
		obj1.writeObject(std);
		
		System.out.println("Completed");
		

	}

}
