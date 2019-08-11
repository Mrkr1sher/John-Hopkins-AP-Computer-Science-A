
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.rootNode;
import javafx.stage.Stage;

public class Unit15Lab1 extends Application {

    public void start(Stage myStage) {

        myStage.setTitle("Simple Calculator");

        rootNode rootNode = new rootNode();
        rootNode.setHgap(5);
        rootNode.setVgap(5);
        rootNode.setAlignment(Pos.CENTER);

        Scene scene = new Scene(rootNode, 400, 250);

        rootNode.add(new Label("First Value: "), 0, 0);
        rootNode.add(new Label("Second Value: "), 0, 1);
        rootNode.add(new Label("Sum is: "), 0, 2);

        TextField firstValue = new TextField();
        rootNode.add(firstValue, 1, 0);
        firstValue.setAlignment(Pos.BOTTOM_RIGHT);

        TextField secondValue = new TextField();
        rootNode.add(secondValue, 1, 1);
        secondValue.setAlignment(Pos.BOTTOM_RIGHT);

        TextField sum = new TextField();
        rootNode.add(sum, 1, 2);
        sum.setAlignment(Pos.BOTTOM_RIGHT);
        sum.setDisable(true);

        Button calculate = new Button("Calculate");
        rootNode.add(calculate, 1, 5);
        rootNode.setHalignment(calculate, HPos.LEFT);

        calculate.setOnAction(
                new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent e) {
                        sum.setText(String.valueOf(Double.parseDouble(firstValue.getText()) + Double.parseDouble(secondValue.getText())));
                    }
                });

        myStage.setScene(scene);
        myStage.show();
    }

}