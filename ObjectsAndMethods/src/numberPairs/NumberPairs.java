package numberPairs;

public class NumberPairs {
	// declare the fields / instance variables "num1, num2, and sum"
	private double num1, num2, sum;

	// Code the default constructor
	public NumberPairs() {
		
	}

	// Code the overloaded constructor that takes two numbers as parameters (not
	// the sum)
	public NumberPairs(double n1, double n2) {
		num1 = n1;
		num2 = n2;
		this.computeSum();
	}	
	
	public NumberPairs(NumberPairs other, NumberPairs other2) {
		this.num1 = other.num1 + other2.num1;
		this.num2 = other.num2 + other2.num2;
		computeSum();
	}
	
	public static NumberPairs twoTogether(NumberPairs n1, NumberPairs n2) {
		double num1 = n1.num1 + n2.num1;
		double num2 = n1.num2 + n2.num2;
		
		return new NumberPairs(num1, num2);
	} 

	// GETTERS
	public double getNum1() {
		return num1;
	}
	public double getNum2() {
		return num2;
	}
	public double getSum() {
		return sum;
	}
	
	// Code a mutator to change the values in the numberPairs.NumberPairs object
	public void setNums(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		computeSum();
	}

	// Code a mutator that computes the sum, but does not print it out
	public void computeSum() {
		sum = num1 + num2;
	}

	// Code a toString method that returns the numbers and their sum
	@Override
	public String toString() {
		return getNum1() + " + " + getNum2() + " == " + getSum();
	}

	// EXTENSION - CAN YOU DO IT?
	// Code a mutator that adds the second NumberPair to increase the first.
	public void combine(NumberPairs other) {
		this.num1 = this.num1 + other.num1;
		this.num2 = this.num2 + other.num2;
		computeSum();
	}
	
	// EXTENSION - CAN YOU DO IT?
	// Create a new numberPairs.NumberPairs object from the sum of two others
	
	
	public static void main(String[] args) {
		NumberPairs one = new NumberPairs();
		one.setNums(5, 5);
		NumberPairs two = new NumberPairs(90, 100.0);
		
		
/*		// EXTENSION 2
		NumberPairs eleven = new NumberPairs(one, two);
		System.out.println(eleven);
		
		NumberPairs three = new NumberPairs(100.5, 85.8);
		NumberPairs four = new NumberPairs(-100, 55);
		NumberPairs five = new NumberPairs(15236, 5642);
		NumberPairs six = new NumberPairs(1000, 555);
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
		System.out.println(six);
		
		// EXTENSION 1
		one.combine(two);
		System.out.println(one);*/

		System.out.println();
		System.out.println(one);
		System.out.println(two);
		
		NumberPairs three = twoTogether(one, two);
		
		System.out.println(three);
		
		NumberPairs four = twoTogether(one, three);
		System.out.println(four);

	}

}
