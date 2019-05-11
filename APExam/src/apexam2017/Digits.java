package apexam2017;

import java.util.ArrayList;

public class Digits {
	private ArrayList<Integer> digitList;

	public Digits(int num) {

		digitList = new ArrayList<Integer>();
		int digit;
		int myNum = num;
		
		if (num == 0)
			digitList.add(0);

		while (myNum != 0) {
			digit = myNum % 10;
			digitList.add(0, digit);
			myNum /= 10;
		}
	}

	public boolean isStrictlyIncreasing() {
		int x = 0;

		int tmp = digitList.get(0);
		for (int i = 1; i < digitList.size(); i++) {
			if (digitList.get(i) < tmp) {
				return false;
			}
			tmp = digitList.get(i);
		}

		return true;
	}

}