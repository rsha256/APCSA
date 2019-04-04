import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner {
	public static void main(String args[]) throws IOException {
		String[] xStrings = {
				"a 9 2 2 b a 9 a b 7",
				"a 2 b x a 9 7 c 2 a",
				"b 2 2 x c a 2 b 9 7",
				"9 9 b 9 7 9 x x x c",
				"b x b a 9 2 c x x 7",
				"b 2 a a 9 c c x b b",
				"b 2 7 x 2 9 c 7 9 x",
				"7 b c 9 x 2 2 x 7 7",
				"c a c x 7 x a 2 9 b",
				"9 2 c x x 9 b 2 x b"
				};
		Grid one = new Grid(5, 5, xStrings); 
	}
}