package CorejavaDay8;

//How to save an object into file

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;




public class StreamEx2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fin=new FileReader("C:\\Users\\vishnu.v\\Downloads\\Surya.jfif");
		FileWriter fout=new FileWriter("C:\\Users\\vishnu.v\\Downloads\\Surya1.jfif");
		int c;
		while((c=fin.read())!=-1)
			fout.write(c);
			System.out.print("Completed");
			fin.close();
			fout.close();
		
		//System.out.println("Completer");
		
	}

}
