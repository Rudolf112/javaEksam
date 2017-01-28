package OOP;

/**
 * Created by rudolf on 28.01.2017.
 */
public class Zelda {
    int elusid;

    public Zelda(int elud) {
        elusid = elud;
    }

    public void kaklusKolliga(int kolliElusid) {
        elusid -= kolliElusid;
    }

    public void prindiMituEluAlles() {
        System.out.println(elusid);
    }

    public void prindiKasOnElus() {
        if (elusid <= 0) {
            System.out.println("Surnud");
        } else {
            System.out.println("Elus");
        }
    }
}
