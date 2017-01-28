package OOP;

import java.util.Arrays;
import java.util.ArrayList;

/**
 * Created by rudolf on 28.01.2017.
 */
public class Sonaraamat {
    String keel;
    String[] vaste;
    ArrayList<String> sraamat = new ArrayList<>();
    ArrayList<String> vasted = new ArrayList<>();
    public Sonaraamat(String keelemaaramine){keel=keelemaaramine;}

    void sisestaSona(String sisestus){
        sraamat.add(sisestus);
    }
    String[] otsiEsimeseTaheJargi(String taht){
        vasted.clear();
        for (int i = 0; i < sraamat.size(); i++) {
            if (sraamat.get(i).startsWith(taht)){
            vasted.add(sraamat.get(i));
        }
        }
        String[] vastedvälja = new String[vasted.size()];
        for (int i = 0; i < vasted.size(); i++) {
            vastedvälja[i]=vasted.get(i);
        }
        return vastedvälja;
    }
    void eemaldaSona(String eemaldus){
        for (int i = 0; i < sraamat.size(); i++) {
            if (sraamat.get(i).startsWith(eemaldus)){
                sraamat.remove(i);
            }
        }
    }
    void misKeelesRaamatOn(){
        System.out.println(keel);
    }
}