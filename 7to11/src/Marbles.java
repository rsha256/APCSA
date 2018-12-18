import java.util.Random;
import java.util.Scanner;

public class Marbles {

	private int initialSize = (int) (Math.random() * 91) + 10;
	private double marbleNum = 0;
	private int computer = 0;

	public Marbles() {
		computer = (int) (Math.random() + 0.5);
	}

	public void smartComputer() {
		for (int i = 0; i < initialSize; i++) {
			switch (initialSize - i) {
			case 0:
				youWin();
			case 3:
				takeMarbles();
			case 7:
				takeMarbles();
			case 15:
				takeMarbles();
			case 31:
				takeMarbles();
			case 63:
				takeMarbles();	
			default:
				initialSize--;
			}
		}
	}

	public void stupidComputer() {
		int take = (int) (Math.random() * (initialSize / 2)) + 1;
		initialSize -= take;
		if (initialSize == 0) {
			youWin();
		} else
			takeMarbles();

	}

	public void takeMarbles() {
		System.out.println("Enter the number of marbles you want to take: ");
		Scanner input = new Scanner(System.in);
		marbleNum = input.nextDouble();
		initialSize -= marbleNum;
		checkSize();
	}

	public void checkSize() {
		if (initialSize <= 0)
			youLose();
		else {
			switch (computer) {
			case 0:
				smartComputer();
			case 1:
				stupidComputer();
			}
		}
	}

	public void youLose() {
		System.out.println("You lose!");
	}

	public void youWin() {
		System.out.println("You win!");
	}

	public void run() {
		System.out.println(initialSize);
		takeMarbles();
	}

	public static void main(String[] args) {
		Marbles one = new Marbles();
		one.run();
	}

}
