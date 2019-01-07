import java.util.Arrays;

public class ArrayExample {
	private int[] numbArray;

	// 1. Constructs a default array of size 10
	public ArrayExample() {
		numbArray = new int[10];
		numbArray[0] = 1;
		numbArray[1] = 3;
		numbArray[2] = 7;
		numbArray[3] = 19;
		numbArray[4] = 15;
		numbArray[5] = 19;
		numbArray[6] = 7;
		numbArray[7] = 3;
		numbArray[8] = 19;
		numbArray[9] = 48;
	}

	// 2. Constructs an array of random numbers (0-24) array of size count
	public ArrayExample(int count) {
		for (int i = 0; i < count; i++) {
			numbArray[i] = (int) (Math.random() * 24) + 1;
		}
	}

	// 3. This method prints all of the elements of the array in list form
	public void display() {
		for (int x : numbArray) {
			System.out.println(x);
		}
	}

	// 4. This method prints all of the elements in reverse order
	public void displayReverse() {
		for (int i = numbArray.length - 1; i >= 0; i--) {
			System.out.println(numbArray[i]);
		}

	}

	// 5. This method calculates and returns the average of all of the elements
	// The average of the default array is 14.1
	public double average() {
		int tot = 0;
		for (int i : numbArray) {
			tot += i;
		}
		return tot / numbArray.length;
	}

	// 6. This method returns the maximum value of all of the elements
	// The max of the default array is 48.
	public int findMax() {
		int max = numbArray[0];
		for (int x : numbArray) {
			if (max < x)
				max = x;
		}
		return max;
	}

	// 7. This method returns the index number of the first instance of int lookFor
	// returns -1 if not in the list
	// ex. Using the default array findIndex(15) will return 4
	public int linearSearch(int lookFor) {
		for (int x = 0; x < numbArray.length; x++) {
			if (lookFor == numbArray[x])
				return x;
		}
		return -1;
	}

	/**
	 * 8. This method will print the elements and the tally. The list with the
	 * default constructor will be Number Frequency 1 1 3 2 7 2 15 1 19 3 48 1
	 */
	public void tallyList() {

		int unique = 0;
		for (int i = 0; i < numbArray.length; i++) {
			for (int j = i + 1; j < numbArray.length; j++)
				if (numbArray[i] != numbArray[j])
					unique++;

		}
		int[] tally = new int[unique];

		int count = 0;
		for (int x : numbArray) {

		}
	}

	/**
	 * 9. This method will print a column of numbers in the original order, a column
	 * of numbers in reverse order, and the average of the two. default constructor
	 * will be LIST REVERSE AVERAGE 1 48 24.5 3 19 11.0 3 19 11.0 7 19 13.0 7 15
	 * 11.0 15 7 11.0 19 7 13.0 19 3 11.0 19 3 11.0 48 1 24.5
	 */
	public void listReverseAvg() {

	}

	// 10. This method will sort the array in ascending order
	//
	public void sort() {
		Arrays.sort(numbArray);
	}

	// 11. Binary Search.
	// This method returns the index number of the first instance of int lookFor and
	// returns -1 if not in the list. The Array must be sorted to use the Binary
	// search.
	// ex. Using the default array findIndex(15) will return 4
	public int binarySearch(int lookFor) {
		// return Arrays.binarySearch(numbArray, lookFor);
		sort();
		int middle = numbArray.length / 2;
		int bottom = numbArray[0];
		int top = numbArray[numbArray.length - 1];
		while (bottom <= top) {
			if (lookFor == numbArray[middle])
				return middle;
			else {
				if (lookFor < middle)
					top = middle - 1;
				else
					bottom = middle + 1;
			}
		}
		return -1;
	}
	// 12. Write a tester that will create a random array of size 50
	// and test all of these methods

	public static void main(String[] args) {

	}

}