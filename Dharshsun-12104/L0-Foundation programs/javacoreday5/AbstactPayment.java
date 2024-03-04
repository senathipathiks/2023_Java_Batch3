package com.javacoreday5;

interface Payment{
    void pay();
}

class UPITransaction implements Payment{
    
    public UPITransaction() {
        System.out.println("Payment to UPI method");
    }    
    @Override
    public void pay() {
        System.out.println("Enter the UPI pin..");
    }
}

class BankTransaction implements Payment{
    
    public BankTransaction() {
        System.out.println("Payment to NetBanking method");
    }
    @Override
    public void pay() {
        System.out.println("Enter the personal pin..");
    }
}

public class AbstactPayment {

    public static void main(String[] args) {
        
        Payment method1 = new UPITransaction();
        method1.pay();
        
        Payment method2 = new BankTransaction();
        method2.pay();

    }

}
