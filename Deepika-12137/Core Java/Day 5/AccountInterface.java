package com.day5;
abstract class Account {
    int ano;
    String name;

    void read_acc(int ano, String name) {
        this.ano = ano;
        this.name = name;
    }

    abstract void calculateInterest();
}

class SavingAccount extends Account {
    int amount;
    int interest;
    int time;

    void read_SAccount(int ano, String name, int amount, int interest, int time) {
        super.read_acc(ano, name);
        this.amount = amount;
        this.interest = interest;
        this.time = time;
    }

    @Override
    void calculateInterest() {
        System.out.println("Saving Account Interest is: " + (amount * interest * time / 100));

    }

}
class CurrentAccount extends Account{
      int amount = 0;
      int interest = 0;
      int time = 0;
            void read_CAccount(int interest,int amount,int time) {
                 this.amount = amount;
                    this.interest = interest;
                    this.time = time;
            }
    @Override
    void calculateInterest() {
      
        System.out.println("Current Account is: "+(amount*(1+interest)/time));
        
    }
    
}
class RD extends Account{
      int amount = 0;
      int interest = 0;
      int time = 0;
            void read_RDAccount(int interest,int amount,int time) {
                 this.amount = amount;
                    this.interest = interest;
                    this.time = time;
            }
  @Override
  void calculateInterest() {
    
        System.out.println("Current Account is: "+((amount*(1+interest)/time)^interest*time));
      
  }
  
}


public class AccountInterface {

    public static void main(String[] args) {
        SavingAccount obj1 = new SavingAccount();
        obj1.read_SAccount(11, "Hari", 1000, 3, 3);
        obj1.calculateInterest();
        CurrentAccount obj2=new CurrentAccount();
        obj2.read_CAccount(1000,1, 1);
        obj2.calculateInterest();
        RD obj3=new RD();
        obj3.read_RDAccount(1000, 1, 1);
        obj3.calculateInterest();
        
        

    }

}


