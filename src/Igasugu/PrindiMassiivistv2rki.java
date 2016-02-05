package Igasugu;
/**
 * Created by Kairi on 27.01.2016.
 */
public class PrindiMassiivistv2rki {

        //WHILE

    public static void main(String[] args) throws InterruptedException {

        String[] v2rk = {"Io", "Tu", "Lui/Lei", "Noi", "Voi", "Loro"};

        int loenda = 0;
        while (loenda < v2rk.length) {
            System.out.println(v2rk[loenda]);
            loenda = loenda + 1;

        }
        System.out.println("1...2...3....");

        Thread.sleep(3000);
        //DO...WHILE.. kuni tingimus täidetus

        String[] v2rk2 = {" ", "Sono", "Sei", "e", "Siamo", "Siete", "Sono"};

        int loenda2 = 0;
        do {
            System.out.println(v2rk2[loenda2]);
        loenda2 = loenda2 + 1;
        } while (loenda2 < v2rk2.length);
    }

}

