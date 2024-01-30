package Day_6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int no;
	String Name;
	public Student(int n, String s) {
		no=n;
		Name=s;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", Name=" + Name + "]";
	}
	
	
}
public class FileDemo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileOutputStream fout = new FileOutputStream("D:\\Day2.txt");
		ObjectOutputStream obj1 = new ObjectOutputStream(fout);
		
		FileInputStream fin = new FileInputStream("D:\\Day2.txt");
		ObjectInputStream obj2 = new ObjectInputStream(fin);
		
		Student stu = new Student(8, "Heram");
		obj1.writeObject(stu);
		
		System.out.println("Completed ..!");

		Student stu2 =  (Student)obj2.readObject();
		System.out.println(stu2.toString());
	}

}
