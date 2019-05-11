package athlete;

public class Runner extends Athlete {
	
	private String firstName;
	private String lastName;
	private String sport;
	private double hoursTraining = 0;
	private int numRaces = 0, milesRaced = 0;
	
	public Runner() {}
	
	public Runner(String firstName, String lastName, String sport) {
		super(firstName, lastName, sport);
	}
	
	public void race(int miles) {
		milesRaced += miles;
		numRaces++;
	}

	@Override
	public String toString() {
		return super.toString() + "\nMiles raced: " + getMilesRaced() 
		+ " over " + getNumRaces() + " races";
	}

	public int getMilesRaced() {
		return milesRaced;
	}

	public void setMilesRaced(int milesRaced) {
		this.milesRaced = milesRaced;
	}

	public int getNumRaces() {
		return numRaces;
	}

	public void setNumRaces(int numRaces) {
		this.numRaces = numRaces;
	}
	
}
