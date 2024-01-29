package Day7;

import java.util.Scanner;

class CustomInvalidMonth  extends Exception{
    public CustomInvalidMonth(String msg) {
    super(msg);
}
}
class ValidMonth {
    public ValidMonth(int mon) throws CustomInvalidMonth {
        if(mon<=0 || mon>=12) {
            throw new CustomInvalidMonth("There is no month \nfor the number you specifed...");
        }
        else {
            System.out.println("Valid month :)");
        }
    }
}
public class InvalidMonthFormat  {

    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Month value in type of integer \nfor Eg:January=1 \nFebruary=2");
            int mon=sc.nextInt();
            ValidMonth obj1=new ValidMonth(mon);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
