package com.day6adv;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

class InvalidFileFormat extends Exception 
{
	InvalidFileFormat(String msg)
	{
		super(msg);
	}
	
}
public class FileFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\h.txt");

        try {
            String fileType = Files.probeContentType(file.toPath());

            if (fileType == null) {
                throw new IOException("File type could not be determined");
            }

            if (!fileType.equals("expected_file_type")) {
                throw new InvalidFileFormat("Unexpected file format: " + fileType);
            }

            // Process the file
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } catch (InvalidFileFormat e) {
            System.out.println("Invalid file format: " + e.getMessage());
        }
	}

}
