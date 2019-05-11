package athlete;

public class Marathoner extends Runner {
	
	private String firstName;
	private String lastName;
	private String sport;
	private double hoursTraining = 0;
	private int numRaces = 0, milesRaced = 0;
	
	public Marathoner(String firstName, String lastName, String sport) {
		super(firstName, lastName, sport);
		super.setSport("Running");
	}
	
	@Override
	public void race(int miles) {
		if (miles >= 10) {
			super.race(miles);
		} else {
			train((8.5/60) * miles);
		}
	}
}
