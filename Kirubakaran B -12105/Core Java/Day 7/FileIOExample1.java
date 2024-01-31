package day4multithreading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int no;
	String name;
	public Student(int no, String name) {
	
		this.no = no;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
	
}
public class FileIOExample1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
	              FileOutputStream fout=new FileOutputStream("\\Kiruba\\Professinal and Behaviour\\Email Etiqute\\Studentobj.txt");	
                  ObjectOutputStream obj1=new ObjectOutputStream(fout);
                  
                  FileInputStream fin =new FileInputStream("\\Kiruba\\Professinal and Behaviour\\Email Etiqute\\Studentobj.txt");
                  ObjectInputStream obj2=new ObjectInputStream(fin);
                  
                  Student stu=new Student(101,"kiruba");
                  obj1.writeObject(stu);
                  
                  System.out.println("completed");
                  Student stu2=(Student)obj2.readObject();
                  System.out.println(stu2.toString());
	}

}
