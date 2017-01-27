package JavaFX;


import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 */
class FooridUnenaos {

    FooridUnenaos() {meetod();}
        StackPane pane;
    public void meetod(){
        Stage stage = new Stage();
        StackPane  pane = new StackPane();
        Scene scene = new Scene(pane, 500, 500);

        for (int i = 0; i < 100; i++) {
            joonistaRing();
        }
        stage.setScene(scene);
        stage.show();
    }
    private void joonistaRing(){
        Circle ring = new Circle();
        ring.setCenterX(Math.random()*500);
        ring.setCenterY(Math.random()*500);
        ring.setRadius(30);
        ring.setFill(Color.RED);
        pane.getChildren().add(ring);
    }
}
