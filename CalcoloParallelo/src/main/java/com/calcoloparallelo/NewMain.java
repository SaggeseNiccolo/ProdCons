package com.calcoloparallelo;

/**
 *
 * @author User
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c;
        a = 2;
        b = 3;
        c = 4;

        System.out.println("Devo calcolare: 3 * (a - 1) + 2 * (b - 2) + 3 * (c - 3)");

        Buffer parziali = new Buffer(a, b, c);

        Operazione1 thr1 = new Operazione1(parziali);
        Operazione2 thr2 = new Operazione2(parziali);
        Operazione3 thr3 = new Operazione3(parziali);

        thr1.start();
        thr2.start();
        thr3.start();

        thr2.join();
        thr3.join();
        thr1.join();

        k = x + y + z;

        System.out.println("Ho calcolato il risultato finale k: " + k);
    }

}
