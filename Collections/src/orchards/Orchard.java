package orchards;

public class Orchard {
	private String name;
	private int[] apples, pears, peaches;

	public Orchard(String name, int[] apples, int[] pears, int[] peaches) {
		this.name = name;
		this.apples = apples;
		this.pears = pears;
		this.peaches = peaches;
	}

	public String getName() {
		return name;
	}

	public int[] getApples() {
		return apples;
	}

	public int[] getPears() {
		return pears;
	}

	public int[] getPeaches() {
		return peaches;
	}

}
