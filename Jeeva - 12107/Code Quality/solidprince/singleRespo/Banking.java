package solidprince.singleRespo;

public class Banking {	
	public static void main(String[] args) {
		
		WithdrawMoney.doWithdraw(0, null);
		
		DepositeMoney.doDeposite(0, null);
		
		LoanService.printLoanIntrestRate(null);
		
		PrintPassbook.printPassbook(null);
	}
	

}
