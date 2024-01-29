package Day7.Tasks;

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String msg) {
        super(msg);
    }
}

class Checker {
    Checker(String pass) throws InvalidPasswordException {
        if (pass.length() != 8 || !pass.contains("@") || !pass.contains("&") || !pass.contains("#")
                || !pass.contains("$") || !pass.contains("%") || !pass.contains("*")) {
            throw new InvalidPasswordException("Invalid Password Format");
        }
    }
}

public class PasswordChecker {
    public static void main(String[] args) {
        try {
            // Example usage of the Checker class
            Checker passwordChecker = new Checker("P@ssw0rd");
            System.out.println("Password is valid");
        } catch (InvalidPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
