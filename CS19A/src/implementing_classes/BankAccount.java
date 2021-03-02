package implementing_classes;

public class BankAccount {
	private String accountNumber;
	private String accountName;
	private double balance;
	
	// user defined constructor
	public BankAccount(String Number, String Name) {
		accountNumber=Number;
		accountName=Name;
		balance=0;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	// methods to deposit and withdraw money
	
	public void deposite(double amountIn) {
		balance=balance+amountIn;
	}
	
	public boolean withdraw(double amountIn) {
		if(amountIn>balance) {
			return false;
		}else {
			balance=balance-amountIn;
			return true;
		}
	}
}
