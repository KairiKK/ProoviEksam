package Algoritm;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */

/*
konverteerida int[] -> List'ile ja kasutada "remove" meetodi https://docs.oracle.com/javase/8/docs/api/java/util/List.html#remove-java.lang.Object-
konstrueedita HashMap, kus on key => number ja value => palju selliseid numbrid on leitud
leida, kus HashMap'is value on suurem
int[] massiiv = {1,5,3,3,6,3,7,7};
List<Integer> listMassiiv = new ArrayList<Integer>();
for (int i = 0; index < massiiv.length; i++)
{
listMassiiv.add(massiiv[i]);
}
listMassiiv.remove(3);
 */

public class KuulusNumber {

    public static void main(String[] args) {
        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7

    ArrayList<Integer> tulemus = new ArrayList();
    ArrayList <Integer> moodid = new ArrayList();


    for (int i = 0; i < naide.length; i++) {
        if (naide[i] != 3) {
            tulemus.add(naide[i]);
        }
    }
    System.out.println(tulemus);

    int mood = 0;
    for (int i : tulemus) {

        int sagedus = Collections.frequency(tulemus, i);
        System.out.println(sagedus);


        if (sagedus == mood) {
            moodid.add(i);
        }

        if (sagedus > mood) {
            moodid.clear();
            moodid.add(i);
            mood = sagedus;
        }
    }
    System.out.println(moodid);
}
}



/* eemaldab ikka ainult 3.. :/
    public static void main(String[] args) {

        int[] massiiv = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
        List<Integer> tulem = new ArrayList<Integer>();
        for (int i = 0; i < massiiv.length ; i++) {
            tulem.add(massiiv[i]);
        }
        tulem.remove(3);
        System.out.println(tulem);
        }
    }
*/

   /* public static int loenda3 (int [] naide){
        for (int i = 0; i < naide.length; i++) {
       retur

    public static int eemaldaKolm (int [] naide){
        for (int i = 0; i < naide.length; i++) {

            if (naide[i] == 3) {

                Arrays.toString()
                System.out.println("tere");
            }

        }
        return 0;
    }
}*/
