package JavaFX;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */
public class Koristaja {
    Circle ring;
    Pane pane;
    Label label;
    public Koristaja() {meetod();}

    public void meetod(){
        Stage stage = new Stage();
        pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        label = new Label();
        label.setText("KORISTATUD");
        label.setTranslateX(250);
        label.setTranslateY(250);
        pane.getChildren().add(label);
        for (int i = 0; i < 400; i++) {
            Circle ring = new Circle(Math.random()*500, Math.random()*500, 30);
            ring.setOnMouseEntered(event -> {ring.setVisible(false);});
            pane.getChildren().addAll(ring);
        }
        stage.setScene(scene);
        stage.show();
    }
}
