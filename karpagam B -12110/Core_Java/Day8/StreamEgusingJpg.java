package Com.Day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamEgusingJpg {

	public static void main(String[] args)throws IOException {
		
		FileInputStream fin=new FileInputStream("D:\\demo\\f3.jfif"); 
		FileOutputStream fout=new FileOutputStream("D:\\demo\\f4.jfif");//it will create and copy the file 
		
			
		
		int c;
		while((c=fin.read())!=-1)
			fout.write(c);
		System.out.print((char)c);
		
		System.out.println("Completed....");
		fin.close();
		fout.close();
	}

}
