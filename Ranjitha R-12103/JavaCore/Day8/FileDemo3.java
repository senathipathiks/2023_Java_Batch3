package Day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class StaffEx implements Serializable {
	int no;
	String name;

	StaffEx(int n, String s) {
		no = n;
		name = s;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}

}

public class FileDemo3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileOutputStream f1 = new FileOutputStream("D:\\Sample1.txt");
		ObjectOutputStream obj1 = new ObjectOutputStream(f1);

		FileInputStream f2 = new FileInputStream("D:\\Sample1.txt");
		ObjectInputStream obj2 = new ObjectInputStream(f2);

		StaffEx stud1 = new StaffEx(121, "Arun");
		obj1.writeObject(stud1);
		System.out.println("Completed");

		StaffEx stud2 = (StaffEx) obj2.readObject();
		System.out.println(stud2.toString());
	}

}
