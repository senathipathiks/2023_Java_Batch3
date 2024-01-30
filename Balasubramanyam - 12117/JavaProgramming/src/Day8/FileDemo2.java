package com.Day8;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
class Student implements Serializable{
	int no;
	String name;
	public Student(int n,String s) {
		name=s;
		no=n;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
}
public class FileDemo2 {
	public static void main(String[] args) throws IOException,ClassNotFoundException {
     FileOutputStream fout =new FileOutputStream("D:\\Student.txt");
     ObjectOutputStream obj1=new ObjectOutputStream(fout);
     FileInputStream fin =new FileInputStream("D:\\Student.txt");
     ObjectInputStream obj2=new ObjectInputStream(fin);
     Student std1 = new Student(121,"balu");
     obj1.writeObject(std1);
     
     Student std2 = (Student)obj2.readObject();
     System.out.println(std2.toString());
     System.out.println("completed");
     obj1.close();
     obj2.close();
	}

}
