import java.util.Scanner;

public class Main {

    private double cash, bet;
    private int roll, sum, firstTurn, turn = 0;

    public Main(double cash) {
        this.cash = cash;
    }

    public void placeBet() {
        System.out.println("How much do you want to bet?");
        Scanner input = new Scanner(System.in);
        this.bet = input.nextDouble();
        if (turn == 0)
            firstTurn();
        else
            sumRolls();
    }

    public int rollDie() {
        roll = (int) (Math.random() * 6) + 1;
        return roll;
    }

    public void firstTurn() {
        int a = rollDie();
        int b = rollDie();
        firstTurn = a + b;
        sum = firstTurn;
        if (firstTurn == 7 || firstTurn == 11)
            youWin(a, b);
        else if (firstTurn == 2 || firstTurn == 3 || firstTurn == 12)
            youLose(a, b);
        else {
            System.out.println("Your first sum is " + a + " + " + b + " = " + firstTurn);
            firstTurn();
        }
    }

    public void sumRolls() {
        int a = rollDie();
        int b = rollDie();
        sum = a + b;
        printSum(a, b);
        checkSum(a, b);
    }

    public void checkSum(int a, int b) {
        if (turn == 0 && (sum == 7 || sum == 11))
            youWin(a, b);
        else if (sum == firstTurn)
            youWin(a, b);
        else if (turn != 0 && (sum == 7 || sum == 11))
            youLose(a, b);
        else
            sumRolls();
    }

    private void youWin(int a, int b) {
        System.out.println("Your sum is " + a + " + " + b + " = " + sum);
        System.out.println("You win!");
        cash += bet;
        bet = 0;
        System.out.println("Your total amount of money is now: $" + cash);
    }

    private void youLose(int a, int b) {
        System.out.println("Your sum is " + a + " + " + b + " = " + sum);
        System.out.println("You lose!");
        cash -= bet;
        bet = 0;
        System.out.println("Your total amount of money is now: $" + cash);

    }

    public void printSum(int a, int b) {
        System.out.println("Your sum is " + a + " + " + b + " = " + sum);
    }

    public void runGame() {
        System.out.println("Welcome to 7/11s");
        Scanner input = new Scanner(System.in);
        placeBet();
    }

    public static void main(String[] args) {
        Main app = new Main(0);
        app.runGame();
    }
}
