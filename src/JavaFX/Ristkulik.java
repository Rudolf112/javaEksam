package JavaFX;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguskordinaadid ja laius-kõrgus ning joonista talle ristkülik.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ristkulik {
    int algX, algY, laius, kõrgus;
    Rectangle ristkulik = new Rectangle();
    Button nupp = new Button("JOONISTA");
    TextField f1 = new TextField("sisesta algx");
    TextField f2 = new TextField("sisesta algy");
    TextField f3 = new TextField("sisesta laius");
    TextField f4 = new TextField("sisesta kõrgus");
    public Ristkulik() {meetod();}

    private void meetod(){
        Stage stage = new Stage();
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);

        f1.setTranslateX(100);
        f2.setTranslateX(200);
        f3.setTranslateX(300);
        f4.setTranslateX(400);

        nupp.setOnAction(event -> {
            algX = Integer.parseInt(f1.getText());
            algY = Integer.parseInt(f2.getText());
            laius = Integer.parseInt(f3.getText());
            kõrgus = Integer.parseInt(f4.getText());

            ristkulik.setX(algX);
            ristkulik.setY(algY);
            ristkulik.setWidth(laius);
            ristkulik.setHeight(kõrgus);
        });

        pane.getChildren().addAll(f1, f2, f3, f4, nupp, ristkulik);
        stage.setScene(scene);
        stage.show();
    }
}
