package implementing_classes;

public class BankAccountTester2 {
	public static void main(String[] args) {
		// create a bank account
		BankAccount2 account=new BankAccount2("99745643","Mamba");
		//create another bank account
		BankAccount2 account2=new BankAccount2("99876564","Tamang");
		// make a deposite into the first and second account
		account.deposite(10000);
		account2.deposite(1000);
		
		// set the interest rate
		BankAccount2.setInterestRate(10);
		
		// add interest to accounts
		account.addInterest();
		account2.addInterest();
		
		// display the account details
		
		System.out.println("Account number "+account.getAccountNumber());
		System.out.println("Account Name "+account.getAccountName());
		System.out.println("Interest Rate "+BankAccount2.getInterestRate());
		System.out.println("Current balance "+account.getBalance());
		System.out.println();
		
		System.out.println("Account number "+account2.getAccountNumber());
		System.out.println("Account Name "+account2.getAccountName());
		System.out.println("Interest Rate "+BankAccount2.getInterestRate());
		System.out.println("Current balance "+account2.getBalance());
	}

}
