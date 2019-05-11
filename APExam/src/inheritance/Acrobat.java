package inheritance;

public class Acrobat extends Dancer {
	public void act() {
		super.act();
		System.out.print(" flip");
	}
	
	public void doTrick() {
		System.out.print(" somersault");
	}
}
