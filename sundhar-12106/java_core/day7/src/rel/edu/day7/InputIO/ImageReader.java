package rel.edu.day7.InputIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageReader {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream re = new FileInputStream("C:\\Users\\sundhar.soundhar\\Downloads\\newImg.jpg");
		FileOutputStream wr = new FileOutputStream("C:\\Users\\sundhar.soundhar\\Downloads\\newImg1.jpg");
		
		int c;
		
		while ((c=re.read())!=-1) {
//			System.out.print((char)c);
			wr.write(c);
			
		}
		wr.close();
		System.out.println("completed");
	}

}
