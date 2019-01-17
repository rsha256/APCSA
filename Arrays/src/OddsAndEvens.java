
public class OddsAndEvens {
	private int[] arr = { 2, 3, 5, 5, 2, 3, 9, 1, 7, 4 };

	int howManyOdd() {
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1)
				x++;
		}
		return x;
	}

	int howManyEven() {
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				x++;
		}
		return x;
	}

	int[] oddArray() {
		int[] odd = new int[howManyOdd()];
		int lowest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				odd[lowest] = arr[i];
				lowest++;
			}
		}
		return odd;
	}

	int[] evenArray() {
		int[] even = new int[howManyEven()];
		int lowest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even[lowest] = arr[i];
				lowest++;
			}
		}
		return even;
	}

	public double average(int[] numbArray) {
		double tot = 0;
		for (int i : numbArray) {
			tot += i;
		}
		return tot / numbArray.length;
	}

	public int sum(int[] numbArray) {
		int sum = 0;
		for (int i : numbArray) {
			sum += i;
		}
		return sum;
	}

	public void display(int[] odd, int[] even) {
		System.out.print("Odd = [");
		String p1 = "";
		for (int x : odd) {
			p1 += x + ", ";
		}
		System.out.print(p1.substring(0, p1.length() - 2) + "]\n");

		System.out.print("Even = [");
		String p2 = "";
		for (int x : even) {
			p2 += x + ", ";
		}
		System.out.print(p2.substring(0, p2.length() - 2) + "]\n");
	}

	public static void main(String[] args) {
		OddsAndEvens one = new OddsAndEvens();
		System.out.println("Number of odd: " + one.howManyOdd());
		System.out.println("Number of even: " + one.howManyEven());
		one.display(one.oddArray(), one.evenArray());
		System.out.println("Even average: " + one.average(one.evenArray()) + "\nEven sum: " + one.sum(one.evenArray())
				+ "\nOdd Average: " + one.average(one.oddArray()) + "\nOdd Sum: " + one.sum(one.oddArray()));

	} 
}
