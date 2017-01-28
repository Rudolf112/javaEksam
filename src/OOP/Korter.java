package OOP;

import java.util.ArrayList;

/**
 * Created by rudolf on 28.01.2017.
 */
public class Korter {
    int korteriSuurus;
    ArrayList<String> kylalised = new ArrayList();
    public Korter(int suurus){korteriSuurus=suurus;}

    void saabus(String kylaline){
        if (kylalised.size()<10){
        kylalised.add(kylaline);};
    }

    void prindiKylalisteArv(){
        System.out.println(kylalised.size());
    }

    void prindiPaljuVeelMahub(){
        System.out.println(korteriSuurus-kylalised.size());
    }

    void lahkus(String lahkuja){
        for (int i = 0; i < kylalised.size(); i++) {
            if (kylalised.get(i).equals(lahkuja)){
                kylalised.remove(i);
            }
        }
    }
}
