package PiggyChak;

public class PiggyBankRunner {

	
	
	public static void main(String[] args) {
		PiggyBank one = new PiggyBank(5, 5, 5, 5);
		PiggyBank two = new PiggyBank(2, 3, 4, 1);

		System.out.println("Account 1: " + one + "\n");
		System.out.println("Account 2: " + two + "\n");

		one.combinePiggy(two);
		System.out.println("Account 1: " + one + "\n");
		System.out.println("Account 2: " + two + "\n");
	}

}

//Expected output is below
/*
Account 1: The piggy bank currently contains:
5 pennies, 5 nickels, 5 dimes, and 5 quarters
for a total value of: $2.05

Account 2: The piggy bank currently contains:
2 pennies, 3 nickels, 4 dimes, and 1 quarters
for a total value of: $0.82

Account 1: The piggy bank currently contains:
7 pennies, 8 nickels, 9 dimes, and 6 quarters
for a total value of: $2.87

Account 2: The piggy bank currently contains:
0 pennies, 0 nickels, 0 dimes, and 0 quarters
for a total value of: $0.0
 */
