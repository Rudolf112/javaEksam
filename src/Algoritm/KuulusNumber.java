package Algoritm;

import java.util.Arrays;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class KuulusNumber {

    public static void main(String[] args) {

        int counter = 0;
        int[] naide = {1, 5, 3, 3, 3, 7, 7}; // vastus on 7
        Arrays.sort(naide);
        System.out.println(Arrays.toString(naide));
        int count = 0, count2 = 0;
        int kuulsaimNumber = naide[0];
        for (int i = 0; i < naide.length ; i++) {
            if (naide[i]==kuulsaimNumber){
                count++;
            }
            else if (naide[i]==3){}
            else {
                count2++;

            }
        }
        System.out.println(kuulsaimNumber);
    }
}