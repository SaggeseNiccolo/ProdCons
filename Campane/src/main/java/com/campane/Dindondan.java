package com.campane;

/**
 *
 * @author User
 */
public class Dindondan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runnable c1 = new Campana("din", 3);
        Runnable c2 = new Campana("don", 3);
        Runnable c3 = new Campana("dan", 3);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);

        t1.start();
        t2.start();
        t3.start();
    }

}
