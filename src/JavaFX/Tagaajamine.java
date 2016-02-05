package JavaFX;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile ring. Kui hiir ringile vastu läheb, leiab ring omale
 * uue koha. Ei pea animeerima ega midagi fäänsit. Lihtsalt ilmub uues kohas ja kõik.
 * Ehk hiirega saab ringi taga ajada. Kordan - ring leiab uue koha juba hiire puudutusest,
 * mitte klikist. Aga alustada võid muidugi klikist.
 */
public class Tagaajamine extends Application {

    Circle circle;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        circle = new Circle(80); //NB, siin ei tohi Circle circle =
        circle.setFill(Color.CORAL);
        circle.setCenterY(250);
        circle.setCenterX(250);

        pane.getChildren().add(circle);
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);

        runFromMouse();


        primaryStage.show();
    }

    //circle.setCursor(Cursor.DEFAULT);

    public void runFromMouse() {
        circle.setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {

                    circle.setTranslateX(Math.random() * (400));  //ilma korrutamiseta ei liigu
                    circle.setTranslateY(Math.random() * (400));




            }

        });
    }
}

/*
    public void reageeriHiirele() {
        circle.setOnMouseEntered(event -> {

            System.out.println("oi oi oi ");
            double x = Math.random()*500;
            double y = Math.random()*500;     // (double) Math.random()*500; --- (double??)
            circle.setTranslateX(x);
            circle.setTranslateY(y);
        });
    }

    //V6i

        circle.setTranslateX(Math.random() * (400 - circle.getTranslateX()));
        circle.setTranslateY(Math.random() * (400 - circle.getTranslateY()));
} */