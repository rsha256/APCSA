package bank;

public class BankAccount {

	// private limits to this class ONLY - making stuff as private as possible is called encapsulation
	private String acctNumb; // Strings are immutable
	
	private double balance;
	
//	private BankAccount() {
//		
//	}
	
	public BankAccount(String acct, double balance) {
		setAcctNumb(acct);
		setBalance(balance);
	}
	
	public BankAccount(double balance, String acct) {
		setAcctNumb(acct);
		setBalance(balance);
	}
	
	public static void main(String[] args) {
//		BankAccount one = new BankAccount();
//		System.out.println(one.toString());
//		System.out.println(one.getBalance());
		BankAccount two = new BankAccount("A44", 50);
		two.deposit(20);
		two.withdraw(40);
		two.balanceAfterInterest(3);
		System.out.println(two);		
//		BankAccount three = new BankAccount(200, "B21");
//		System.out.println(two);
	}
	
	public double getBalance() {
		return balance;
	}

	public String getAcctNumb() {
		return acctNumb;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAcctNumb(String acctNumb) {
		this.acctNumb = acctNumb;
	}
	
	// make a method that deposits an amount of money 
	// which adds to current balance
	public void deposit(double dep) {
		balance += dep;
	}
	
	public void withdraw(double amnt) {
		balance -= amnt;
	}
	
	public void balanceAfterInterest(double percent) {
		double temp = balance;
		temp *= (percent/100);
		balance += temp;
	}
	
	@Override
	public String toString() {
		return "This Bank Account has a balance of: " + balance + ", and account #" + acctNumb;
	}
	
}
