package day_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student1 implements Serializable{
	int id;
	String name;
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class FileDemo4 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("D:\\StudentObj.txt");
		ObjectOutputStream obj1=new ObjectOutputStream(fout);
		
		FileInputStream fin=new FileInputStream("D:\\StudentObj.txt");
		ObjectInputStream obj2=new ObjectInputStream(fin);
		
		Student1 s1=new Student1(102,"Vijay");
		obj1.writeObject(s1);
		System.out.println("Completed");
		
		Student1 s2=(Student1) obj2.readObject();//
		System.out.println(s2.toString());

	}

}
