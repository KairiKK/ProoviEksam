package Maatriks;
import java.util.Arrays;

/**
 * Created by Kairi on 30.01.2016.
 *
 *
 * Koostage Java meetod, mis genereerib parameetrina etteantud n järgi niisuguse n korda n täisarvumaatriksi,
 * mille iga elemendi väärtuseks on selle elemendi reaindeksi ja veeruindeksi summa (indeksid algavad nullist).
 *
 *Write a method in Java to generate an integer matrix of size n x n (n is a parameter of the method) elements
 *of which are calculated by adding the row index and the column index of the element (indices start from zero).
 *
 */

public class Taisarvumaatriks {


        public static void main (String[] args) {
            int[][] res = liitmisTabel (9);
        }

        public static int[][] liitmisTabel (int n) {
            int [][] tulem  = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    tulem[i][j] = i + j;
                }
                System.out.println(Arrays.toString(tulem[i]));
            }
            return tulem; // TODO!!! Your code here
        }


}


