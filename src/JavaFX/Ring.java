package JavaFX;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt x, y kordinaadid ja raadius ning joonista talle ring.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ring {
    TextField askX = new TextField("xkoordinaat");
    TextField askY = new TextField("ykoordinaat");
    TextField raadius = new TextField("raadius");
    Button joonista = new Button("Joonista");
    Circle minuRing = new Circle();
    public Ring() {meetod();}

    private void meetod(){
        Stage stage = new Stage();
        Pane bp = new Pane();
        Scene scene = new Scene(bp, 500, 500);

        askX.setTranslateX(100);
        askY.setTranslateX(200);
        raadius.setTranslateX(300);
        joonista.setTranslateX(400);

        joonista.setOnAction(event ->{
            minuRing.setCenterX(Integer.parseInt(askX.getText()));
            minuRing.setCenterY(Integer.parseInt(askY.getText()));
            minuRing.setRadius(Integer.parseInt(raadius.getText()));
        });

        bp.getChildren().addAll(askX, askY, raadius, joonista, minuRing);
        stage.setScene(scene);
        stage.show();
    }
}
