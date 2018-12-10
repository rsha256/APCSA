import static java.lang.System.*;

public class TenToAny {
	private int base10;
	private int newBase;

	public TenToAny(int base10, int newBase) {
		this.base10 = base10;
		this.newBase = newBase;
	}

	public void setBase10(int base10) {
		this.base10 = base10;
	}

	public void setNewBase(int newBase) {
		this.newBase = newBase;
	}

	public String getNewNum() {
		String newNum = "";
		return newNum;
	}

	@Override
	public String toString() {
		return "Your number in base" + newBase + " is: " + Integer.toString(base10, newBase);
	}

}
