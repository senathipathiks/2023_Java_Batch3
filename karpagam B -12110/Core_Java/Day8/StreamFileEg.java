package Com.Day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{ //to convert object stream to byte stream,we use serializable--without this there will be an error
	 int no;
	 String name;
	 
	 Student(int n,String s)
	 {
		 no=n;
		 name=s;
	 }

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
	 
 }
public class StreamFileEg {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		
		FileOutputStream fout=new FileOutputStream("D:\\demo\\StuentObj.txt"); //creating instance for writing the file op strean
		ObjectOutputStream obj1=new ObjectOutputStream(fout); // stores as an object so objectopstream
		
		FileInputStream fin=new FileInputStream("D:\\demo\\StuentObj.txt");// to read that object file and display that in console we use fileinputstream and then objectopstream
		ObjectInputStream obj2=new ObjectInputStream(fin);
		
		Student stu1=new Student(123, "kaviya"); // create instance for objectopstream
		obj1.writeObject(stu1); //call that object 
		
		Student stu2=(Student)obj2.readObject();// to read the object file 
		System.out.println(stu2.toString());
		
		System.out.println("Completed..");
		
		}
	}
