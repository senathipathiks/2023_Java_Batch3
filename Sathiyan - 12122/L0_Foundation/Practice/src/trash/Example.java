package trash;

import java.util.Scanner;

public class Example {
	static Scanner sc=new Scanner(System.in);
	String name;
	int id;
	
	public Example() {
		//Load Instruction
	}

	public Example(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}

	public void setValue(String name,int id) {
		name=sc.next();
		id=sc.nextInt();
		this.id = id ;
		this.name = name;
	}

	
}

