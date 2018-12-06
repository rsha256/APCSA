import java.awt.Image;

public class LoopingFun {
	public void printFactors(int i) {
		for (int j = 1; j < i; j++) {
			if (i % j == 0) {
				System.out.println(j + " and " + i / j + " are factors of " + i);
			}
		}
	}

	public int sumInts(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public int factorial(int n) {
		int total = 1;
		for (int i = n; i > 0; i--) {
			total *= i;
		}
		return total;

	}

	public boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		}
		return false;
	}

	public int lcm(int a, int b) {
		for (int i = 1; i <= b; i++) {
			if ((b * i) % a == 0) {
				return b * i;
			}
		}
		return a * b;
	}

	public int gcf(int a, int b) {
		int factor = 1;
		for (int i = 2; i <= Math.min(a, b); i++) {
			if (((a % i) == 0) && ((b % i) == 0)) {
				if (i > factor) {
					factor = i;
				}
			}
		}
		return factor;
	}

	public int sumDigits(int n) {
		String num = Integer.toString(n);
		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			sum += Integer.valueOf(num.substring(i, i + 1));
		}
		return sum;
	}

	public boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int reverseNum(int n) {
		String num = Integer.toString(n);
		String res = "";
		for (int i = num.length() - 1; i >= 0; i--) {
			res += num.charAt(i);
		}
		return Integer.valueOf(res);
	}
	
	public String coinTrials(int n) {
		int heads = 0;
		int tails = 0;
		for (int i = 0; i < n; i++) {
			if(Math.random()* 3 + 1 == 1) {
				heads += 1;
			}
			else {
				tails += 1;
			}
		}
		return "Heads: " + heads + "\nTails: " + tails;
	}

	public static void main(String[] args) {
		LoopingFun one = new LoopingFun();
		System.out.println(one.coinTrials(10));
	}
}
