package Maatriks;

import java.util.Arrays;

/**
 * Created by Kairi on 5.02.2016.
 */
public class LoodeNurk {

    public static void main(String[] args) {
        int[][] maatrix = new int[9][9];

        for (int i = 0; i < maatrix.length; i++) {
            for (int j = 0; j < maatrix.length; j++) {
                if (i > j) {
                    maatrix[i][j] =  i  ;
                } else {
                    maatrix[i][j] =  maatrix.length-i ;

                }

            }
        }
        printMaatrix(maatrix);
    }


    public static void printMaatrix (int [][] maatrix){
        for (int i = 0; i < maatrix.length; i++) {
            System.out.println(Arrays.toString(maatrix[i]));
        }
        System.out.println("");
    }
}
