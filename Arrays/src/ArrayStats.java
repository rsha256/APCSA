import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStats {
	// instance variable
	private int[] array = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 5, 6, 7 };

	// constructor
	public ArrayStats() {
	}

	public ArrayStats(int[] x) {
		array = x;
	}

	// set method
	public void setArray(int[] x) {
		array = x;
	}

	public int getNumGroupsOfSize(int size) {
		int cnt = 0;

		if (size <= 0) {
			return 0;
		}

		if (size == 1) {
			int count = 1;
			Arrays.sort(array);
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] != array[i + 1]) {
					count++;
				}
			}
			return count;
		}

		return cnt;
	}

	public String toString(int x) {
		return "size " + x + " count == " + getNumGroupsOfSize(x);
	}
}