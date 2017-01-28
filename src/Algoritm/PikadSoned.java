package Algoritm;

/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
 */
public class PikadSoned {
    public static void main(String[] args) {
        double summa = 0;
        int counter = 0;
        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3
        for (int i = 0; i < naide.length ; i++) {
            summa += naide[i].length();

        }
        double keskmine = summa/naide.length;

        for (int i = 0; i < naide.length; i++) {
            if (naide[i].length()>keskmine){
                counter += 1;
            }
        }
        System.out.println(counter);
    }


}
