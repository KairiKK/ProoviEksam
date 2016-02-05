/**
 * Created by Kairi on 26.01.2016.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * Joonista Ellipse, mille ringjoone paksust saab kasutaja slideriga muuta.
 */
    public class JavaFXEllips2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Ellipse ellipse = new Ellipse(250, 250, 100, 200);
        ellipse.setStrokeWidth(10);
        ellipse.setStroke(Color.GREENYELLOW);

        Slider slider = new Slider();
        slider.setMin(0);
        slider.setMax(500);

        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            ellipse.setStrokeWidth(newValue.intValue());
        });

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);


        pane.getChildren().addAll(ellipse, slider);
        primaryStage.setScene(scene);
        primaryStage.show();



    }
}
