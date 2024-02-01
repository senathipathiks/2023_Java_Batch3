package com.javacoreday9collections;

import java.util.LinkedList;
import java.util.Scanner;

class Student{
    int id;
    String name;
    String city;
    public Student(int id, String name, String city) {
        
        this.id = id;
        this.name = name;
        this.city = city;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
    }
    
    
}
public class CollectionStudent {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
         int id=0;
         String name="  ";
         String city="  ";
         int choice;
         boolean flag=false;
         Scanner sc=new Scanner(System.in);
         LinkedList<Student> list=new  LinkedList<Student>();
         String msg=" ";
         
         do {
             System.out.println("1.Add Student   2.Find Student  3.Update Student  4.Delete Student 5.Find Student 6.Exit");
             choice =sc.nextInt();
             switch(choice) {
             case 1:
                 System.out.println("Enter Student id,Student Name and Student City ");
                 id=sc.nextInt();
                 name=sc.next();
                 city=sc.next();
                 Student st1=new Student(id,name,city);
                 list.add(st1);
                 System.out.println("Student details inserted sucessfully");
                 break;
             case 2:
                 System.out.println("Enter Student id to Find ");
                 id=sc.nextInt();
                 flag=false;
                 for (Student s : list) {
                    if(s.id==id) {
                        System.out.println(s.toString());
                        flag=true;
                        break;
                    }
                }
                 if(flag=false) {
                     System.out.println("Record not found");
                 }
                 break;
             case 3:
                 System.out.println("Enter Student id to update ");
                 id=sc.nextInt();
                 System.out.println("Enter Student name to update ");
                 name=sc.next();
                 System.out.println("Enter Student city to update ");
                 city=sc.next();
                 Student st2=new Student(id,name,city);
                 int index=0;
                 flag=false;
                 for (Student s : list) {
                     if(s.id==id) {
                         list.add(index,st2);
                         flag=true;
                         break;
                     }index++;
                 }
                  if(flag=false) {
                      System.out.println("Record not fou d");
                  }
                  break;
                 
                 
             case 4:
                 System.out.println("Enter Student id to delete ");
                 id=sc.nextInt();
                 int index1=0;
                 flag=false;
                 for (Student s : list) {
                     if(s.id==id) {
                         list.remove(index1);
                         flag=true;
                         break;
                     }index1++;
                 }
                  if(flag=false) {
                      System.out.println("Record not fou d");
                  }
                  break;
             case 5:
                 for (Student s : list) {
                System.out.println(s);    
                }
                 break;
             case 6:
                 System.exit(0);
                 
             }System.out.println("Do you want to continue (y/n)");
             msg=sc.next();
         }while(msg.equals("y"));
    }

}