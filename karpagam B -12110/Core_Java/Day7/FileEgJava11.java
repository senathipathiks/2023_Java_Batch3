package Com.Day7;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileEgJava11 {

	public static void main(String[] args) {
		var path="D:\\demo\\sample.txt.txt";
		try {
			Files.writeString(Path.of(path)," heaven",StandardOpenOption.APPEND);
			String data=Files.readString(Path.of(path));
			System.out.println(data);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
