package Day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fileread {

	public static void main(String[] args) throws IOException {
		
		
		/// file input stream method
		
//		FileInputStream fir=new FileInputStream("D:\\jo.txt");
//		FileOutputStream fin=new FileOutputStream("D:\\\\jo1.txt");
//		
//		int c=fir.read();
//		
//		while( (c=fir.read())!=-1){
//			fin.write((char)c);
//			System.out.println("Completed");
//			
//			fir.close();
//			fin.close();
//			
//			
//			
//		}
		
		
		
		// another method
		
		FileReader fir=new FileReader("D:\\jo.txt");
		
		FileWriter fwr=new FileWriter("D:\\jo1.txt");
			int c;
		
		while( (c=fir.read())!=-1){
			fwr.write((char)c);
			System.out.println("Completed");
			
			fir.close();
			fwr.close();
			
			
			
		}

		
		
		
	}

}
