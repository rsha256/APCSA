public class Grid {
	private String[][] grid;

	// load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals) {
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				grid[r][c] = vals[(int) Math.random()];
			}
		}
	}

	// find out which of the vals occurs the most
	public String findMax(String[] vals) {
		String max = vals[0];
		for (String x : vals) {
			if (x.compareTo(max) < 0) {
				max = x;
			}
		}
		
		return max;
	}

	// returns a count of how many times val occurs in the matrix
	private int countVals(String val) {
		int c = 0;
		for (String[] strings : grid) {
			for (String string : strings) {
				if (string.equals(val)) {
					c++;
				}
			}
		}
		return c;
	}

	// display the grid
	public String toString() {
		String output = "";
		return output;
	}
}
