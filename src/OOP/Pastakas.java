package OOP;

/**
 * Created by rudolf on 28.01.2017.
 */
public class Pastakas {
    private int tindiKogus;
    String tekst;
    char tyhikuDetektor = 0;
    String tyhikuDetektor2;
    public Pastakas(int tint){
        tindiKogus=tint;
    }

    public void kirjuta(String tekst){
        for (int i = 0;i < tekst.length(); i++){
            System.out.print(tekst.charAt(i));
            tindiKogus -= 1;
            tyhikuDetektor = tekst.charAt(i);
            tyhikuDetektor2 = Character.toString(tyhikuDetektor);
            if (tyhikuDetektor2.equals(" ")){tindiKogus += 1;}
            if (tindiKogus == 0) {break;}
        }
        System.out.println();
    }

    public void prindiPaljuTintiAlles(){
        System.out.println(tindiKogus);
    }
}
