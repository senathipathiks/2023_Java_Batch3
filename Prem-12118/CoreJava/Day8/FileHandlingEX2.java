package Day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	int no;
	String name;

	Student(int n, String s) {
		no = n;
		name = s;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + " Name=" + name + "]";
	}

}

public class FileHandlingEX2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fout = new FileOutputStream("D:\\StudentObject.txt");
		ObjectOutputStream fin = new ObjectOutputStream(fout);
		FileInputStream fout1 = new FileInputStream("D:\\StudentObject.txt");
		ObjectInputStream fin2 = new ObjectInputStream(fout1);
		Student S1 = new Student(121, "Prem");
		fin.writeObject(S1);
		System.out.println("Completed");

		Student S2 = (Student) fin2.readObject();
		System.out.println(S2.toString());

	}

}
