package Maatriks;

/**
 * Loo 9*9 maatriks, millel on kujutatud liivakella. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 *
 * Näide
 * 0 0 0 0 0 0 0 0 0
 * . 0 0 0 0 0 0 0 .
 * . . 0 0 0 0 0 . .
 * . . . 0 0 0 . . .
 * . . . . 0 . . . .
 * . . . 0 0 0 . . .
 * . . 0 0 0 0 0 . .
 * . 0 0 0 0 0 0 0 .
 * 0 0 0 0 0 0 0 0 0
 *
 * näide https://www.dropbox.com/sh/3t4owsblcod4ojy/AACG0IMDCGfLC-bIjEYBi9nka?dl=0
 */
public class Liivakell {

    public static void main(String[] args) {
        for (int i = 0; i < 9 ; i++) {
            for (int j = 0; j < 9; j++) {
                if (i+j>=8 && i-j>=0 || i+j<=8 && i-j<=0){  //mõlemad tingimused täidetud, siis
                //(j == 4 || i == j || j + i == 8) {
                    System.out.print("0");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();

            }

        }

  /*  Liivakell, ehk püstine kikilips.
    int suurus = 90;
    for (int i = 0; i < suurus; i++) {
        for (int j = 0; j < suurus; j++) {
            if (i + j < suurus && i<=j) {
                System.out.print("0");
            } else if (i + j >= suurus -1 && i >= j) {
                System.out.print("0");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();
    } */

   /* // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(int[9][9] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }*/
}


/*      0.......0
        00.....00
        000...000
        0000.0000
        000000000
        0000.0000
        000...000
        00.....00
        0.......0

        if (i+j<9 && i-j>=0 || i+j>=8 && i-j<=0){ */