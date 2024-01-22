package Day_1;
import java.util.Scanner;
/*
 * Create an interface named account with a method of calcInterest(). Create the classes
named SavingsAccount and CurrentAccount to implement the interface. Define the calcInterest
and show the result
 */

interface Account{
    void calcInterst(int p, int r,int t);
   }

class SavingsAccount implements Account{
   @Override
   public void calcInterst(int p, int r,int t) {
       System.out.println("Interest for your SavingsAccount is:" +p*r*t);
       
   }
   
}
class CurrentAccount implements Account{
   
   @Override
   public void calcInterst(int p, int r,int t) {
       System.out.println("Interest for your CurrentAccount is:" +p*r*t);
       
   }
}

public class Intrest {

   public static void main(String[] args) {
       Account obj1=new SavingsAccount();
       Account obj2=new CurrentAccount();
       obj1.calcInterst(20000,2,4);
       obj2.calcInterst(60000,3,5);
       

   }

}

