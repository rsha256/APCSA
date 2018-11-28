import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Boxes extends JFrame {

	public Boxes() {
		super("Concentric Circles");
		setSize(800, 800);
		setVisible(true);
	}

	public void paint(Graphics g) {
		final int SIZE = 40;
		int count = 0;
		super.paint(g);
		for (int i = 20; i <= 440; i += 20) {
			count++;
				g.setColor(Color.black);
			g.drawRect(i+i, i+i, SIZE, SIZE);
			try {
				Thread.currentThread();
				Thread.sleep(80);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	

	public static void main(String[] args) {
	Boxes app = new Boxes();
	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
