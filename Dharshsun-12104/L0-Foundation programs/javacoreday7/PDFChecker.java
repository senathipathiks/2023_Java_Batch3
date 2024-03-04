package com.javacoreday7;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class PDFChecker {
    public static void main(String[] args) {
        File file = new File("Downloads/Dharshsun-12104 react assesment.pdf");
        try {
            if (!file.getName().endsWith(".pdf")) {
                throw new InvalidFileFormatException("Only PDF files are allowed.");
            }
            String mimeType = Files.probeContentType(file.toPath());
            if (mimeType != null && mimeType.equals("application/pdf")) {
                System.out.println("The file is a PDF.");
            } else {
                System.out.println("The file is not a PDF.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while checking the file type: " + e.getMessage());
        } catch (InvalidFileFormatException e) {
            System.out.println("Error: " + e.getMessage());
            // Handle the custom exception.
        }
    }
}

class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(String message) {
        super(message);
    }
}
