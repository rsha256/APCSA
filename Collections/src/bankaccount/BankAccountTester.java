package bankaccount;

public class BankAccountTester {
	
	
	public static void main(String[] args) {
		BankAccount one = new BankAccount(1);
		BankAccount two = new BankAccount(2, 1000);
		one.deposit(50);
		one.deposit(25.25);
		two.withdraw(12.56);
		two.withdraw(100);
		System.out.println(one);
		System.out.println(two);
	}
}
