package PiggyChak;
/*import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

// JavaFX > Swing

public class BankTesterDialogBox extends Application {

    private TextField pennies;
    private TextField nickels;
    private TextField dimes;
    private TextField quarters;
    private TextField totalPayment;
    private Button calculate;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Piggy Bank Tester");

        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(gridPane, 800, 500);

        gridPane.add(new Label("Pennies:"), 0, 0);
        gridPane.add(new Label("Nickels:"), 0, 1);
        gridPane.add(new Label("Dimes:"), 0, 2);
        gridPane.add(new Label("Quarters:"), 0, 3);

        pennies = new TextField();
        gridPane.add(pennies, 1, 0);
        pennies.setAlignment(Pos.BOTTOM_RIGHT);

        nickels = new TextField();
        gridPane.add(nickels, 1, 1);
        nickels.setAlignment(Pos.BOTTOM_RIGHT);

        dimes = new TextField();
        gridPane.add(dimes, 1, 2);
        dimes.setAlignment(Pos.BOTTOM_RIGHT);

        quarters = new TextField();
        gridPane.add(quarters, 1, 3);
        quarters.setAlignment(Pos.BOTTOM_RIGHT);

        calculate = new Button("Calculate");
        gridPane.add(calculate, 1, 5);
        GridPane.setHalignment(calculate, HPos.RIGHT);

        calculate.setOnAction(
                e -> {
                    PiggyBank p1 = new PiggyBank(
                            Integer.parseInt(pennies.getText()),
                            Integer.parseInt(nickels.getText()),
                            Integer.parseInt(dimes.getText()),
                            Integer.parseInt(quarters.getText())
                    );

                    gridPane.add(new Label(p1.toString()), 0, 5);
//                    System.out.println(p1);
                }
        );

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
*/
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class BankTesterDialogBox {
	public static void main(String[] args) {
		// Shows a message dialog box
		JOptionPane.showMessageDialog(new JFrame(), "Piggy Bank",
				"JOptionPane Examples",
				JOptionPane.INFORMATION_MESSAGE);
		// changes the color of the input dialog box
		UIManager.put("OptionPane.background", Color.red);
		UIManager.put("Panel.background", Color.green);
		// Input radius as a text in dialog box
		String radText = JOptionPane.showInputDialog(
				"How many pennies for PiggyBank?");
		// convert radius to an double
		int pennies = Integer.parseInt(radText);
		String radText2 = JOptionPane.showInputDialog(
				"How many nickels for PiggyBank?");
		// convert radius to an double
		int nickels = Integer.parseInt(radText);
		String radText3 = JOptionPane.showInputDialog(
				"How many dimes for PiggyBank?");
		// convert radius to an double
		int dimes = Integer.parseInt(radText);
		// Instantiate piggy bank
		String radText4 = JOptionPane.showInputDialog(
				"How many pennies for PiggyBank?");
		// convert radius to an double
		int quarters = Integer.parseInt(radText);
        PiggyBank p1 = new PiggyBank(pennies, nickels, dimes, quarters);
		// Print object in dialog box
		JOptionPane.showMessageDialog(null, p1);
	}
}
