import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class OpticalIllusion extends JFrame {

	public OpticalIllusion() {
		super("Optical Illusion");
		setSize(800, 800);
		setVisible(true);
	}

	public void paint(Graphics g) {
		g.fillRect(0, 0, getWidth(), getHeight());
		int size = 40;
		int count = 0;
		super.paint(g);
		for (int i = 40; i < 700; i += 60) {
			for (int j = 40; j < 700; j += 60) {
				count++;
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
