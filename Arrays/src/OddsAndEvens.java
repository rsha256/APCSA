
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

	public void display(int[] odd, int [] even) {
		System.out.print("Odd = [");
		for (int x : odd) {
			System.out.print(x + ", ");
		}
		System.out.print("]\n");
		
		System.out.print("Even = [");
		for (int x : even) {
			System.out.print(x + ", ");
		}
		System.out.print("]\n");
	}

	public static void main(String[] args) {
		OddsAndEvens one = new OddsAndEvens();
		System.out.println("Number of odd: " + one.howManyOdd());
		System.out.println("Number of even: " + one.howManyEven());
		one.display(one.oddArray(), one.evenArray());
	
		
	}
}
