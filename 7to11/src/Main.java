import java.awt.print.Printable;

public class Main {
	
	private double cash, bet;
	private int roll, sum, firstTurn, turn = 0;
	
	public Main(double cash) {
		this.cash = cash;
	}
	
	public void placeBet(double bet) {
		this.bet = bet; 
	}
	
	public int rollDie() {
		roll = (int)(Math.random()*6) + 1;
		return roll;
	}
	
	public void firstTurn() {
		int a = rollDie();
		int b = rollDie();
		firstTurn = a + b; 
		if (firstTurn == 7 || firstTurn == 11) 
			youWin(a, b, firstTurn);
		else if (firstTurn == 2 || firstTurn == 3 || firstTurn == 12) 
			youLose(a,  b,  firstTurn);
		else
			System.out.println("Your first sum is " + a + " + " + "b" + " = " + firstTurn);
	}
	
	public void sumRolls() {
		int a = rollDie();
		int b = rollDie();
		sum = a + b; 
		continueGame(a,  b,  sum);
		checkSum();
	}
	
	public void checkSum() {
		if (turn == 0 && (sum == 7 || sum == 11)) 
			youWin();
		else if (sum == firstTurn)
			youWin();
		else if (turn != 0 && (sum == 7 || sum == 11)) 
			youLose();
		else 
			sumRolls();
	}
	
	public void youWin(int a, int b, int s) {
		System.out.println("Your sum is " + a + " + " + "b" + " = " + s);
		System.out.println("You win!");
		cash += bet; 
		System.out.println("Your total amount of money is now: $" + cash);
	}
	
	public void youLose(int a, int b, int s) {
		System.out.println("Your sum is " + a + " + " + "b" + " = " + s);
		System.out.println("You lose!");
		cash -= bet; 
		System.out.println("Your total amount of money is now: $" + cash);

	}
	
	public void continueGame(int a, int b, int s) {
		System.out.println("Your sum is " + a + " + " + "b" + " = " + s);
	}
	
	public void runGame() {
		
	}
	
	public static void main(String[] args) {
		
	}
}
