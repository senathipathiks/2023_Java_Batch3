package Day7;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.*;

public class FileDemo {

	public static void main(String[] args) {

		var path = "C:\\Users\\ranjitha.rajaram\\Documents\\Technical\\CJAVA.txt";
		try {

			Files.writeString(Path.of(path), "Hello", StandardOpenOption.APPEND);
			String data = Files.readString(Path.of(path));

			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}