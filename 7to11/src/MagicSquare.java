
public class MagicSquare {
	
	public boolean ifPerfectSquare(int input) {
		int x = (int) Math.sqrt(input);
		return Math.pow(x,2) == input; 		
	}
	
	public boolean consecutiveSum(int input) {
		int sum = 0;
		for (int i = 1; i > 1; i++) {
			sum += i;
			if (sum == input) {
				i = 0; 
				return true; 
			}
		}
		return false;
	}
}
