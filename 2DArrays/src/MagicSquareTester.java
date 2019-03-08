
public class MagicSquareTester {

	public static void main(String[] args) {
		int[][] one = { { 13, 3, 2, 16 }, { 8, 10, 11, 5 }, { 12, 6, 7, 9 }, { 1, 15, 14, 4 } };
		int[][] two = { { 1, 14, 8, 11 }, { 15, 4, 10, 5 }, { 12, 7, 13, 2 }, { 6, 9, 3, 16 } };
		int[][] three = { { 8, 11, 14, 1 }, { 13, 2, 7, 12 }, { 3, 16, 9, 6 }, { 10, 5, 4, 15 } };
		int[][] four = { { 16, 2, 5, 11 }, { 3, 4, 10, 8 }, { 9, 7, 3, 14 }, { 6, 12, 15, 1 } };
		int[][] five = { { 4, 9, 15, 16 }, { 15, 6, 10, 3 }, { 14, 7, 11, 2 }, { 1, 12, 8, 13 } };
		int[][] six = { { 1, 2, 3, 4 }, { 2, 3, 4, 1 }, { 3, 4, 1, 2 }, { 4, 1, 2, 3 } };
		MagicSquare tms = new MagicSquare();
		tms.printTable(one);
		System.out.println("MAGIC SQUARE? " + tms.testMagic(one));
		System.out.println();
		tms.printTable(two);
		System.out.println("MAGIC SQUARE? " + tms.testMagic(two));
		System.out.println();
		tms.printTable(three);
		System.out.println("MAGIC SQUARE? " + tms.testMagic(three));
		System.out.println();
		tms.printTable(four);
		System.out.println("MAGIC SQUARE? " + tms.testMagic(four));
		System.out.println();
		tms.printTable(five);
		System.out.println("MAGIC SQUARE? " + tms.testMagic(five));
		System.out.println();
		tms.printTable(six);
		System.out.println("MAGIC SQUARE? " + tms.testMagic(six));
	}

}
