package Day7.Tasks;

class FileFormationException extends Exception {

    FileFormationException(String msg) {
        super(msg);
    }
}

public class FileFormatChecker {

    public static void main(String[] args) {
        String file = "MyFile.txt";
        try {
        	if (!(file.endsWith(".pdf"))) {
    			throw new FileFormationException("The file format is not valid");
    		} else {
    			System.out.println("The file format is valid");
    		}
        } catch (FileFormationException e) {
            System.out.println(e.getMessage());
        }
    }
}
