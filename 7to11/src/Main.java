import java.util.Scanner;

public class Main {

	private double cash, bet;
    private int sum, firstTurn;
    private int turn = 0;

	private Main() {
	}

	public Main(double cash) {
		this.cash = cash;
	}

	private void placeBet() {
		System.out.println("How much do you want to bet?");
		Scanner input = new Scanner(System.in);
		this.bet = input.nextDouble();
		if (bet == 0)
			System.exit(0);
		if (turn == 0)
			firstTurn();
		else
			sumRolls();
	}

	private int rollDie() {
        return (int) (Math.random() * 6) + 1;
	}

	private void firstTurn() {
		int a = rollDie();
		int b = rollDie();
		firstTurn = a + b;
		sum = firstTurn;
		turn++;
		if (firstTurn == 7 || firstTurn == 11) {
			printSum(a, b);
			youWin();
		} else if (firstTurn == 2 || firstTurn == 3 || firstTurn == 12) {
			printSum(a, b);
			youLose();
		} else {
			System.out.println("Your first sum is " + a + " + " + b + " = " + firstTurn);
			sumRolls();
		}
	}

	private void sumRolls() {
		int a = rollDie();
		int b = rollDie();
		sum = a + b;
		printSum(a, b);
		checkSum();
	}

	private void checkSum() {
		if (turn == 0 && (sum == 7 || sum == 11))
			youWin();
		else if (sum == firstTurn)
			youWin();
		else if (turn != 0 && (sum == 7 || sum == 11))
			youLose();
		else
			sumRolls();
	}

	private void youWin() {
		System.out.println("You win!");
		cash += bet;
		bet = 0;
		System.out.println("Your total amount of money is now: $" + cash);
		turn = 0;
		placeBet();
	}

	private void youLose() {
		System.out.println("You lose!");
		cash -= bet;
		bet = 0;
		System.out.println("Your total amount of money is now: $" + cash);
		turn = 0;
		placeBet();

	}

	private void printSum(int a, int b) {
		System.out.println("Your sum is " + a + " + " + b + " = " + sum);
	}

	private void runGame() {
		System.out.println("Enter the number of marbles you want to take: ");
		Scanner input = new Scanner(System.in);
		cash = input.nextDouble();
		placeBet();
	}

	public static void main(String[] args) {
		Main app = new Main();
		app.runGame();
	}
}
