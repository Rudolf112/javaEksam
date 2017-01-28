package Algoritm;

/**
 * Antud on kaks massiivi õhu temperatuuridega. Arvuta mõlema puhul, mitu positiivset temperatuuri
 * on massiivis rohkem kui negatiivset.
 */
public class Suusailm {
    public static void main(String[] args) {
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        for (int i = 0; i < kraadid1.length; i++) {
            if (kraadid1[i] > 0){counter1++;}
            else if (kraadid1[i] < 0){counter2++;}
        }
        int absoluutväärtus = Math.abs(counter1-counter2);
        System.out.println(absoluutväärtus);
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13};
        for (int i = 0; i < kraadid2.length; i++) {
            if (kraadid2[i] > 0){counter3++;}
            else if (kraadid2[i] < 0){counter4++;}
        }
        int absoluutväärtus2 = Math.abs(counter3-counter4);
        System.out.println(absoluutväärtus2);
    }
}
