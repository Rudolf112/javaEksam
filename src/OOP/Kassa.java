package OOP;

import java.util.ArrayList;

/**
 * Created by rudolf on 28.01.2017.
 */
public class Kassa {
    String nimi;
    ArrayList<String> ostuTsekk = new ArrayList<>();
    public Kassa(String name){nimi=name;}

    void lisaToode(String toode){
        ostuTsekk.add(toode);
    }

    void eemaldaToode(String eemaldus){
        for (int i = 0; i < ostuTsekk.size(); i++) {
            if (ostuTsekk.get(i).equals(eemaldus)){
                ostuTsekk.remove(i);
            }
        }
    }
    void prindiOstutsekk(){
        for (int i = 0; i < ostuTsekk.size(); i++) {
            System.out.println(ostuTsekk.get(i));
        }
    }
    void prindiKassapidajaNimi(){
        System.out.println(nimi);
    }
}
