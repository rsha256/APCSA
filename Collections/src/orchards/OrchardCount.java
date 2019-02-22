package orchards;

public class OrchardCount {
	private Orchard[] list;

	public OrchardCount(Orchard zero, Orchard one, Orchard two) {
		list = new Orchard[3];
		list[0] = zero;
		list[1] = one;
		list[2] = two;

	}

	/**
	 * Method will locate the name of the orchard that produced the most apples
	 * overall
	 * 
	 * @return orchard name
	 */
	public String MostApples() {
		int max = 0;
		int maxIndex = 0;
		int sum;
		for (int i = 0; i < list.length; i++) {
			sum = 0;
			for (int j = 0; j < list[i].getApples().length; j++) {
				sum += list[i].getApples()[j];
			}
			if (sum > max) {
				max = sum;
				maxIndex = i;
			}
		}
		return list[maxIndex].getName();
	}

	/**
	 * Method finds the orchard with the greatest average Peaches per month. The
	 * name of the orchard will print within the method, and then the average of
	 * that month is returned as a double
	 * 
	 * @return greatest average of Peaches for one Orchard
	 */
	public double averagePeaches() {
		double maxAverage = 0;
		int sum = 0;
		int maxIndex = 0;
		double average;
		for (int i = 0; i < list.length; i++) {
			sum = 0;
			average = 0;
			for (int j = 0; j < list[i].getPeaches().length; j++) {
				sum += list[i].getPeaches()[j];
			}
			average = sum / list[i].getPeaches().length;
			if (average > maxAverage) {
				maxAverage = average;
				maxIndex = i;
			}
		}

		System.out.println(list[maxIndex].getName());
		return maxAverage;
	}

	/**
	 * Method will locate the name of the orchard that had the largest difference
	 * between the best month and the worst month of apple production
	 * 
	 * @return orchard name
	 */
	public String BiggestAppleDisparity() {
		return "";
	}

	public static void main(String[] args) {

		Orchard west = new Orchard("West", new int[] { 128, 348, 984, 1522 }, new int[] { 340, 587, 465, 105 },
				new int[] { 977, 682, 413, 57 });

		Orchard east = new Orchard("East", new int[] { 189, 402, 1057, 1934 }, new int[] { 204, 498, 615, 99 },
				new int[] { 805, 715, 348, 45 });

		Orchard north = new Orchard("North", new int[] { 64, 366, 1161, 1302 }, new int[] { 504, 677, 979, 308 },
				new int[] { 1071, 698, 585, 132 });

		OrchardCount one = new OrchardCount(west, east, north);
		System.out.println(one.MostApples());
		System.out.println(one.averagePeaches());
	}

}
