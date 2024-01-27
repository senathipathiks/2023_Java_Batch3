package Day_5;

import java.io.FileInputStream;
//file not found exception
public class Exception2 {

	public static void main(String[] args) {
		FileInputStream input;
		int i;
		try {
//			input = new FileInputStream("C:\\Users\\srinivasan.su\\Documents\\UML.txt");
			input=new FileInputStream("d");
			while((i=input.read())!=-1) {
				System.out.print((char)i);
			}input.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
