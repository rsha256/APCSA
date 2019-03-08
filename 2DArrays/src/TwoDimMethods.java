import java.util.Arrays;
import java.util.Random;

public class TwoDimMethods {
	private int[][] numbers;

	public TwoDimMethods() {
		int[][] myNumbers = { { 11, 73, 5, 70 }, { 76, 580, 75, 34 }, { 1, 2, 3, 4 } };
		numbers = myNumbers;
		System.out.println(Arrays.deepToString(numbers));
	}

	public TwoDimMethods(int rows, int cols) {
		numbers = new int[rows][cols];
		loadRandom();
	}

	public void loadRandom() {
		Random gen = new Random();
		for (int r = 0; r < numbers.length; r++) {
			for (int c = 0; c < numbers[0].length; c++) {
				numbers[r][c] = gen.nextInt(100);
			}
		}
	}

	public void display() {
		System.out.println("Print of 2D Array");
		for (int r = 0; r < numbers.length; r++) {
			for (int c = 0; c < numbers[0].length; c++) {
				System.out.printf("%5d", numbers[r][c]);
			}
			System.out.println();
		}

	}

	
	public void displaySideways() {
		System.out.println("Print of 2D Array sideways");
		for (int r = 0; r < numbers[0].length; r++) {
			for (int c = 0; c < numbers.length; c++) {
				System.out.printf("%5d", numbers[r][c]);
			}
			System.out.println();
		}

	}

	public void display2() {
		System.out.println("Print of 2D Array");
		for (int[] x : numbers) {
			for (int y : x) {
				System.out.printf("%5d", y);
			}
			System.out.println();
		}

	}

	public int minimum() {
		int min = numbers[0][0];
		for (int r = 0; r < numbers.length; r++) {
			for (int c = 0; c < numbers[0].length; c++) {
				if (numbers[r][c] < min)
					min = numbers[r][c];
			}
		}
		return min;
	}

	public double average() {
		double total = 0;
		for (int r = 0; r < numbers.length; r++) {
			for (int c = 0; c < numbers[0].length; c++) {
				total += numbers[r][c];
			}
		}
		return total / (numbers.length * numbers[0].length);
	}

	public static void main(String[] args) {
		TwoDimMethods one = new TwoDimMethods();
		TwoDimMethods two = new TwoDimMethods(3, 6);
		one.display2();
		System.out.println("minimum: " + one.minimum());
		System.out.println("avg. value: " + one.average());
	}

}
