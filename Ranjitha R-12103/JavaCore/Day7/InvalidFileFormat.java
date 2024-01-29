package Day7;

class InvalidFileFormatException extends Exception {
	InvalidFileFormatException(String msg) {
		super(msg);
	}
}

class FileFormat {
	FileFormat(String draw) throws InvalidFileFormatException {

		if (!(draw.endsWith(".pdf"))) {
			throw new InvalidFileFormatException("The file format is not valid");
		} else {
			System.out.println("The file format is valid");
		}
	}
}

public class InvalidFileFormat {

	public static void main(String[] args) {
		try {
			FileFormat obj = new FileFormat("draw.pdf");
		} catch (InvalidFileFormatException e) {
			System.out.println(e.getMessage());
		}

	}
}
