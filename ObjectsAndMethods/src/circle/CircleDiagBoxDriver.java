package circle;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class CircleDiagBoxDriver {
	public static void main(String[] args) {
		// Shows a message dialog box
		JOptionPane.showMessageDialog(new JFrame(), "Instantiate a Circle?",
				"JOptionPane Examples",
				JOptionPane.INFORMATION_MESSAGE);
		// changes the color of the input dialog box
		UIManager.put("OptionPane.background", Color.red);
		UIManager.put("Panel.background", Color.green);
		// Input radius as a text in dialog box
		String radText = JOptionPane.showInputDialog(
				"What is the radius of your circle?");
		// convert radius to an double
		double radDoub = Double.parseDouble(radText);
		// Instantiate Circle
		Circle four = new Circle(radDoub);
		// Print object in dialog box
		JOptionPane.showMessageDialog(null, four);
		//
	}
}
