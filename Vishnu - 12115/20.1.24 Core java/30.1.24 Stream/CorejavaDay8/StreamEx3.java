package CorejavaDay8;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;

class Student1 implements Serializable{
	int no; 
	String name;
	Student1(int n, String s){
		no=n;
		name=s;
	}
	@Override
	public String toString() {
		return"Student[no="+no+",name"+name+"]";
	}
}


public class StreamEx3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		
		FileOutputStream fout=new FileOutputStream("D:\\Classnotes\\20.1.24 Core java\\30.1.24 Stream\\Student.txt");
		ObjectOutputStream obj1=new ObjectOutputStream(fout);
		
		FileInputStream fin=new FileInputStream("D:\\Classnotes\\20.1.24 Core java\\30.1.24 Stream\\Student.txt");
		ObjectInputStream obj2=new ObjectInputStream(fin);
		
		Student1 stud1=new Student1(121,"Arun");
		obj1.writeObject(stud1);
		System.out.println("Completed");
		
		Student1 stud2=(Student1)obj2.readObject();
		System.out.println(stud2.toString());
		
	}
		
	}


