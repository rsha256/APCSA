package apexam2016;

public class RandomStringChooser {

	private String[] wordArray;

	public RandomStringChooser() {
	}

	public RandomStringChooser(String[] wordArray) {
		this.wordArray = wordArray;
	}

	public String getNext() {
		if (wordArray.length == 0)
			return "NONE";
		int r = (int) (Math.random() * wordArray.length);
		String tmp = wordArray[r];
		String[] newWordArr = new String[wordArray.length-1];
		int c = 0;
		for (int i = 0; i < wordArray.length; i++) {
			if (!wordArray[i].equals(tmp)) {
				newWordArr[c] = wordArray[i];
				c++;
			}

		}
		wordArray = newWordArr;
		return tmp;
	}

	public static void main(String[] args) {
		String[] wordArray = { "wheels", "on", "the", "bus" };
		RandomStringChooser sChooser = new RandomStringChooser(wordArray);
		for (int k = 0; k < 6; k++) {
			System.out.println(sChooser.getNext() + " ");
		}
	}

}
