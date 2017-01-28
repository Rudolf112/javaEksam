package JavaFX;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile ring. Kui hiir ringile vastu läheb, leiab ring omale
 * uue koha. Ei pea animeerima ega midagi fäänsit. Lihtsalt ilmub uues kohas ja kõik.
 * Ehk hiirega saab ringi taga ajada. Kordan - ring leiab uue koha juba hiire puudutusest,
 * mitte klikist. Aga alustada võid muidugi klikist.
 */
public class Tagaajamine {
    Circle ring;
    public Tagaajamine() {meetod();}

    private void meetod(){
        Stage stage = new Stage();
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);

        ring = new Circle(Math.random()*500, Math.random()*500, 30);
        ring.setOnMouseMoved( event -> {
            ring.setCenterX(Math.random()*500);
            ring.setCenterY(Math.random()*500);
        });
        pane.getChildren().add(ring);
        stage.setScene(scene);
        stage.show();
    }
}
