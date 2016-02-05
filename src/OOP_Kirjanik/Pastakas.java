package OOP_Kirjanik;

/**
 * Created by Kairi on 5.02.2016.
 */
public class Pastakas {

        String EsimeneTekst = "Elu oleks palju lihtsam, kui meil oleks selle lahtekood.";
        String TeineTekst = "Oiged progejad ei kommenteeri oma koodi. Kui seda oli raske kirjutada, siis peab olema seda ka raske lugeda!";
        int kasTintiOn;
        int kasTintiOn2;

        public Pastakas(int tindiKogus) {

            kasTintiOn = tindiKogus;
        }

        public void kirjuta(String s) {
            int esimenetekst = 0;
            for (int i = 0; i < EsimeneTekst.length(); i++) {
                if (Character.isLetter(EsimeneTekst.charAt(i))) {
                    esimenetekst++;
                }
            }

            if (esimenetekst <= kasTintiOn) {
                System.out.println(EsimeneTekst);
            }else{
                //System.out.println(EsimeneTekst.substring(0, kasTintiOn));
            }

            int teinetekst = 0;
            for (int i = 0; i < TeineTekst.length(); i++) {
                if (Character.isLetter(TeineTekst.charAt(i))) {
                    teinetekst++;
                }
            }
            System.out.println(teinetekst);
            kasTintiOn2 = kasTintiOn - esimenetekst;
            System.out.println(kasTintiOn2);

            if (teinetekst < kasTintiOn) {
                System.out.println(TeineTekst);
            } else {

                System.out.println(TeineTekst.substring(0, kasTintiOn));
            }
        }

        public void prindiPaljuTintiAlles() {
            System.out.println(kasTintiOn2);
        }
}

   /* int tint;
    int kulutatudTint;
    int tintiAlles;

    public Pastakas(int tindiKogus) {
        tint = tindiKogus;
        System.out.println("Tindikogus: " + tint);
    }
    public void kirjuta(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isSpaceChar(c)) {
                count++;
            }
        }
        kulutatudTint = count;
        System.out.println("Kulutatud tint: " + kulutatudTint);
    }

    public void prindiPaljuTintiAlles() {
        tintiAlles = tint - kulutatudTint;
        System.out.println("Tinti alles: " + tintiAlles);
    }
}
*/
