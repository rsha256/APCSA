package guidance;

public class Reservation {
	private String name = ""; // last name of the person reserving the room
	private double rate = 0.0; // room rate for 1 night's stay

	public Reservation() {
		name = "Lepold";
		rate = 99.99;
	}

	public Reservation(String myName, double myRate) {
		name = myName;
		rate = myRate;
	}

	public double getRate() {
		return rate;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return name + ": " + rate;
	}
}