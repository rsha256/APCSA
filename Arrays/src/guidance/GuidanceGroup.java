package guidance;

public class GuidanceGroup {
	// Array group will store SatStudent objects
	private SatStudent[] group;

	/**
	 * Default Constructor for objects of class GuidanceGroup
	 */
	public GuidanceGroup() {
		group = new SatStudent[12];
		group[0] = (new SatStudent("Ye", 640, 695, 686));
		group[1] = (new SatStudent("Bradley", 778, 768, 780));
		group[2] = (new SatStudent("Chen", 687, 614, 705));
		group[3] = (new SatStudent("Davis", 620, 534, 556));
		group[4] = (new SatStudent("Aarons", 550, 565, 517));
		group[5] = (new SatStudent("Gupta", 687, 720, 640));
		group[6] = (new SatStudent("Park", 722, 721, 745));
		group[7] = (new SatStudent("Kohl", 595, 605, 615));
		group[8] = (new SatStudent("Mehta", 525, 637, 521));
		group[9] = (new SatStudent("Bahl", 611, 607, 610));
		group[10] = (new SatStudent("Smith", 670, 703, 610));
		group[11] = (new SatStudent("Issacs", 670, 690, 710));
	}

	// Constructor with a SatStudent[] array as a parameter
	public GuidanceGroup(SatStudent[] myGroup) {
		group = myGroup;
	}

	// This method displays a chart with 2 columns: Name and Total SAT score
	public void display() {
		System.out.println("Name:\t\tTotal SAT Score:");
		for (SatStudent satStudent : group) {
			System.out.println(satStudent.getName() + "\t\t" + satStudent.getTotalScore());
		}
	}

	// This method returns the name of the student with the lowest total SAT
	public String getMin() {
		int index = 0;
		int min = group[index].getTotalScore();
		for (int i = 0; i < group.length; i++) {
			if (group[i].getTotalScore() < min) {
				min = group[i].getTotalScore();
				index = i;
			}
		}
		return group[index].getName();
	}

	// This method returns the name of the student with the highest total SAT
	// score
	public String getMax() {
		int index = 0;
		int max = group[index].getTotalScore();
		for (int i = 0; i < group.length; i++) {
			if (group[i].getTotalScore() > max) {
				max = group[i].getTotalScore();
				index = i;
			}
		}
		return group[index].getName();
	}

	// This method returns the average of all SAT scores
	public double average() {
		int sum = 0;
		for (SatStudent x : group) {
			sum += x.getTotalScore();
		}
		return (int)((double) sum / group.length * 100 ) / 100.0;
	}

	// This method displays a list of names of students who scored below 1700
	public void below1700List() {
		for (SatStudent x : group) {
			if (x.getTotalScore() < 1700)
				System.out.println(x.getName());
		}
	}

	// This method displays a list of names of students who scored above2000
	public void above2000List() {
		for (SatStudent x : group) {
			if (x.getTotalScore() > 2000)
				System.out.println(x.getName());
		}
	}

	// this method will return the total score of an inputed name.
	// return -1 if student is not found
	public int getScore(String lookfor) {
		for (SatStudent x : group) {
			if (x.getName().equals(lookfor))
				return x.getTotalScore();
		}

		return -1;
	}

	// returns an array of SatStudents with total scores > 1900
	public SatStudent[] scholarship() {

		int count = 0;
		for (SatStudent x : group) {
			if (x.getTotalScore() > 1900)
				count++;
		}
		SatStudent[] scholar = new SatStudent[count];
		int index = 0;
		for (SatStudent x : group) {
			if (x.getTotalScore() > 1900) {
				scholar[index] = x;
				index++;
			}
		}
		return scholar;
	}

	// returns a new GuidanceGroup with the SatStudents of this class combined
	// with the SatStudents of other class
	public GuidanceGroup combineGroups(GuidanceGroup other) {

		return new GuidanceGroup();
	}

	// Sorts the array of the GuidanceGroup by total score (descending)
	public void sortByTotalScore() {
		int n = group.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (group[j].getTotalScore() > group[j + 1].getTotalScore()) {
					SatStudent temp = group[j];
					group[j] = group[j + 1];
					group[j + 1] = temp;
				}
	}

	// Sorts the array of the GuidanceGroup by Name (ascending (alphabetically))
	public void sortByName() {
		int n = group.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (group[j].getName().compareTo(group[j + 1].getName()) > 0) {
					SatStudent temp = group[j];
					group[j] = group[j + 1];
					group[j + 1] = temp;
				}
	}

	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	// this method will return the average of all of the students in the
	// Scholarship category
	public double getScholarShipAverage() {
		int sum = 0;
		for (SatStudent x : scholarship()) {
			sum += x.getTotalScore();
		}
		return (int)((double) sum / scholarship().length * 100) / 100.0;
	}

	public static void main(String[] args) {
	}
}