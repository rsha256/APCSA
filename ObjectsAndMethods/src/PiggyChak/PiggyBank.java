package PiggyChak;

import java.text.DecimalFormat;

public class PiggyBank {
	private int pennies, nickels, dimes, quarters;

	public PiggyBank(int pennies, int nickels, int dimes, int quarters) {
		this.pennies = pennies;
		this.nickels = nickels;
		this.dimes = dimes;
		this.quarters = quarters;
	}

	public int getDimes() {
		return dimes;
	}

	public int getNickels() {
		return nickels;
	}

	public int getPennies() {
		return pennies;
	}

	public int getQuarters() {
		return quarters;
	}

	public double calculateAmount() {
		return Double.valueOf(new DecimalFormat("##.##")
				.format((this.quarters * 0.25) + 
						(this.dimes * 0.10) + 
						(this.nickels * 0.05) + 
						(this.pennies * 0.01)));
	}

	public void combinePiggy(PiggyBank b) {
		pennies += b.getPennies();
		nickels += b.getNickels();
		dimes += b.getDimes();
		quarters += b.getQuarters();

		b.pennies = 
		b.nickels = 
		b.dimes = 
		b.quarters = 0;
	}

	@Override
	public String toString() {
		return "The piggy bank currently contains:\n" + getPennies() + " pennies, " + getNickels() + " nickels, "
				+ getDimes() + " dimes, and " + getQuarters() + " quarters\n" + "for a total value of: $"
				+ calculateAmount();
	}
}
