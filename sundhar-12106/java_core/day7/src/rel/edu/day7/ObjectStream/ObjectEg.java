package rel.edu.day7.ObjectStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{

	int no;
	String name;

	public Student() {

	}

	Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}

	

}

public class ObjectEg  {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("D:\\StudentObject.txt");
		ObjectOutputStream f1 = new ObjectOutputStream(fout);
		
		f1.writeObject(new Student(101,"Sundhar Raj"));
		f1.close();
		fout.close();
		System.out.println("completed");
	}

}
