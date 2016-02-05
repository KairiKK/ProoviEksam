package OOP_Seljakott;

import java.util.ArrayList;

/**
 * Created by Kairi on 5.02.2016.
 */
public class Seljakott {
    private String omanikunimi;
    private ArrayList<String> asjad1 = new ArrayList<String>();



    public Seljakott(String omanikuNimi) {
        omanikunimi = omanikuNimi;
    }

    public void lisaAsi(String asi) {
        asjad1.add(asi);

    }

    public void eemaldaAsi(String asi) {

        asjad1.remove(asi);
    }

    public String misOnKotis() {
        return asjad1.toString();
    }

    public int mituAsjaOnKotis() {
        return asjad1.size();
    }

     public String omanikuNimi() {
        return omanikunimi;
    }

    public void rebene() {
        asjad1.removeAll(asjad1);
    }
}



//eemalda asi

  // mis on kotis

//rebeneb

//mis nüüd kotis
//mitu asja kotis