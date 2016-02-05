package Igasugu;
/**
 * Created by Kairi on 30.01.2016.
 * <p>
 * Koostada Java meetod, mis asendab parameetrina etteantud sõnes s kõik tühikud märgiga '-'.
 * Lahendus peab kasutama tsüklit.
 * <p>
 * Write a Java method to replace all spaces in a given string s by symbol '-'.
 * The solution must use a loop.
 */
public class TyhimikuvahetusKT2 {


    public static void main(String[] args) {
        String s = "Tere, TUDENG,   tore ARVUTI sul!";
        String t = asenda(s); // "Tere,-TUDENG,---tore-ARVUTI-sul!"
        System.out.println(s + " > " + t);
    }

    public static String asenda(String s) {
        String asenda = "";

        for (int i = 0; i < s.length(); i++) {

            if (Character.isWhitespace(s.charAt(i))) {
                asenda += '-';

            } else {
                asenda += s.charAt(i);

            }

        }

        return asenda;
    }

}
//Stringist ei saa küsida välja Charactar tüüpi tähte