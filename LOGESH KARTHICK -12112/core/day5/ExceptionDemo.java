package core.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream input;
		int i;
		try {
			input = new FileInputStream("C:\\Users\\logesh.s\\Documents\\behavioural.txt");
			while ((i = input.read()) != -1) {
				System.out.print((char) i);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
