/**
 * Created by Kairi on 30.01.2016.
 *
 *
 * Koostage Java meetod etteantud täisarvumaatriksi m veerumiinimumide massiivi leidmiseks
 * (massiivi j-ndaks elemendiks on maatriksi j-nda veeru vähima elemendi väärtus).
 * Arvestage, et m read võivad olla erineva pikkusega.
 * Write a method in Java to find the array of minimums of columns of a given matrix of integers m
 * (j-th element of the answer is the minimum of elements of the j-th column in the matrix).
 * Rows of m might be of different length.
 */
public class MaatriksKT {


        public static void main (String[] args) {
            int[] res = veeruMinid (new int[][] { {1,2,6,8,5,6,1,3,75,3,2}, {4,5,3,8,9,1,23,43,22,2,1} }); // {1, 2, 3}
            // YOUR TESTS HERE
        }

        public static int[] veeruMinid (int[][] m) {
            int min = 0;
            for (int i = 0; i < m.length; i++) {

            }
            return null;
        }

}

        /*circle.setOnMouseMoved(event -> {

            System.out.println("läksid vastu");
            double x = (double) Math.random()*500;
            double y = (double) Math.random()*500;
            circle.setTranslateX(x);
            circle.setTranslateY(y);

        });*/

// circle.setCenterX(Math.random());
// circle.setCenterY(Math.random());

                    /*for (int i = 10; i < 100; i++) {
                        for (int j = 9; j < 1000; j++) {
                           // circle.setCenterY(j);
                            circle.setCenterY(i);
                        }
for(int i = 30; i < 1000; i++) {
                circle.centerXProperty();}
                    }*/



        /*  circle.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent mouseEvent) {

                circle.setCenterX(Math.random());
                circle.setCenterY(Math.random());


            }
        }); */

       /* for (int i = 1; i < 100; i++) {
            for (int j = 9; j < 1000; j++) {
                circle.setCenterY(j);
                circle.setCenterY(i);
            }

        }
*/
//circle.setCenterX(Math.random());
// circle.setCenterY(Math.random());

