import java.util.Arrays;

public class CombineArrays {

	// displays the array
	public static void display(int[] a) {
		System.out.print("Array = [");
		String p1 = "";
		for (int x : a) {
			p1 += x + ", ";
		}
		System.out.print(p1.substring(0, p1.length() - 2) + "]\n");
	}

	// returns a new array where b is appended to the end of a
	public static int[] append(int[] a, int[] b) {
		int[] newArray = new int[a.length + b.length];
		for (int i = 0; i < newArray.length; i++) {
			if (i < a.length) {
				newArray[i] = a[i];
			} else
				newArray[i] = b[i - a.length];
		}
		return newArray;
	}

	// returns a new array with alternating values from a and b
	// (question: does it matter if the arrays have different lengths?
	public static int[] alternate(int[] a, int[] b) {
		int[] newArray = new int[a.length + b.length];
		int k = 0, j = 0;
		int[] min;
		int x;
		if (a.length < b.length) {
			min = new int[a.length];
			x = 0;
		} else {
			min = new int[b.length];
			x = 1;
		}

		for (int i = 0; i < 2 * min.length; i++) {
			if (i % 2 == 0) {
				newArray[i] = a[k];
				k++;
			} else {
				newArray[i] = b[j];
				j++;
			}
		}
		for (int i = 0; i < newArray.length - 2 * min.length; i++) {
			if (x == 1) {
				newArray[2*min.length + i] = a[b.length + i];
			} else {
				newArray[2*min.length + i] = b[a.length + i];
			}
		}
		return newArray;
	}

	// returns a new ordered array
	// prerequisite a and b must be ordered
	public static int[] merge(int[] a, int[] b) {
		int[] newArray = alternate(a, b);
		Arrays.sort(newArray);
		return newArray;
	}
	
	public static void randomInt() {
		int [] x = new int[75];
		int odd = 0, even = 0;
		for (int i=0; i<x.length; i++) {
			x[i] = (int)(Math.random() * 1001) + 1000;  
			if (x[i] % 2 ==0)
				even++;
			else
				odd++;
		}
		
		System.out.println("Even: " + even + "\nOdd: " + odd);
	
	}
	
// 1st 20 prime numbers
	public static void main(String[] args) {
		int[] a = new int[] { 1, 4, 9, 16, 25, 36, 49, 64, 81, 100 };
		int[] b = new int[] { 3, 10, 11, 12, 21, 26 };
//		System.out.println("APPEND");
//		display(append(a, b));
//		System.out.println();
//		System.out.println("ALTERNATE");
//		display(alternate(b, a));
//		System.out.println();
//		System.out.println("MERGE");
//		display(merge(b, a));
		randomInt();
	}
}