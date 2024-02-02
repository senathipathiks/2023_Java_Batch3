package com.day5adv;

import java.util.Scanner;

class Employee{
    int EId;
    String Name;
    void getdata(int no, String name) {
        EId=no;
        Name=name;
    }
    
    void display() {
        System.out.println("No :"+EId);
        System.out.println("Name :"+ Name);
    }
}
public class ClassEx {

    public static void main(String[] args) {
        
        Employee[] e = new Employee[10];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; i++)
        {
            e[i] = new Employee();
            int n=s.nextInt();
            String fn=s.next();
            e[i].getdata(n, fn);
        }

        for (int i = 0; i < 3; i++) {
            e[i].display();
            
        }
    }

}