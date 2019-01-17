import java.lang.System;

public class RomanNumeralRunner
{
	public static void main( String args[] )
	{
		RomanNumeral test = new RomanNumeral(10);
		System.out.println("10 is " + test.toString());

		test.setNumber(100);
		System.out.println("100 is " + test.toString());

		test.setNumber(1000);
		System.out.println("1000 is " + test.toString());

		test.setNumber(2500);
		System.out.println("2500 is " + test.toString());

		test = new RomanNumeral(1500);
		System.out.println("1500 is " + test.toString());

		test.setNumber(23);
		System.out.println("23 is " + test.toString());

		test.setNumber(38);
		System.out.println("38 is " + test.toString());

		test.setNumber(49);
		System.out.println("49 is " + test.toString());

		/*test.setRoman("LXXVII");
		System.out.println("LXXVII is " + test.getNumber() + "\n");

		test.setRoman("XLIX");
		System.out.println("XLIX is " + test.getNumber() + "\n");

		test.setRoman("XX");
		System.out.println("XX is " + test.getNumber() + "\n");

		test.setRoman("XLIX");
		System.out.println("XLIX is " + test.getNumber() + "\n");*/
	}
}
