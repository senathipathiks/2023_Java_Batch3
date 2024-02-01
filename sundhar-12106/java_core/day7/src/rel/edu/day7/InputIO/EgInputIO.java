package rel.edu.day7.InputIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class EgInputIO {
	
	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("D:\\hands-on\\sundhar-12106\\java_core\\test.txt");
		FileOutputStream write = new FileOutputStream("D:\\hands-on\\sundhar-12106\\java_core\\test1.txt");
		
		int c ;
		
		while((c = reader.read())!= -1) {
			System.out.print((char)c);
			write.write(c);
		}
		System.out.println("\n-----------------------------");
		
		FileReader re1 = new FileReader("D:\\hands-on\\sundhar-12106\\java_core\\test1.txt");
		int d;
		while((d = re1.read())!= -1) 
			System.out.print((char)d);
	}

}
