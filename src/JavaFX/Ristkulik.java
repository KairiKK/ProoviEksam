package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguskordinaadid ja laius-kõrgus ning joonista talle ristkülik.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ristkulik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Label label = new Label("Sisesta ristküliku andmed");

      TextField algus = new TextField();
        algus.setPromptText("Alguskoordinaat 1");

        TextField algus2= new TextField();
        algus2.setPromptText("Alguskoordinaat 2");

        TextField sisendKorgus = new TextField();
        sisendKorgus.setPromptText("Siseta kõrgus");

        TextField sisendLaius = new TextField();
        sisendLaius.setPromptText("Sisesta laius");

        Rectangle rect = new Rectangle(50, 50);
        rect.setFill(Color.GREEN);

        algus.setOnAction(event1 -> rect.setX(algus.getTranslateX()));
       algus2.setOnAction(event1 -> rect.setY(algus2.getTranslateY()));
       sisendKorgus.setOnAction(event -> rect.setWidth(sisendKorgus.getWidth()));
        sisendLaius.setOnAction(event -> rect.setHeight(sisendLaius.getHeight()));


        VBox vBox = new VBox();

        vBox.getChildren().addAll(label, algus, algus2, sisendKorgus, sisendLaius, rect);

        Scene scene = new Scene(vBox, 1000, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
