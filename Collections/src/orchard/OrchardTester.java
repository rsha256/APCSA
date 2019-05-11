package orchard;

public class OrchardTester {
	static int[] apples0 = { 128, 358, 984, 1522 };
	static int[] pears0 = { 340, 587, 465, 105 };
	static int[] peaches0 = { 977, 682, 413, 57 };

	static int[] apples1 = { 189, 402, 1057, 1934 };
	static int[] pears1 = { 204, 498, 615, 99 };
	static int[] peaches1 = { 805, 715, 348, 45 };

	static int[] apples2 = { 64, 366, 1161, 1302 };
	static int[] pears2 = { 504, 677, 979, 308 };
	static int[] peaches2 = { 1071, 698, 585, 132 };

	static Orchard[] myOrchards = new Orchard[3];

	public static void main(String[] args) {

		// Orchard 0
		myOrchards[0] = new Orchard(apples0, pears0, peaches0);

		// Orchard 1
		myOrchards[1] = new Orchard(apples1, pears1, peaches1);


		// Orchard 2
		myOrchards[2] = new Orchard(apples2, pears2, peaches2);

		mostFruit();

	}

	
	// finds the orchard that has the most fruit
	static void mostFruit() {
		System.out.println("Which produced most fruit");
		int max = myOrchards[0].getTotalApples() + myOrchards[0].getTotalPears() + myOrchards[0].getTotalPeaches();
		int j = 0;
		for (int i = 1; i < 3; i++) {
			if ((myOrchards[i].getTotalApples() + myOrchards[i].getTotalPears()
					+ myOrchards[i].getTotalPeaches()) > max) {
				j = i;
			}
		}
		System.out.println("Orchard: " + j);
	}
	
	//most pears in September
	static void mostPearsSept() {
		System.out.println("Which produced the most pears in Sepetembers?");
		int [] app = myOrchards[0].getApples();
		int max = app[2];
		for (int i = 1; i < 3; i++) {
			
		}
	}
}
