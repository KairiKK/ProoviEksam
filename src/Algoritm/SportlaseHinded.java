package Algoritm;
import java.util.Arrays;

/**
 * Created by Kairi on 30.01.2016.
 * <p>
 * <p>
 * Sportlase esinemist hindab n>2 kohtunikku. Hinnete hulgast eemaldatakse kõige madalam ja kõige kõrgem
 * ning leitakse ülejäänud n-2 hinde aritmeetiline keskmine.
 * Kirjutada Java-meetod hinde arvutamiseks. Parameetriks olevat massiivi muuta ei tohi.
 * <p>
 * <p>
 * There are n>2 judges and each gives a mark to sportsmans performance. Two extreme marks (one highest and one lowest)
 * are removed and artithmetical mean of remaining n-2 marks is calculated.
 * Write a Java method to determine the sportsmans result.
 * Do not change the array given as argument.
 */

public class SportlaseHinded {


    public static void main(String[] args) {
        System.out.println(result(new double[]{0., 1., 2.6, 2., 3., 4.}));
        // YOUR TESTS HERE
    }

    public static double result(double[] marks) {
        double[] tulem = new double[marks.length];

        for (int i = 0; i < marks.length; i++) {
            tulem[i] = marks[i];
        }

        Arrays.sort(tulem);
        double summa = 0;
        double keskmine;

        for (int i = 1; i < tulem.length - 1; i++) {
            summa += tulem[i];

        }

        keskmine = summa / (tulem.length - 2);
        return keskmine;  // TODO!!! YOUR PROGRAM HERE
    }


}
