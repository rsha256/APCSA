/**
 * Defines an athlete.
 */
public class Athlete {
	private String firstName;
	private String lastName;
	private String sport;
	private double hoursTraining = 0;

	public Athlete() {}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public void setHoursTraining(double hoursTraining) {
		this.hoursTraining = hoursTraining;
	}

	/**
	 * Constructs an athlete with a specified name and sport; hoursTraining is
	 * initialized to 0.
	 *
	 * @param fname
	 *            first name of athlete
	 * @param lname
	 *            last name of athlete
	 * @param sportPlayed
	 *            sport in which athlete participates
	 */
	public Athlete(String fname, String lname, String sportPlayed) {
		// code here
		firstName = fname;
		lastName = lname;
		sport = sportPlayed;
	}

	@Override
	public String toString() {
		// code here
		return getName() + "\t" + getSport() + "\t\t" + getHoursTraining();
	}

	/**
	 * Updates hours of training.
	 *
	 * @param hours
	 *            number of hours athlete trained
	 */
	public void train(double hours) {
		// code here
		hoursTraining += hours;
	}

	/**
	 * gets athlete name
	 *
	 * @return name of athlete
	 */
	public String getName() {
		return (firstName + " " + lastName);
	}

	/**
	 * gets sport of athlete
	 *
	 * @return sport participated in
	 */
	public String getSport() {
		// code here
		return sport;
	}

	/**
	 * gets hours trained by athlete
	 *
	 * @return hoursTraining
	 */
	public double getHoursTraining() {
		// code here
		return hoursTraining;
	}
}