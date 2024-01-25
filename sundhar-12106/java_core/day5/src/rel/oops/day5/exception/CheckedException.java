package rel.oops.day5.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException extends Throwable{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Venna file pathu kuda poda mattiya";
	}

	public static void main(String[] args) throws IOException {
		
//		FileInputStream input;
//		int i ;
//		try {
//			input = new FileInputStream("D:\\SundharRaj-12106\\patience.txt");
//			
//			while ((i = input.read()) != -1) {
//				System.out.print((char)i);
//			}
//			
//		} catch (FileNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
		
		try {
			throw new CheckedException();
		} catch (CheckedException e) {
			System.out.println(e.getMessage());
		}
	}

}
