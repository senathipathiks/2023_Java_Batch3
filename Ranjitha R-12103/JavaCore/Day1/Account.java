/*Create an interface named account with a method of calcInterest(). Create the classes
named SavingsAccount and CurrentAccount to implement the interface. Define the calcInterest
and show the result.*/
package Day1;
interface Accounts{
	 void calcInterest(int p,int r,int t);
}
class SavingAccount implements Accounts{
	public void calcInterest(int p,int r,int t) {
		System.out.println(" Interest of Saving Account is : "+p*r*t);
	}
}
 class CurrentAccount implements Accounts{
	public void calcInterest(int p,int r,int t) {
		System.out.println("Interest of Current Account is : "+p*r*t);
	}
}
public class Account {

	public static void main(String[] args) {
		Accounts obj1=new SavingAccount();
		obj1.calcInterest(3200,4,5);
		Accounts obj2=new CurrentAccount();
		obj2.calcInterest(2000,2,4);

	}

}
