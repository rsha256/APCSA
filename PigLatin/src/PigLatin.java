public class PigLatin {
	public static void main(String[] args) {
		System.out.println(translate("test says rahul"));
	}
	public static String translate(String englishWord) {
		String temp = englishWord;
		String[] englishWordBySpaces = temp.split(" ");
		String[] pigLatinWord = new String[englishWord.length()];
		
		int counter = 0;
		
		for (String s : englishWordBySpaces) {
			pigLatinWord[counter] = lTranslate(s);
			counter++;
		}
		String returnString = "";
		for(String x : pigLatinWord) {
			if (x != null)
			  returnString = returnString + " " + x; 
		}
		return returnString.substring(1); 
	}
	
	public static int min(int a, int b) {
		if(a == -1) {
			a = Integer.MAX_VALUE;
		}
		if(b == -1) {
			b = Integer.MAX_VALUE;
		}
		return Math.min(a, b);
	}
	
	public static String lTranslate(String englishWord) {
		englishWord = englishWord.toLowerCase();
		if (!(englishWord.contains("a") ||
				englishWord.contains("e") || 
				englishWord.contains("i") || 
				englishWord.contains("o") ||
				englishWord.contains("u"))) {
			return (englishWord.charAt(0)+"").toUpperCase() + englishWord.substring(1) + "ay";
		}
		else if(englishWord.charAt(0) == 'a' ||
				englishWord.charAt(0) == 'e' || 
				englishWord.charAt(0) == 'i' || 
				englishWord.charAt(0) == 'o' ||
				englishWord.charAt(0) == 'u') {
			return (englishWord.charAt(0)+"").toUpperCase() + englishWord.substring(1) + "way";
		}
		else if((englishWord.contains("a") ||
				englishWord.contains("e") || 
				englishWord.contains("i") || 
				englishWord.contains("o") ||
				englishWord.contains("u")) && !(englishWord.charAt(0) == 'a' ||
				englishWord.charAt(0) == 'e' || 
				englishWord.charAt(0) == 'i' || 
				englishWord.charAt(0) == 'o' ||
				englishWord.charAt(0) == 'u')) {
			int aFirstVowel = englishWord.indexOf('a');
			int eFirstVowel = englishWord.indexOf('e');
			int iFirstVowel = englishWord.indexOf('i');
			int oFirstVowel = englishWord.indexOf('o');
			int uFirstVowel = englishWord.indexOf('u');
			
			int firstVowel = min(min(min(min(aFirstVowel, eFirstVowel), iFirstVowel), oFirstVowel), uFirstVowel);
			String start = englishWord.substring(0, firstVowel);
			String end = englishWord.substring(firstVowel);
			
			if(Character.isUpperCase(englishWord.charAt(0))) {
				start = start.toLowerCase();
				end = (end.charAt(0)+"").toUpperCase() + englishWord.substring(1);
			} 
			
			return end + start + "ay";
		}
		else {
			return englishWord + " couldn't be translated!";
		}
	}
	
}
