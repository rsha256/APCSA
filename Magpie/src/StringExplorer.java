/**
 * 
 * What value is returned by indexOf if the substring does not occur in the
 * string? Answer: -1
 * 
 * A program to allow students to try out different String methods.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer {

	public static void main(String[] args) {
		String sample = "The quick brown fox jumped over the lazy dog.";

		// Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println("sample.indexOf(\"quick\") = " + position);

		// Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println("sample.toLowerCase() = " + lowerCase);
		System.out.println("After toLowerCase(), sample = " + sample);

		// Try other methods here:
		int notFoundPsn = sample.indexOf("slow");
		System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);

		System.out.println(findKeyword("She's my sister", "sister", 0));
		System.out.println(findKeyword("Brother Tom is helpful", "brother", 0));
		System.out.println(findKeyword("I can't catch wild cats.", "cat", 0));
		System.out.println(findKeyword("I know nothing about snow plows.", "no", 0));
	}

	private static int findKeyword(String statement, String goal, int startPos) {
		String phrase = statement.trim();
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
		while (psn >= 0) {
			String before = " ", after = " ";
			if (psn > 0) {
				before = phrase.substring(psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length()) {
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
			}
			/*
			 * determine the values of psn, before, and after at this point in the method.
			 * 
			 * Before: psn: 0 before: " " after: -1
			 * 
			 * At: psn: 0 before: " " after: i
			 * 
			 * After: psn: -1 before: " " after: i
			 * 
			 */
			if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0))
					&& ((after.compareTo("a") < 0) || (after.compareTo("z") > 0))) {
				return psn;
			}
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

		}
		return -1;
	}

}
