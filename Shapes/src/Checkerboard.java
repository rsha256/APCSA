import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Checkerboard extends JFrame {

	public Checkerboard() {
		super("Shapes");
		setSize(450, 450);
		setVisible(true);
	}

	public void paint(Graphics g) {
		int size = 40;
		int count = 0;
		super.paint(g);
		for (int i = 40; i < 400; i += 40) {
			for (int j = 40; j < 400; j += 40) {
				count++;
				if (count % 2 == 0)
					g.setColor(Color.red);
				else
					g.setColor(Color.black);
				g.fillRect(i, j, size, size);
				try {
					Thread.currentThread();
					Thread.sleep(80);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

	public static void main(String[] args) {
		OpticalIllusion app = new OpticalIllusion();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
