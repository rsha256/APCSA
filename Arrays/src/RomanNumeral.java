public class RomanNumeral {
	private Integer number;
	private String roman;

	private final static int[] NUMBERS = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

	private final static String[] LETTERS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	public RomanNumeral(String str) {
		// setRoman(str);
	}

	public RomanNumeral(Integer orig) {
		setNumber(orig);
	}

	public void setNumber(Integer num) {
		int thousands = num % 10000 / 1000, hundreds = num % 1000 / 100, tens = num % 100 / 10, ones = num % 10;

		String temp = "";

		if (thousands != 0) {
			for (int i = 0; i < thousands; i++)
				temp += LETTERS[0];
		}

		if (hundreds != 0) {
			if (hundreds == 9) {
				temp += LETTERS[1];
				hundreds -= 9;
			}
			if (hundreds == 5) {
				temp += LETTERS[2];
				hundreds -= 5;
			}
			if (hundreds == 4) {
				temp += LETTERS[3];
				hundreds -= 4;
			}
			for (int i = 0; i < hundreds; i++)
				temp += LETTERS[4];
		}

		if (tens != 0) {
			if (tens == 9) {
				temp += LETTERS[5];
				tens -= 9;
			}
			if (tens == 5) {
				temp += LETTERS[6];
				tens -= 5;
			}
			if (tens == 4) {
				temp += LETTERS[7];
				tens -= 4;
			}
			for (int i = 0; i < tens; i++)
				temp += LETTERS[8];
		}

		if (ones != 0) {
			if (ones == 9) {
				temp += LETTERS[9];
				ones -= 9;
			}
			if (ones == 5) {
				temp += LETTERS[10];
				ones -= 5;
			}
			if (ones == 4) {
				temp += LETTERS[11];
				ones -= 9;
			}
			for (int i = 0; i < ones; i++)
				temp += LETTERS[12];
		}

		roman = temp;
	}

	/*
	 * public void setRoman(String rom) { for (int i = LETTERS.length; i >= 0; i--)
	 * { for(int j = i; )
	 * 
	 * } }
	 */

	public Integer getNumber() {
		return number;
	}

	public String toString() {
		return "Roman Number: " + roman + "\nNumber: " + number;
	}
}