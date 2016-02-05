package OOP_Raamatukogu;

import java.util.ArrayList;

/**
 * Created by Kairi on 5.02.2016.
 */
public class Sonaraamat {
    private String keel;
    private ArrayList<String> raamat = new ArrayList<>();


    Sonaraamat(String raamatuKeel) {
        raamatuKeel = keel;
    }

    public ArrayList sisestaSona(String sona) {
        raamat.add(sona);
        return raamat;
    }

    public String[] otsiEsimeseTaheJargi(String sona) {

        char esimeneT2ht = sona.charAt(0);

        int count = 0;

        ArrayList<String> koopia = new ArrayList<>();

        for (int i = 0; i < raamat.size(); i++) {
            if (raamat.get(i).charAt(0) == esimeneT2ht) {
                koopia.add(raamat.get(i));
                count++;
            }
        }
        String[] tulemus = new String[count];
        for (int i = 0; i < koopia.size(); i++) {
            tulemus[i] = koopia.get(i);
        }
        return tulemus;
    }

    public void eemaldaSona(String sona) {
        if (raamat.contains(sona)) {
            raamat.remove(sona);
        }
    }

    public String misKeelesRaamatOn() {
        return keel;
    }
}