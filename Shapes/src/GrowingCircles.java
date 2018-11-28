import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class GrowingCircles extends JFrame {

	public GrowingCircles() {
		super("Concentric Circles");
		setSize(600, 600);
		setVisible(true);
	}

	public void paint(Graphics g) {
		int size = 350;
		super.paint(g);
		for (int i = 40; i <= 440; i += 20) {
			g.setColor(Color.black);
			g.drawOval(40, 40, size, size);
			size -= 5;
			try {
				Thread.currentThread();
				Thread.sleep(80);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	

	public static void main(String[] args) {
	GrowingCircles app = new GrowingCircles();
	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
