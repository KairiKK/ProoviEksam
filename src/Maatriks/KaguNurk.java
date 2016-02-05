package Maatriks;

import java.util.Arrays;

/**
 * Loo 9*9 suurune maatriks, millele tekib kagu suunaline nurkade muster, nagu näites.
 * Tundub raske? Sul tuleb lihtsalt veeru ja rea indeksi seos leida.
 *
 * Näide
 * 9 8 7 6 5 4 3 2 1
 * 8 8 7 6 5 4 3 2 1
 * 7 7 7 6 5 4 3 2 1
 * 6 6 6 6 5 4 3 2 1
 * 5 5 5 5 5 4 3 2 1
 * 4 4 4 4 4 4 3 2 1
 * 3 3 3 3 3 3 3 2 1
 * 2 2 2 2 2 2 2 2 1
 * 1 1 1 1 1 1 1 1 1
 *
 * Tundub raske? Leia seoseid rea ja veeru indeksi numbritega.
 */
public class KaguNurk {
    public static void main(String[] args) {
        int[][] maatriks = new int[9][9];
        printMaatriks(maatriks);

    }  //sulg, NB!!!

    // Lihtsalt abiline meetod, et maatriksit välja printida
   private static void printMaatriks(int[][] maatriks) {
       for (int i = 0; i < maatriks.length; i++) {
           for (int j = 0; j < maatriks.length; j++) {

           }
            System.out.println(Arrays.toString(maatriks[i]));
        }
        System.out.println();




      /*  for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                System.out.print(" "+Math.min(i, j));
            }
            System.out.println();

            Tulemus

            1 1 1 1 1 1 1 1
            1 2 2 2 2 2 2 2
            1 2 3 3 3 3 3 3
            1 2 3 4 4 4 4 4
            1 2 3 4 5 5 5 5
            1 2 3 4 5 6 6 6
            1 2 3 4 5 6 7 7
            1 2 3 4 5 6 7 8

            */
        }
    }


