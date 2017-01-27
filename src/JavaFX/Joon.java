package JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Joon {
    int xStart, yStart, xEnd, yEnd;
    TextField askxStart = new TextField("x-alguskoordinaat");
    TextField askyStart = new TextField("y-alguskoordinaat");
    TextField askxEnd = new TextField("x-lõppkoordinaat");
    TextField askyEnd = new TextField("y-lõppkoordinaat");
    Button joonista = new Button("Joonista");
    Line line = new Line();
    public Joon() {startStage();}

    public void startStage() {
        Stage primaryStage = new Stage();
        VBox vbox = new VBox();
        vbox.setSpacing(2);
        Scene scene = new Scene(vbox, 500, 500);

        vbox.getChildren().addAll(askxStart, askyStart, askxEnd, askyEnd, joonista, line);
        joonista.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                xStart = Integer.parseInt(askxStart.getText());
                yStart = Integer.parseInt(askyStart.getText());
                yEnd = Integer.parseInt(askxEnd.getText());
                xEnd = Integer.parseInt(askxEnd.getText());
                line.setStartX(xStart);
                line.setStartY(yStart);
                line.setEndX(xEnd);
                line.setEndY(yEnd);
            }
        });
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
