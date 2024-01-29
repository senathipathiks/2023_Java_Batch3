package classIntro;
//Create an interface named account with a method of calcInterest(). Create the classes
//named SavingsAccount and CurrentAccount to implement the interface. Define the calcInterest
//and show the result.

interface Account1
{
	public void calcIntrest();
}
class SavingsAccount implements Account1{
	public  void calcIntrest() {
		System.out.println("This is savings account");
		
	}
}
class CurrentAccount implements Account1{
	public  void calcIntrest() {
		System.out.println("This is CurrentAccount ");
		
	}
}
public class Account {

	public static void main(String[] args) {
		
		SavingsAccount s=new SavingsAccount();
		s.calcIntrest();
		CurrentAccount c=new CurrentAccount();
		c.calcIntrest();

	}

}
