import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToeRunner {
	public static void main(String args[]) {
		try {
			TicTacToe one = new TicTacToe();

			one.getWinner();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}