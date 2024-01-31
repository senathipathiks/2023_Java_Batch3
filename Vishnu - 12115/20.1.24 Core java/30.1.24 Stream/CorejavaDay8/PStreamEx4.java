package CorejavaDay8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int no;
	String names;
	Employee(int id,String name){
		no=id;
		names=name;
	}
	@Override
	public String toString() {
		return "Employee [no=" + no + ", names=" + names + "]";
	}
}

public class PStreamEx4 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		FileOutputStream fout1=new FileOutputStream("D:\\Classnotes\\20.1.24 Core java\\30.1.24 Stream\\Employee");
		ObjectOutputStream obj3=new ObjectOutputStream(fout1);
		FileInputStream fin1=new FileInputStream("D:\\Classnotes\\20.1.24 Core java\\30.1.24 Stream\\Employee");
		ObjectInputStream obj4= new ObjectInputStream(fin1);
		
		Employee aar=new Employee(02,"Aravind");
		obj3.writeObject(aar);
		System.out.println("Completed");
		
		Employee stud2=(Employee)obj4.readObject();
		System.out.println(stud2.toString());
	}

}
