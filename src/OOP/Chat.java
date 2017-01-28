package OOP;

import java.util.ArrayList;

/**
 * Created by rudolf on 28.01.2017.
 */
public class Chat {
    String tekst;
    private String toaNimi;
    ArrayList<String> sonumid = new ArrayList<>();
    ArrayList<String> kasutajanimed = new ArrayList<>();
    public Chat(String tekst){toaNimi=tekst;}

    void sisestaSonum(String nimi, String sonum){
        sonumid.add(sonum);
        kasutajanimed.add(nimi);
    }
    void prindiKoikSonumidKoosKasutajanimega(){
        for (int i = 0; i <  sonumid.size(); i++) {
            System.out.println(kasutajanimed.get(i) + ": " + sonumid.get(i));
        }
    }
    void adminKustutabSonumi(String kustutus){
        for (int i = 0; i <  sonumid.size(); i++) {
        if (kustutus.equals(sonumid.get(i))){
                sonumid.set(i, "Kustutatud admini poolt!");
            }
        }
    }
    void prindiToaNimi(){
        System.out.println(toaNimi);
    }
}
