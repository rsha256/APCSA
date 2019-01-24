package guidance;

public class SatStudent {
	public String name;
	public int math;
	public int verbal;
	public int writing;
	public int grade;

	public SatStudent() {
		this("Andersson", 670, 680, 700);
	}

	public SatStudent(String name, int math, int verbal, int writing) {
		this.name = name;
		this.math = math;
		this.verbal = verbal;
		this.writing = writing;
		this.grade = math + verbal + writing;
	}

	public String getName() {
		return name;
	}

	public int getTotalScore() {
		return grade;
	}
}