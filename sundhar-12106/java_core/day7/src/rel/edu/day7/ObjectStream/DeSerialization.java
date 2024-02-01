package rel.edu.day7.ObjectStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialization {
	
	public static void main(String[] args) throws Exception {
		
		ObjectInputStream fin = new ObjectInputStream(new FileInputStream("D:\\StudentObject.txt"));
		
		Student s = (Student)fin.readObject();
		
		System.out.println(s);
	}

}
