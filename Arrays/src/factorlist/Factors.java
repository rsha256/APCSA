package factorlist;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Factors {
	public static ArrayList<Integer> getListOfFactors(int number) {
		ArrayList<Integer> f = new ArrayList<>();
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				f.add(i);
			}
		}
		return f;
	}

	public static void keepOnlyCompositeNumbers(List<Integer> nums) {
		int size = nums.size() - 1;
		while (size >= 0) {
			int item = nums.get(size);
			ArrayList<Integer> factors = getListOfFactors(item);
			if (factors.size() == 0) {
				nums.remove(size);
			}
			size--;
		}
	}
}