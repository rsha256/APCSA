public class Fruit {

	private String[] bowl;

	public Fruit() {
		bowl = new String[10]; // immutable
		bowl[0] = "apple";
		bowl[1] = "banana";
		bowl[2] = "kiwi";
		bowl[3] = "lemon";
		bowl[4] = "lime";
		bowl[5] = "mango";
		bowl[6] = "orange";
		bowl[7] = "pear";
		bowl[8] = "pineapple";
		bowl[9] = "plum";

	}

	public void deleteFruit(String del) {
		int index = 0;
		// look for value and store index#
		for (int i = 0; i < bowl.length; i++) {
			if (bowl[i].equals(del)) index = i; 
		}
		
		int x = 0;
		// replace that value with next value. Repeat until end
		for (int i = 0; i < bowl.length; i++) {
			if(x == 1) {
				bowl[i] = bowl[i + 1];
			}
			else if (bowl[i].equals(bowl[index])) {
				bowl[i] = bowl[index + 1];
				x++;
			}
		}
		// create a smaller temporary array and copy
		// all values into the temp array
		String[] temp = new String[bowl.length-1];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = bowl[i];
		}
		
		// replace the original bowl array
		// with the temp array
		bowl = temp;
	}

	public void addFruit(String other) {
		// create a new temporary array
		// increase size by one over bowl

		// copy values from bowl into the temp array

		// Find the &#39;right index to insert&#39; the &quot;other&quot; item
		// Move elements down starting at the bottom of the list
		// until you get down to the &#39;right index to insert&#39;

		// Insert the &quot;other&quot; item into the correct spot

		// replace the original bowl array
		// with the temp array
	}

	void display() {
		for (int i = 0; i < bowl.length; i++) {
			System.out.println(bowl[i]);
		}
	}

	void display2() {
		for (String string : bowl) {
			System.out.println(string);
		}
	}

	void printEveryOther() {
		int counter = 0;
		for (String string : bowl) {
			if (counter % 2 == 0)
				System.out.println(string);
			counter++;
		}
	}

	void displayReverse() {
		/*
		 * for (int i = bowl.length - 1; i >= 0; i--) { System.out.println(bowl[i]); }
		 */
		String[] bowl2 = new String[bowl.length];
		int counter = 0;
		for (String string : bowl) {
			bowl2[bowl.length - 1 - counter] = string;
			counter++;
		}
		for (String i : bowl2) {
			System.out.println(i);
		}
	}

	void getLongestFruit() {
		String lString = bowl[0]; // assume element 1 is the longest
		for (String string : bowl) {
			if (string.length() > lString.length()) {
				lString = string;
			}
		}
		System.out.println(lString);
	}

	void getLongestFruit2() {
		String lString = bowl[0]; // assume element 1 is the longest
		for (int i = 0; i < bowl.length; i++) {
			if (bowl[i].length() > lString.length()) {
				lString = bowl[i];
			}
		}
		System.out.println(lString);
	}

	public String getFirstAlph() {
		String firstAlp = bowl[0];
		for (String fruit : bowl) {
			if (fruit.toLowerCase().compareTo(firstAlp) < 0) {
				firstAlp = fruit.toLowerCase();
			}
		}
		return firstAlp;
	}

	void initials() {
		for (String string : bowl) {
			System.out.println(string.charAt(0));
		}
	}

	String get(int x) {
		if (bowl.length <= x)
			return "Index too high";
		return bowl[x];
	}

	void lengths() {
		for (String string : bowl) {
			System.out.println("Length of " + string + " is: " + string.length());
		}
	}

	public static void main(String[] args) {
		Fruit one = new Fruit();
		one.initials();
		System.out.println(one.get(5));
		one.lengths();
	}
}
