import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class LineArt extends JFrame {
	
	public LineArt() {
		super("LineArt");
		setSize(600, 600);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		int size = 10;
		int count = 0;
		super.paint(g);
		for (int i = 500; i > 0; i -= 100) {
			count++;
			g.setColor(Color.red);
			g.drawLine(0, i, i, i);
		}
	}
	
	public static void main(String[] args) {
		LineArt art = new LineArt();
		art.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	

}
