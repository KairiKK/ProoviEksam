package JavaFX;


import javafx.application.Application;
import javafx.geometry.Pos;
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
public class FooridUnenaos extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane stack = new StackPane();


        Circle a = new Circle(20, Color.RED);

        Circle b = new Circle(30, Color.RED);

        Circle c = new Circle(40, Color.RED);

        Circle d = new Circle(50, Color.RED);

        Circle e = new Circle(60, Color.RED);

        Circle f = new Circle(70, Color.RED);

        Circle g = new Circle(99, Color.RED);

        Circle h = new Circle(88, Color.RED);

        Circle i = new Circle(66, Color.RED);


        stack.setAlignment(a, Pos.TOP_CENTER);
        stack.setAlignment(b, Pos.TOP_LEFT);
        stack.setAlignment(c, Pos.TOP_RIGHT);
        stack.setAlignment(d, Pos.BASELINE_CENTER);
        stack.setAlignment(e, Pos.BOTTOM_RIGHT);
        stack.setAlignment(f, Pos. BOTTOM_LEFT);
        stack.setAlignment(g, Pos.TOP_LEFT);
        stack.setAlignment(h, Pos.CENTER_LEFT);
        stack.setAlignment(h, Pos.CENTER_RIGHT);

        a. setOnMouseMoved(event -> {
            a.setFill(Color.GREEN);
        });

        b. setOnMouseMoved(event -> {
            b.setFill(Color.GREEN);
        });
        c. setOnMouseMoved(event -> {
            c.setFill(Color.GREEN);
        });
        d. setOnMouseMoved(event -> {
            d.setFill(Color.GREEN);
        });
        e. setOnMouseMoved(event -> {
            e.setFill(Color.GREEN);
        });
        f. setOnMouseMoved(event -> {
            f.setFill(Color.GREEN);
        });
        g. setOnMouseMoved(event -> {
            g.setFill(Color.GREEN);
        });
        h. setOnMouseMoved(event -> {
            h.setFill(Color.GREEN);
        });
        i. setOnMouseMoved(event -> {
            i.setFill(Color.GREEN);
        });


        stack.getChildren().addAll(a, b, c, d, e, f, g, h, i);


        Scene scene = new Scene(stack, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
