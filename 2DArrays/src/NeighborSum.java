import java.util.*;
import java.io.*;

public class NeighborSum {

	private int[][] chart = { 
			{ 1, 2, 3, 4, 5 }, 
			{ 6, 7, 8, 9, 0 }, 
			{ 6, 7, 1, 2, 5 }, 
			{ 6, 7, 8, 9, 0 },
			{ 5, 4, 3, 2, 1 }, 
			{ 0, 0, 0, 0, 0 } 
			};

	
	private int sum(int row, int col) {
		int s = 0;
		try {
			s += chart[row - 1][col - 1];
		} catch (Exception e) {
		}
		try {
			s += chart[row - 1][col + 1];
		} catch (Exception e) {
		}
		try {
			s += chart[row + 1][col - 1];
		} catch (Exception e) {
		}
		try {
			s += chart[row - 1][col];
		} catch (Exception e) {
		}
		try {
			s += chart[row][col - 1];
		} catch (Exception e) {
		}
		try {
			s += chart[row + 1][col];
		} catch (Exception e) {
		}
		try {
			s += chart[row][col + 1];
		} catch (Exception e) {
		}
		try {
			s += chart[row + 1][col + 1];
		} catch (Exception e) {
		}

		return s;

	}

	public void go() throws Exception {
		Scanner file = new Scanner(new File("NeighborSumChart.dat"));
		int pairs = file.nextInt();
		for (int i = 0; i < pairs; i++) {
			int r = file.nextInt();
			int c = file.nextInt();
			System.out.println("The sum of " + r + "," + c + " is " + sum(r, c));
		}
		file.close();
	}

	public static void main(String[] args) throws Exception {
		NeighborSum x = new NeighborSum();
		x.go();
	}
}
