package JavaFX;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 */
public class Detektiiv {
    public Detektiiv() {meetod();}

    public void meetod() {
        Stage stage = new Stage();
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);

        Circle ring1 = new Circle(Math.random()*500, Math.random()*500, 30);
        ring1.setFill(Color.WHITE);
        Circle ring2 = new Circle(Math.random()*500, Math.random()*500, 30);
        ring2.setFill(Color.WHITE);
        Circle ring3 = new Circle(Math.random()*500, Math.random()*500, 30);
        ring3.setFill(Color.WHITE);

        pane.getChildren().addAll(ring1, ring2, ring3);
        stage.setScene(scene);
        stage.show();

        ring1.setOnMouseEntered(event ->
            ring1.setFill(Color.BLUE));
        ring2.setOnMouseEntered(event ->
                ring2.setFill(Color.BLUE));
        ring3.setOnMouseEntered(event ->
                ring3.setFill(Color.BLUE));

        System.out.println(ring1.getCenterX() + " -- " + ring1.getCenterY());
    }
}
