package guidance;

public class GuidanceGroupTester {
	public static void main(String[] args) {
		SatStudent[] temp = new SatStudent[12];

		temp[0] = (new SatStudent("Ye", 640, 695, 686));
		temp[1] = (new SatStudent("Bradley", 778, 768, 780));
		temp[2] = (new SatStudent("Chen", 687, 614, 705));
		temp[3] = (new SatStudent("Davis", 620, 534, 556));
		temp[4] = (new SatStudent("Aarons", 550, 565, 517));
		temp[5] = (new SatStudent("Gupta", 687, 720, 640));
		temp[6] = (new SatStudent("Park", 722, 721, 745));
		temp[7] = (new SatStudent("Kohl", 595, 605, 615));
		temp[8] = (new SatStudent("Mehta", 525, 637, 521));
		temp[9] = (new SatStudent("Bahl", 611, 607, 610));
		temp[10] = (new SatStudent("Smith", 670, 703, 610));
		temp[11] = (new SatStudent("Issacs", 670, 690, 710));
		GuidanceGroup becker = new GuidanceGroup(temp);
		System.out.println("BECKER GROUP");
		becker.display();

		SatStudent[] temp2 = new SatStudent[6];

		temp2[0] = (new SatStudent("Jones", 644, 695, 696));
		temp2[1] = (new SatStudent("Boomer", 778, 788, 780));
		temp2[2] = (new SatStudent("Chung", 657, 612, 705));
		temp2[3] = (new SatStudent("Addams", 627, 537, 557));
		temp2[4] = (new SatStudent("Patel", 550, 565, 577));
		temp2[5] = (new SatStudent("Garcia", 687, 720, 645));

		GuidanceGroup riley = new GuidanceGroup(temp2);
		// System.out.println( "riley group");
		// System.out.println( riley); 

		GuidanceGroup comb = becker.combineGroups(riley);
		comb.sortByName();
		System.out.println("\nALPHABETICAL LISTING");
		comb.display();
		System.out.println();

		System.out.println("LOWEST STUDENT: " + comb.getMin());
		System.out.println("HIGHEST STUDENT: " + comb.getMax());

		System.out.println("AVERAGE SCORE: " + comb.average());
		System.out.println();
		System.out.println("STUDENTS BELOW 1700");
		System.out.println("==================");
		comb.below1700List();
		System.out.println();
		System.out.println("STUDENTS ABOVE 2000");
		System.out.println("==================");
		comb.above2000List();
		System.out.println();

		comb.sortByTotalScore();
		System.out.println("ORDERED BY TOTAL SCORE");
		comb.display();
		System.out.println();

		System.out.println("SCHOLARS");
		System.out.println("========");
		SatStudent[] one = comb.scholarship();
		for (SatStudent i : one)
			System.out.println(i.getName());
		System.out.println("AVERAGE SCORE OF SCHOLARS: " + comb.getScholarShipAverage());

	}
}