/**
 * Almanac stores and manages an array of City objects.
 */
public class Almanac {
	City[] list;

	public Almanac() {
		list = new City[5];
		list[0] = new City(1581000, "Philadelphia");
		list[1] = new City(486290, "Atlanta");
		list[2] = new City(486290, "Boston");
		list[3] = new City(8623000, "New York");
		list[4] = new City(28491, "West Windsor");
	}

	/**
	 * Displays List of Cities
	 */
	public void printList() {
		for (City x : list) {
			System.out.println(x);
		}

	}

	/**
	 * Find the city with the smallest population return the name.
	 */
	public String smallestPop() {
		int min = list[0].getPopulation();
		String city = list[0].getName();

		for (City x : list) {
			if (x.getPopulation() < min) {
				min = x.getPopulation();
				city = x.getName();
			}
		}

		return city;

	}

	/**
	 * Returns the average population
	 */
	public double averagePop() {
		double sum = 0;

		for (City x : list) {
			sum += x.getPopulation();
		}

		return sum / list.length;

	}

	/**
	 * Changes the population of a City that matches searchName to newPopulation
	 */
	public void changePop(String searchName, int newPopulation) {

		for (City x : list) {
			if (x.getName().equals(searchName)) {
				x.setPopulation(newPopulation);
			}
		}
	}

	/**
	 * this method will add rate % to each population in the list e.g.
	 * increasePop(5) will increase a city&#39;s population by 5%
	 */
	public void increasePop(double rate) {
		for (City x : list) {
			x.setPopulation(x.getPopulation() * (rate / 100 + 1));
		}
	}


	public static void main(String[] args) {
		Almanac one = new Almanac();
		one.printList();
		System.out.println();
		System.out.println("Average Population: " + one.averagePop());
		System.out.println("Smallest: " + one.smallestPop());
		one.changePop("West Windsor", 40000);
		System.out.println();
		System.out.println("After Change");
		one.printList();
		one.increasePop(5);
		System.out.println();
		System.out.println("After Increase");
		one.printList();
	}
}
