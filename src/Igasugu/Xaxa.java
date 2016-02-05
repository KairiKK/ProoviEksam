import java.util.Scanner;

/**
 * Created by Kairi on 30.01.2016.
 */
public class Xaxa {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.println("Kirjuta pikk lause siia ... ");

        String text = scann.nextLine();

        System.out.println("Sisestasid: " + text);

        String a  = text;
        String b = asenda(a);

        System.out.println(a +  " >>> " + b);
    }

    public static String asenda(String a) {
        String asenda = "";
        for (int i = 0; i < a.length(); i++) {
            if (Character.isWhitespace(a.charAt(i))) {
                asenda +=  "-";
            } else {
                asenda += a.charAt(i);
            }

        }
        return asenda;
    }
}
