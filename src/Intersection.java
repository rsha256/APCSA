import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.text.DecimalFormat;

public class Intersection extends Application {


    @Override
    public void start(Stage myStage) {
        // Below I set the title bar of my application
        myStage.setTitle("My Online Music Store - shopping cart checkout page");

        // Below I make an object of the GridPane class (rootNode) which I can use throughout the program to add nodes to the GridPane
        GridPane rootNode = new GridPane();
        // Below I set the horizontal and vertical gap to 5 pixels and then i align the root node to the center
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setAlignment(Pos.CENTER);

        // Below I create a scene with a width of 600, and a height of 650 along with the root node of the grid pane
        Scene myScene = new Scene(rootNode, 600, 650);

        // Below I set the scene in the stage and then I show the stage
        myStage.setScene(myScene);
        myStage.show();
    }

    // Below is the class for exiting the program
    class exitHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent exitProgram) {
            // Below I call the exit method on the Platform class to exit you out the program
            Platform.exit();
        }
    }
}