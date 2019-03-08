
public class MagicSquare {

	private int[][] square;

	public MagicSquare() {
		square = new int[4][4];
	}

	public MagicSquare(int x) {
		square = new int[x][x];
	}

	public int sumRow(int[][] square, int row) {
		int sum = 0;
		for (int i = 0; i < square[0].length; i++) {
			sum += square[row][i];
		}

		return sum;
	}
	// Precondition: square is an initialized matrix, MAX rows x MAX columns
	// 0 <= row < MAX
	// Postcondition: returns the sum of the values in row

	public boolean unique(int[][] square) {
		int sum = 0;
		for (int i = 1; i < square.length * square.length + 1; i++) {
			sum += i;
		}
		int sum2 = 0;
		for (int[] x : square) {
			for (int y : x) {
				if (y > 16 || y <= 0)
					return false;
				sum2 += y;

			}
		}

		return sum == sum2;

	}
	// Precondition: square is initialized with integers.
	// Action: Inspects every value in square, checking that each one is
	// a unique integer ranging from 1..MAX*MAX
	// Postcondition: Returns true if each value is unique from 1..MAX*MAX,
	// otherwise returns false

	public int sumDiag(int[][] square) {
		int sum = 0;
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[0].length; j++)
				if (i == j) {
					sum += square[i][j];
				}
		}

		return sum;
	}

	public int sumDiag2(int[][] square) {
		int sum = 0;

		for (int i = 0; i < square.length; i++) {
			for (int j = square[0].length - 1; j >= 0; j--)
				if (i + j == 4) {
					sum += square[i][j];
				}
		}

		return sum;
	}

	public int sumCol(int[][] square, int col) {
		int sum = 0;
		for (int i = 0; i < square[0].length; i++) {
			sum += square[i][col];
		}

		return sum;
	}

	public boolean testMagic(int[][] square) {
		int sum = 0;
		for (int i = 1; i < square.length * square.length + 1; i++) {
			sum += i;
		}
		for (int i = 0; i < square.length; i++) {
			if (sumCol(square, i) != (sum / 4)) {
				return false;
			}
		}

		for (int i = 0; i < square.length; i++) {
			if (sumRow(square, i) != (sum / 4)) {
				return false;
			}
		}

		return true;

	}
	// Precondition: square is initialized with integers.
	// Action: Checks that row, col, and diagonal sums are equal and elements are
	// unique
	// Postcondition: Returns true if magic else return false.
	//

	public void printTable(int[][] square) {
		System.out.println("Print of Magic Square");
		for (int r = 0; r < square.length; r++) {
			for (int c = 0; c < square[0].length; c++) {
				System.out.printf("%5d", square[r][c]);
			}
			System.out.println();
		}
	}
}
