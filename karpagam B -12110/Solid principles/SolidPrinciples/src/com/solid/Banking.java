package com.solid;

//Single responsibility principle
//class for deposit	
public class Banking {


		void depositMoney(int amount, String accNumber) {
			// code for money deposit
			System.out.println("Amount is: "+amount);
			System.out.println("Account number is: "+accNumber);

		}
		public static void main(String[] args) {
			Banking ban=new Banking();
			ban.depositMoney(100, "IOB756789");
			
		}
		
}
	

////class for withdraw	
//	
//	public class Withdraw {
//		void witdrawMoney(int amount, String accNumber) {
//			// code for money withdraw
//		}
//	}
//
////class for printLoan	
//	
//	public class PrintLoan {
//		void printLoanInterface(String LoanType) {
//			if (LoanType.equals("carloan")) {
//
//			} else if (LoanType.equals("bikeLoan")) {
//
//			}
//		}
//	}
//
////class for printpassbook
//	
//	public class PrintPassbook {
//		void printPassbook(String accNumber) {
//			// code for print passbook
//		}
//
//	}

	// account-accno(pk),accName,BranchCode,Type,amount
	// Transaction-transactionNo,accno(fk),type,details


