import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class Unit14Lab1 extends Application {
    public void start(Stage myStage) {

        myStage.setTitle("Loan Calculator");

        // Make Root Node
        GridPane rootNode = new GridPane();
        rootNode.setPadding(new Insets(20));
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 400, 250);

        // Add Labels
        rootNode.add(new Label("Annual Interest Rate: "), 0,0);
        rootNode.add(new Label("Number Of Years: "), 0,1);
        rootNode.add(new Label("Loan Amount: "), 0,2);
        rootNode.add(new Label("Monthly Payment: "), 0,3);
        rootNode.add(new Label("Total Payment: "), 0,4);

        // Add Text Fields
        rootNode.add(new TextField(), 1,0);
        rootNode.add(new TextField(), 1,1);
        rootNode.add(new TextField(), 1,2);
        rootNode.add(new TextField(), 1,3);
        rootNode.add(new TextField(), 1,4);

        // Make Button
        Button calculate = new Button("Calculate");
        rootNode.add(calculate, 1,5);
        rootNode.setHalignment(calculate, HPos.RIGHT);

        myStage.setScene(myScene);
        myStage.show();

    }
}