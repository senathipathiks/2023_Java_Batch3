package Day_4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionEx1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream input;
		
		int i;
		try {
			input=new FileInputStream("D:\\JavaPrograms");
			while((i=input.read())!=-1) {
				System.out.print((char)i);
			}
			input.close();
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		try {
			Class temp=Class.forName("com.heram.Class");
		}
		
		catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		

	}

}
