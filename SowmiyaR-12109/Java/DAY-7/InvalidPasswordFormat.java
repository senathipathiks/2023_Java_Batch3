package Day7;

import java.util.Scanner;


class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String password) {
        super(password);
    }
}

class PwdVerification{
    
    public void verify(String pwd) throws InvalidPasswordException {
    String regex ="^(?=.*[0-9])"
            + "(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*[@#$%^&+=])"
            + "(?=\\S+$).{8,20}$";
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the password");
    pwd =sc.next();
    if(!(pwd.matches(regex))) {
        throw new InvalidPasswordException("Enter valid password");
    }
    else {
        System.out.println("Password entered successfull !");
    }
    sc.close();
    }
}

public class InvalidPasswordFormat {

    public static void main(String[] args) {
        
        try {
            
                PwdVerification pwd1=new PwdVerification();
                pwd1.verify("");
                
        } catch (InvalidPasswordException e) {
            System.err.println(e.getMessage());
        }
        catch(Exception e) {
            System.err.println(e.getMessage());
        }
            
    }

}

