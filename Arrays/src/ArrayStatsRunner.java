public class ArrayStatsRunner {
	public static void main(String args[]) {
		ArrayStats one = new ArrayStats();
		// one.setArray(new int[] {3, 3, 3, 3, 3, 9, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 7, 7,
		// 8, 8, 8, 8, 8, 8, 8, 8});
		// one.setArray(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
		one.setArray(new int[] {1, 1, 1, 2, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 4, 4, 4, 6});
		System.out.println(one.toString(1));

	}
}
