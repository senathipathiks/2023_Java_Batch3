package Day7;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FILEdEMO {

	public static void main(String[] args) {
		
		var path="D:/jo.txt";
		try {
			Files.writeString(Path.of(path)," \n daiii ithu fullll ahh kathaidaaaa",StandardOpenOption.APPEND);
			String data=Files.readString(Path.of(path));
			
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
