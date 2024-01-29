package Java_Day_5;

abstract class Account {
    int acctno;
    String acctname;
    String uname;

    void read_acct(int acctno, String acctname, String uname) {
        this.acctno = acctno;
        this.acctname = acctname;
        this.uname = uname;
    }

    void display() {
        System.out.println("Account no:" + acctno + "Account name: " + acctname + "User name: " + uname);
    }

    abstract void CalculateBalance();
}

 class SavingsAccount extends Account {
    void read_Sacct(int acctno, String acctname, String uname) {
        super.read_acct(acctno, acctname, uname);
    }

    @Override
    void CalculateBalance() {
        System.out.println("SavingsAccount Balance: 10,000");

    }

}

 class CurrentAccount extends Account {
    void read_Cacct(int acctno, String acctname, String uname) {
        super.read_acct(acctno, acctname, uname);
    }

    @Override
    void CalculateBalance() {
        System.out.println("CurrentAccount Balance: 20,000");

    }

}

 class RD extends Account {
    void read_Racct(int acctno, String acctname, String uname) {
        super.read_acct(acctno, acctname, uname);
    }

    @Override
    void CalculateBalance() {
        System.out.println("RD Balance: 15,000");

    }

}



public class Accounts {

	public static void main(String[] args) {
		SavingsAccount obj1 = new SavingsAccount();
        // obj1.;
        obj1.read_Sacct(15986, "Varshinee", "SavingsAccount");
        obj1.CalculateBalance();

        CurrentAccount obj2 = new CurrentAccount();
        obj2.read_Cacct(25897, "Varshinee", "CurrentAccount");
        obj2.CalculateBalance();

        RD obj3 = new RD();
        obj3.read_Racct(34982, "Varshinee", "RD");
        obj3.CalculateBalance();


	}

}
