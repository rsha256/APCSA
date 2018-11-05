/** 
 * Input:
 * My mother and I talked last night.
 * Response: 
 * Tell me more about your family.
 * 
 * Input:
 * I said no!
 * Response: 
 * Why so negative?
 *
 * Input:
 * The weather is nice.
 * Response: 
 * Interesting, tell me more.
 * 
 * Input:
 * Do you know my brother?
 * Response: 
 * Why so negative?
 * 
 * <table>
 * <tr>
 *   <th>Keyword</th>
 *   <th>Response</th>
 * </tr>
 * <tr>
 *   <td>school</td>
 *   <td>Tell me more about your school life.</td>
 * </tr>
 * <tr>
 *   <td>food</td>
 *   <td>What did you have for breakfast today?</td>
 * </tr>
 * <tr>
 *   <td>java</td>
 *   <td>That sounds like a good programming language to start off with.</td>
 * </tr>
 * </table>
 * 
 * 
 * Our program prioritizes by which if statement is first  - we can prioritize by putting an if statement on top of another one.
 * 
 * What happens when a keyword is included in another word? Consider statements like "I know
 * all the state capitals" and "I like vegetables smothered in cheese." Explain the problem with the
 * responses to these statements.
 * 
 * The statements have letters that make up words that are used in an if statement so they return statements that do not make sense in the given context.
 * 
 * */

/**
 * A program to carry on conversations with a human user. This is the initial
 * version that:
 * <ul>
 * <li>Uses indexOf to find strings</li>
 * <li>Handles responding to simple words and phrases</li>
 * </ul>
 * This version uses a nested if to handle default responses.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2 {
	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0) {
			response = "Tell me more about your pets.";
		} else if (statement.indexOf("Mr. Scarpitta") >= 0) {
			response = "He sounds like a good teacher.";
		} else if (statement.trim().equals("")) {
			response = "Say something, please.";
		} else if (statement.indexOf("mother") >= 0 || statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0 || statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else if (statement.indexOf("school") >= 0) {
			response = "Tell me more about your school life.";
		} else if (statement.indexOf("food") >= 0) {
			response = "What did you have for breakfast today?";
		} else if (statement.indexOf("Java") >= 0 || statement.indexOf("java") >= 0) {
			response = "That sounds like a good programming language to start off with.";
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "I know what you mean.";
		} else if (whichResponse == 3) {
			response = "I'm not sure about that.";
		} else if (whichResponse == 4) {
			response = "I guess so.";
		} else if (whichResponse == 5) {
			response = "You don't say.";
		}

		return response;
	}
}
