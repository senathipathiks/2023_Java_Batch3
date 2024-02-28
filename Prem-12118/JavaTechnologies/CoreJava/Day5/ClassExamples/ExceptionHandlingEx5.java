package Day5.ClassExamples;

import java.util.*;
import java.io.*;

public class ExceptionHandlingEx5 {

	public static void main(String[] args) throws IOException {

		FileInputStream input;

		int i;
		try {
			input = new FileInputStream("D:\\Notes\\Prem.txt");
			while ((i = input.read()) != -1) {
				System.out.print((char) i);

			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.print(e);
		}
	}
}
