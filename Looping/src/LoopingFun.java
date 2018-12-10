public class LoopingFun {
	/**
	 * 1 String printFactors(int n)
	 * 
	 * Lists the factors of an Integer n.
	 * 
	 */
	public void printFactors(int i) {
		for (int j = 1; j < i; j++) {
			if (i % j == 0) {
				System.out.println(j + " and " + i / j + " are factors of " + i);
			}
		}
	}

	/**
	 * 2 int sumInts(int n)           
	 * 
	 * Calculates the sum of the positive integers less than and including n: n+(n-
	 * 1)+(n-2)+...+3+2+1.
	 * 
	 */
	public int sumInts(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	/**
	 * 3 long factorial(int n)          
	 * 
	 * Calculates the value of n! (factorial): n*(n-1)*(n-2)*...*3*2*1.
	 * 
	 */
	public int factorial(int n) {
		int total = 1;
		for (int i = n; i > 0; i--) {
			total *= i;
		}
		return total;

	}

	/**
	 * 4 boolean isEven(int n)
	 * 
	 * Test integer n for evenness. Return true if even. Return false if odd.
	 * 
	 */
	public boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		}
		return false;
	}

	/**
	 * 5 boolean isPrime(int n)           
	 * 
	 * Test integer n for prime or not prime
	 * 
	 */
	public boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 6 int lcm(int a, int b)
	 * 
	 * Returns the least common multiple of integers a, b)
	 * 
	 */
	public int lcm(int a, int b) {
		for (int i = 1; i <= b; i++) {
			if ((b * i) % a == 0) {
				return b * i;
			}
		}
		return a * b;
	}

	/**
	 * 7 int gcf(int a, int b)
	 * 
	 * Returns the greatest common factor of integers a, b
	 * 
	 */
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

	/**
	 * 8 int sumDigits(int n)
	 * 
	 * Calculates the sum of the digits of int n
	 * 
	 */
	public int sumDigits(int n) {
		String num = Integer.toString(n);
		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			sum += Integer.valueOf(num.substring(i, i + 1));
		}
		return sum;
	}

	/**
	 * 9 void primeNumberList(int n)           
	 * 
	 * Lists the prime numbers less than or equal to n
	 * 
	 */
	public void primeNumberList(int n) {
		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + ", ");
			}
		}
		System.out.print(".");
		System.out.println();
	}

	/**
	 * 9 int reverseNum(int n)
	 * 
	 * Forms a new number that is the reverse of this number.
	 * 
	 */
	public int reverseNum(int n) {
		String num = Integer.toString(n);
		String res = "";
		for (int i = num.length() - 1; i >= 0; i--) {
			res += num.charAt(i);
		}
		return Integer.valueOf(res);
	}

	/**
	 * 10 void coinTrials(int n)
	 * 
	 * Returns the results(totals) of a simulation experiment of n trials of a coin
	 * toss: ie (for n = 100). Heads: 47 Tails: 53
	 * 
	 */
	public String coinTrials(int n) {
		int heads = 0;
		int tails = 0;
		for (int i = 0; i < n; i++) {
			if (Math.random() * 3 + 1 == 1) {
				heads += 1;
			} else {
				tails += 1;
			}
		}
		return "Heads: " + heads + "\nTails: " + tails;
	}

	/**
	 * 11 int countDigits(int n)
	 * 
	 * counts the digits an integer n
	 * 
	 */
	public int countDigits(int n) {
		String x = n + "";
		return x.length();
	}

	/**
	 * 12 void fibonacci(int n)
	 * 
	 * Lists the first n terms of the fibonacci sequence 1,1,2,3,5,8,13,...
	 * 
	 */
	public void fibonnaci(int n) {
		if (n == 1) {
			System.out.println(1);
		}
		if (n == 2) {
			System.out.println("1,1");
		} else {
			System.out.println();
		}

	}

	/**
	 * 13 boolean isPerfect(int n)
	 * 
	 * Determines if this number is perfect (sum of proper factors = number) 6 is a
	 * Perfect number 6 = 1+2+3
	 * 
	 */
	public boolean isPerfect(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if ((n % i) == 0) {
				sum += i;
			}
		}
		return (sum == (2 * n));
	}

	/**
	 * 14 void primeFactorization(int n)
	 * 
	 * Lists the prime factorization on integer n
	 * 
	 */
	public void primeFactorization(int n) {
		for (int j = 1; j < n; j++) {
			if (n % j == 0) {
				System.out.println(j + " and " + n / j + " are factors of " + n);
			}
		}
	}

	/**
	 * 15 int binary(int n)
	 * 
	 * Returns the binary (Base 2) equivalent on integer n:
	 * 
	 */
	public int binary(int n) {
		return Integer.parseInt(Integer.toString(n, 2));
	}

	/**
	 * 16 void pyramid(int n) 
	 * 
	 *    *
	 *   * *
	 *  * * *
	 * 
	 */
	public void pyramid(int n) {
		int s = n - 1;
		for (int row = 0; row < n; row++) {

			for (int i = 0; i <= s; i++) {
				System.out.print(" ");
			}

			s--;

			for (int i = 0; i <= (2 * row); i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		LoopingFun one = new LoopingFun();
		one.pyramid(2);
	}
}
