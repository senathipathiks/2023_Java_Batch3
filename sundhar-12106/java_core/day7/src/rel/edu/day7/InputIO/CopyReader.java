package rel.edu.day7.InputIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyReader {

	public static void main(String[] args) throws IOException {
		
		
		FileReader reader = new FileReader("D:\\hands-on\\sundhar-12106\\java_core\\test.txt");
		FileWriter wri = new FileWriter("D:\\hands-on\\sundhar-12106\\java_core\\test3.txt");
		int c;
		
		while((c=reader.read())!=-1)
		{
			wri.write(c);
		}
		wri.close();

	}

}
