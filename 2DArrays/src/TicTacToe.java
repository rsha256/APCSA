import java.util.Scanner;

import static java.lang.System.*;

import java.io.File;

public class TicTacToe {
	private char[][] mat;

	public TicTacToe() {
		mat = new char[5][9];	
	}

	public TicTacToe(String game) {

	}

	public int sumCol(int[][] square, int col) {
		int sum = 0;
		for (int i = 0; i < square[0].length; i++) {
			sum += square[i][col];
		}

		return sum;
	}
	
	public String getWinner() {
		try {
			Scanner file = new Scanner(new File("tictactoe.dat"));
			
			char[] pairs = file.nextLine().toCharArray();
			pairs = file.nextLine().toCharArray();
			for (int i = 0; i < pairs.length; i++) {
				for (int j = 0; j < mat.length; j++) {
					mat[j][i] = pairs[i];
				}
				pairs = file.nextLine().toCharArray();	
			}
			
			System.out.println(pairs);
			
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public String toString() {
		String output = "";

		return output + "\n\n";
	}
}