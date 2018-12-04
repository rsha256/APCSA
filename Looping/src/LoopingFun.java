import javax.management.relation.InvalidRelationServiceException;
import javax.naming.OperationNotSupportedException;

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
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	public int factorial(int n) {
		int total = 1;
		for(int i = n; i > 0; i--) {
			total *= i;
		}
		return total;
		
	}
	
	public boolean isEven(int n) {
		if (n%2 == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		LoopingFun one = new LoopingFun();
		System.out.println(one.isEven(5));
	}
}
