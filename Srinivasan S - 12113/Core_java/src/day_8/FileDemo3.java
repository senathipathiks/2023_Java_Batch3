package day_8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout=new FileOutputStream("D:\\StudentObj.txt");
		ObjectOutputStream obj1=new ObjectOutputStream(fout);
		Student s1=new Student(101, "Sri");
		obj1.writeObject(s1);
		
		System.out.println("Completed");
		obj1.close();
	}

}
