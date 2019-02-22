package bankaccount;

import java.util.ArrayList;

public class Bank {
	double amountInBank;
	ArrayList<BankAccount> accounts; 


	public Bank() {
		accounts = new ArrayList<>();
	}
	
	public void addAccount(BankAccount a) {
	}

	int count(double atLeast) {
		int count = 0;
		for (BankAccount bankAccount : accounts) {
			if (bankAccount.getBalance() >= atLeast) {
				count++;
			}
		}
		return count;
	}
	
	BankAccount find(int n) {
		return accounts.get(n);
	}
	
	public BankAccount getMaximum() {
		int max = accounts.size();
		for (BankAccount x: accounts) {
			
		}
		return accounts.get(max);
	}

	public double getTotalBalance() {
		return amountInBank;
	}
}
