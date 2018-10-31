/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		String test = "testing";
		System.out.println(findKeyword(test, "test", 0));
	}
	
	private static int findKeyword(String statement, String goal, int startPos)
	{
	String phrase = statement.trim();
	int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
	while (psn >= 0)
	{
	String before = " ", after = " ";
	if (psn > 0)
	{
	before = phrase.substring (psn - 1, psn).toLowerCase();
	}
	if (psn + goal.length() < phrase.length())
	{
	after = phrase.substring(psn + goal.length(),
	psn + goal.length() + 1).toLowerCase();
	}
	/* determine the values of psn, before, and after at this point in the method. */
	if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))
	&&
	((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
	{
	return psn;
	}
	psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
	}
	return -1;
	}

}
