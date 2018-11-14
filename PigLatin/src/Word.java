import java.util.Random;

public class Word {
	private String original;

	/**
	 * constructs a Word with String value s
	 * 
	 * @param s
	 *            is string value of Word
	 */
	public Word(String s) {
		original = s;
	}

	/**
	 * reverses letters in original string
	 * 
	 * @return a string that is a reverse of original
	 */
	public String reverse() {
		return new StringBuilder(original).reverse().toString();
	}

	/**
	 * returns the length of the string
	 */
	public int getLength() {
		/*
		 * int i = 0; for (char c : original.toCharArray()) { i++; } return i;
		 */
		return original.length();
	}

	/**
	 * determines if word is a palindrome
	 * 
	 * @return true if word is a palindrome, false otherwise
	 */
	public boolean isPalindrome() {
		for (int i = 0; i < original.length(); i++) {
			if (original.charAt(i) == original.charAt(original.length() - 1 - i)) {
			} else
				return false;
		}
		return true;
	}

	/**
	 * Alternate method to determine if word is a palindrome
	 * 
	 * @return true if word is a palindrome, false otherwise
	 */
	public boolean isPalindrome2() {
		if (original.compareTo(reverse()) == 0) {
			return true;
		}
		return false;
	}

	/**
	 * removes vowels in original string
	 * 
	 * @return a string that removes all of the vowels
	 */
	public String removeVowels() {
		String rString = "";
		char[] temp = original.toCharArray();
		for (char c : temp) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
			} else {
				rString = rString + c;
			}
		}
		return rString;
	}

	/**
	 * creates an anagram
	 * 
	 * @return a string that is a random anagram of the original word
	 */
	public void anagram() {
//		Random rdn = new Random();
//		String xString = "";
//		int len = original.length();
//
//		for (int i = 0; i < len; i++) {
//			xString = xString + original.charAt(x);
//		}
//		
//		return xString;

		char[] a = original.toCharArray();
		int i = 0;
		
		if (i == a.length-1)  printArray(a);
		else {
			for (int j=i; j< a.length; j++) {
				//swap a[i] with a[j]
				char c = a[i]; 
				a[i] = a[j]; 
				a[j] = c;
				makeAnagram(a, i+1);
				//swap back
				c = a[i]; 
				a[i] = a[j]; 
				a[j] = c;
			}
		}
		
		// String anagram = "";
		//
		// for (int i = 0; i < this.original.length();) {
		// Integer r = rdn.nextInt(this.original.length());
		// if (!usedIndexes.contains(r)) {
		// anagram += this.original.charAt(r);
		// usedIndexes.add(r);
		// i++;
		// }
		// }
		//
		// return anagram;

	}
	static void makeAnagram(char[] a, int i) {
		//System.out.println("MakeAnagram i=" + i); //for debug
		if (i == a.length-1)  printArray(a);
		else {
			for (int j=i; j< a.length; j++) {
				//swap a[i] with a[j]
				char c = a[i]; 
				a[i] = a[j]; 
				a[j] = c;
				makeAnagram(a, i+1);
				//swap back
				c = a[i]; 
				a[i] = a[j]; 
				a[j] = c;
			}
		}
	}//end of makeAnagram
	
	//print an array
	static void printArray(char [] a) {
		for (int i=0; i< a.length; i++) System.out.print(a[i]); 
		System.out.println();
	}

}
