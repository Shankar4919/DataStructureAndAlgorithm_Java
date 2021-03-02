package implementing_classes;

public class parameterTest {
	public static void main(String[] args) {
		// create new bank account
		BankAccount testAccount=new BankAccount("1","Rem");
		test(testAccount);
		
		System.out.println("Account Number: "+testAccount.getAccountNumber());
		System.out.println("Account Name: "+testAccount.getAccountName());
		System.out.println("Balance: "+testAccount.getBalance());
	}
	
	public static void test(BankAccount testAccount) {
		testAccount.deposite(2500);
		testAccount.withdraw(2300);
	}

}
