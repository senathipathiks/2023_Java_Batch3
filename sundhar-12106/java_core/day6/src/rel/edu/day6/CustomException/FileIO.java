package rel.edu.day6.CustomException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileIO {
	
	public static void main(String[] args) {
		
		var path = "D:\\hands-on\\sundhar-12106\\java_core\\test.txt";
		
		try {
//			String data = Files.readString(Path.of(path));
			Files.writeString(Path.of(path), "Write from java", StandardOpenOption.APPEND);
//			System.out.println(data);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
