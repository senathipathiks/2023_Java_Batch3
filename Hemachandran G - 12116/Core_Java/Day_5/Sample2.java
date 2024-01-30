package Day_5;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Sample2 {

	public static void main(String[] args) {
		var path = "D:\\File1\\Day2.txt";
		try {
			Files.writeString(Path.of(path), "\n Hii da Soothhiii and Hi da Abbiii", StandardOpenOption.APPEND);
			String data = Files.readString(Path.of(path));
			System.out.println(data);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}


