import java.util.Random;
import java.util.Scanner;
public class Marbles {
	
	private double initialSize = (int) (Math.random() * 91) + 10;
	private double marbleNum = 0; 
	private int computer = 0;

	public Marbles() {
		Random xRandom = new Random();
		if (xRandom.nextInt(1) == 0)
			computer = 0;
		else
			computer = 1;
	}
	
	public void smartComputer() {
		while(initialSize != 0 ||initialSize != 3 || initialSize != 7 || 
				initialSize != 15 || initialSize != 31 || initialSize != 63) {
			initialSize--;

			
		}
		if (initialSize == 0)
			youWin();
		takeMarbles();
		
	}

	public void stupidComputer() {
		int take = (int)(Math.random()*(initialSize/2)) + 1;
		initialSize -= take;
		if (initialSize == 0) {
			System.out.println("stupid");
			youWin(); }
		else
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
		if (initialSize == 0)
			youLose();
		else {
			switch(computer) {
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
