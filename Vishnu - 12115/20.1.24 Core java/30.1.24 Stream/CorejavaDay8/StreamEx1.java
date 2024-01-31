package CorejavaDay8;

//How to save an object into file

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StreamEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fin=new FileReader("D:\\Classnotes\\20.1.24 Core java\\30.1.24 Stream\\StreamEx.txt");
		int c;
		while((c=fin.read())!=-1)
			System.out.print((char)c);
		
		//System.out.println("Completer");
		
	}

}
