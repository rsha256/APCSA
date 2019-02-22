public class Orchard {
	private int[] apples, pears, peaches;

	public Orchard(int[] x, int[] y, int[] z) {
		apples = x;
		pears = y;
		peaches = z;
	}

	public int getTotalApples() {
		int total = 0;
		for (int integer : apples) {
			total += integer;
		}
		return total;
	}

	public int getTotalPears() {
		int total = 0;
		for (int integer : pears) {
			total += integer;
		}
		return total;
	}

	public int[] getApples() {
		return apples;
	}

	public void setApples(int[] apples) {
		this.apples = apples;
	}

	public int[] getPears() {
		return pears;
	}

	public void setPears(int[] pears) {
		this.pears = pears;
	}

	public int[] getPeaches() {
		return peaches;
	}

	public void setPeaches(int[] peaches) {
		this.peaches = peaches;
	}

	public int getTotalPeaches() {
		int total = 0;
		for (int integer : peaches) {
			total += integer;
		}
		return total;
	}
}
