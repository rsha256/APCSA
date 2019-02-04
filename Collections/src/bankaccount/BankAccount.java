package bankaccount;

public class BankAccount {
	private double amount;
	private int accountNumber;

	public BankAccount() {
	}

	public BankAccount(int anAccountNumber) {
		accountNumber = anAccountNumber;
		amount = 0;
	}

	public BankAccount(int anAccountNumber, double initialBalance) {
		accountNumber = anAccountNumber;
		amount = initialBalance;
	}

	public void deposit(double amount) {
		this.amount = amount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return amount;
	}

	public String toString() {
		return "Account number " + accountNumber + " has $" + amount;
	}

	public void withdraw(double amount) {
		this.amount -= amount;
	}
}