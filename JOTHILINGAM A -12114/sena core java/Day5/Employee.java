package Day5;

import java.util.Scanner;

class emp{
	int eNo;
	String name;
	
	void getdata(int no,String nam) {
		eNo=no;
		name=nam;
		
	}
	void display() {
		System.out.println("no  : "+eNo);
		System.out.println("Name: "+name);
	}
	
}


public class Employee {
	public static void main(String args[]) {

		emp[] e = new emp[10];
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
    	
        e[i] = new emp();
        int n=s.nextInt();
        String fn=s.next();
        e[i].getdata(n, fn);
    }

    for (int i = 0; i < 3; i++) {
        e[i].display();
        
    }			
		}		
	
	}
	


