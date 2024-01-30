package Com.Day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;

public class StreamEg {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin=new FileInputStream("D:\\demo\\sample.txt.txt"); // we can use FileReader instead of FileInputStream 
		FileOutputStream fout=new FileOutputStream("D:\\demo\\sample1.txt.txt");// we can use FileWriter instead of FileOutputStream 
			
		
		int c;
		while((c=fin.read())!=-1)// -1 indicates that the file reaches the end of the file
			fout.write(c);// copy the first file content to second file
		System.out.print((char)c);
		
		System.out.println("Completed....");
		fin.close();// if use filereader and filewriter, it will copy the file only if you close it.
		fout.close();

	}

}
