import java.awt.Color;
import java.awt.Graphics;
import java.util.*;
import java.awt.*;
import javax.swing.JFrame;

public class BullseyeLoop extends JFrame {
	public static void main(String[] args) {
		new BullseyeLoop().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void pause(int milliseconds) {
		try {
			Thread.currentThread();
			Thread.sleep(80);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public BullseyeLoop() {
		super("Concentric Circles");
		setSize(600, 600);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		int size = 500;
		int count = 0;
		super.paint(g);
		for (int i = 40; i <= 600; i += 20) {
			count++;
			if (count % 2 == 0)
				g.setColor(Color.black);
			else
				g.setColor(Color.red);
			g.fillOval(i,i,size,size);
			size -= 40;
		}
	}

}
