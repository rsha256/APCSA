import java.util.Arrays;

public class MultiplicationTables {

	private int size;
	private int[][] numbers;

	public MultiplicationTables() {
		size = 12;
		numbers = new int[12][12];
		printTable();
	}

	public MultiplicationTables(int size) {
		this.size = size;
		numbers = new int[size][size];
		printTable();
	}

	public void generateTable() {
		for (int r = 0; r < numbers.length; r++) {
			for (int c = 0; c < numbers[0].length; c++) {
				numbers[r][c] = ((r + 1) * (c + 1));
			}
		}
	}

	public void printTable() {
		generateTable();
		display();
	}
	
	public void display() {
		System.out.println("Print of Multiplication Table");
		for (int r = 0; r < numbers.length; r++) {
			for (int c = 0; c < numbers[0].length; c++) {
				System.out.printf("%5d", numbers[r][c]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		MultiplicationTables one = new MultiplicationTables(10);
		
	}
}
