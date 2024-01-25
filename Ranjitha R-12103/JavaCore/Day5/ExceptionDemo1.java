package Day5;

import java.io.IOException;

public class ExceptionDemo1 {

	public static void main(String[] args) throws IOException {
		int a=10,b=0;
		try {
		int c=a/b;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(a);

	}

}
