package Day8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingEX1 {

	public static void main(String[] args) throws IOException{
		 
		FileInputStream fin=new FileInputStream("C:\\Users\\prem.mariyappan\\Downloads\\earth.jpg");
		FileOutputStream fout =new FileOutputStream("C:\\Users\\prem.mariyappan\\Downloads\\earth2.jpg");
	 	int c;
		while((c=fin.read())!=-1) {
			fout.write(c);
			System.out.print((char)c);
		}
			
			fin.close();
			fout.close();
			
		
			//FileInputStream fin=new FileInputStream("D:\\Sample.txt");
			//FileOutputStream fout =new FileOutputStream("D:\\Sample1.txt");

}
}
