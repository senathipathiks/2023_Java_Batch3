package Com.Day5;
import java.io.*;

public class CheckedExceptionEg1 {

	public static void main(String[] args)throws IOException {
		
		FileInputStream input;
		int i;
		try {
			input=new FileInputStream("D:\\kp1\\sample.txt.txt"); //checkedException--check 
			//input=new FileInputStream("D:\\kp1\\sample.txt");//op-java.io.FileNotFoundException: D:\kp1\sample.txt (The system cannot find the file specified)

			while(( i=input.read())!=-1) {
				System.out.println((char)i);
			}
			input.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
       
	}

}
