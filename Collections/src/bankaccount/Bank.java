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

	public BankAccount getMaximum() {
		double max = accounts.size();
		for (BankAccount x: accounts) {
			
		}
	}

	public double getTotalBalance() {
		return amountInBank;
	}
}
