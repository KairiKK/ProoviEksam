package Maatriks;
/**
 * Created by Kairi on 26.01.2016.
 */
/**
 * Prindi konsooli 10x100 maatriks, kus läheb joon sikk-sakk ülevalt alla.
 *
 * Näide:
 * x
 *  x
 *   x
 *    x
 *     x
 *      x
 *       x
 *        x
 *         x
 *          x
 *         x
 *        x
 *       x
 *      x
 *     x
 *    x
 *   x
 *  x
 * x
 *  x
 *   x
 *    x
 *     x
 *      jne.
 *
 * Kasuta mis iganes tähiseid soovid ülesande lahendamiseks.
 */
public class MaatriksSiksak {


  //töötab:

   public static void main(String[] args) {
        int[][] sakk = new int[100][10];
        printSakk(sakk);
    }

    private static void printSakk(int[][] sakk) {
        for (int i = 0; i < sakk.length; i++) {
            for (int j = 0; j < sakk[j].length; j++) {
                if (i == j) {
                    System.out.print("x");
                } else if ((i - (20 * (i / 20))) == j) {
                    System.out.print("x");
                } else if ((i - 20 - (20 * (i / 20)) == -j - 1)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}


   /* public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 100; j++) {
                if (i == j || i + j == 9 || j == 1) {
                    System.out.print("x");
                } else {
                    System.out.print("0");
                }
            }
        }System.out.println();

    }
} */





