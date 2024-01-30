package Java_Day_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
    int no;
    String name;
    Student(int n ,String s)
    {
        no=n;
        name=s;
    }
    @Override
    public String toString() {
        return "Student [no=" + no + ", name=" + name + "]";
    }
    
}
public class FileDemo2 {

    public static void main(String[] args)throws Exception {
        // TODO Auto-generated method stub
    FileOutputStream fout=new FileOutputStream("D:\\Demo.txt");
    ObjectOutputStream obj1=new ObjectOutputStream(fout);
    
    FileInputStream fin=new FileInputStream("D:\\Demo.txt");
    ObjectInputStream obj2=new ObjectInputStream(fin);
    
    Student stud1=new Student(121,"Arun");
    obj1.writeObject(stud1);
    System.out.println("Completed");
    
    Student stud2=(Student)obj2.readObject();
    System.out.println(stud2.toString());
    }

}