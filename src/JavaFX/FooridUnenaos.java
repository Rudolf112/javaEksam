package JavaFX;


import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 */
class FooridUnenaos {

    Pane pane;
    Circle ring;

    FooridUnenaos() {meetod();}

    public void meetod(){
        Stage stage = new Stage();
        pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);

        for (int i = 0; i < 100; i++) {
            joonistaRing();
        }
        stage.setScene(scene);
        stage.show();
        ring.setOnMouseMoved( event -> {if (ring.getId()=="ring"){ring.setFill(Color.GREEN);}});

    }
    public void joonistaRing(){
        ring = new Circle();
        ring.setCenterX(Math.random()*500);
        ring.setCenterY(Math.random()*500);
        ring.setRadius(30);
        ring.setFill(Color.RED);
        ring.setId("ring");
        pane.getChildren().add(ring);
    }
}
