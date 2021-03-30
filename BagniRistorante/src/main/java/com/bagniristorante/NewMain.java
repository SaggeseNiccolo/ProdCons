package com.bagniristorante;

/**
 *
 * @author User
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bagno bagnoUomo = new Bagno();
        Bagno bagnoDonna = new Bagno();

        Runnable p1 = new Persona("uomo1", true, bagnoUomo);
        Runnable p2 = new Persona("donna1", false, bagnoDonna);
        Runnable p3 = new Persona("uomo2", true, bagnoUomo);
        Runnable p4 = new Persona("donna2", false, bagnoDonna);
        Runnable p5 = new Persona("uomo3", true, bagnoUomo);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);
        Thread t5 = new Thread(p5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

}
