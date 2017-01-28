package JavaFX;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */
public class PixelChaser {

    public PixelChaser() {meetod();}

    void meetod(){
        Stage stage = new Stage();
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);
        int originaalkorgus = 30;
        int originaallaius = 50;

        for (int i = 0; i < 100; i++) {
            Rectangle ristkulik = new Rectangle(Math.random()*500,Math.random()*500,originaallaius,originaalkorgus);
            ristkulik.setOnMouseClicked(event -> {
                System.out.println(ristkulik.getHeight());
                if (ristkulik.getHeight()==originaalkorgus){
                ristkulik.setHeight(ristkulik.getHeight()/2);
                ristkulik.setWidth(ristkulik.getWidth()/2);}
                else {ristkulik.setVisible(false);}
            });
            pane.getChildren().add(ristkulik);
        }
        stage.setScene(scene);
        stage.show();
    }

}
