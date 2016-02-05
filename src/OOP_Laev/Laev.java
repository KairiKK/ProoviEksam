package OOP_Laev;

import java.util.ArrayList;

/**
 * Created by Kairi on 31.01.2016.
 */
public class Laev {

    private ArrayList<String> reisijad = new ArrayList<String>();
    private int reisijateArv;
    private String nimi;

    Laev(String LaevaNimi) {

        nimi = LaevaNimi;
    }

    public ArrayList lisaReisija(String reisija) {
        reisijad.add(reisija);
        return reisijad;
    }

    public void eemaldaReisija(String reisija) {
        if (reisijad.contains(reisija)) {
            reisijad.remove(reisijad.indexOf(reisija));
        }
    }

    public ArrayList<String> votaReisijad() {
        return reisijad;

    }

    public int reisijateArv (){
        reisijateArv = reisijad.size();
        return reisijateArv;

    }

    public String misNimi(){
        return nimi;
    }

    public void kalaHammustasKummipaatiAugu() {
        reisijad.removeAll(reisijad);
        System.out.println("Appi!! Kala hammustas paati augu");
    }

}

   /* public void kalaHammustasKummipaatiAugu() {
        reisijad.remove(reisijad.indexOf(3));
        System.out.println("Appi!!"); */
    //lisaReisija
    //eemaldaReisija
    //votaReisijad
    //reisijateArv
    //misNimi
    //kalaHammustasKummipaatiAugu

